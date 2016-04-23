package heightmapexporter;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.texture.Image;
import com.jme3.texture.image.ImageRaster;
import com.jme3.util.BufferUtils;
import java.nio.ByteBuffer;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    private Node terrain;
    private TerrainQuad terrainQuad;
    private String track;
    
    Image heightmap;
    private ImageRaster imageRaster;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        terrain = (Node) getAssetManager().loadModel("Tracks/" + track + "/Scenes/terrain_1.j3o");
        terrainQuad = (TerrainQuad)terrain.getChild("terrain-terrain_1_node");
        // terrainQuad.getHeightMap();

        heightmap = new Image();
        // int width = image.getWidth();
        // int height = image.getHeight();
        // ByteBuffer data = BufferUtils.createByteBuffer( (int)Math.ceil(newFormat.getBitsPerPixel() / 8.0) * width * height);
        // Image convertedImage = new Image(newFormat, width, height, data,null, image.getColorSpace());
        // heightmap = new Image(grayscale/lumiance ???);
        
        imageRaster = ImageRaster.create(heightmap);

        float height;
        for(int y=0; y<terrainQuad.getTerrainSize(); y++) {
            for(int x=0; x<terrainQuad.getTerrainSize(); x++) {
                height = terrainQuad.getHeight(new Vector2f(x, y));
                imageRaster.setPixel(x, y, new ColorRGBA(height, 0, 0, 0));
            }
        }
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
