package heightmapexporter;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        TerrainQuad(heightmap);
        Image(grayscale/lumiance ???);
        ImageRaster(image);

        for (int y=0; y++; TerrainQuad.getLenght ()) {
            for (int x=0; x++; TerrainQuad.getLenght () {
                TerrainQuad.getHeight(x, y);
                ImageRaster.setPixel();
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
