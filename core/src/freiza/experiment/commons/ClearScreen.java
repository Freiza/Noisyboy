package freiza.experiment.commons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Gen on 10/24/2016.
 */
public class ClearScreen {

    private ClearScreen(){}

    public static void clear(){
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
