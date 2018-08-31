package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class flash implements Screen

{
    private Game game;
    SpriteBatch batch;
    AssetManager assetManager;
    Texture loadstart ,loadend;

    public flash (Game game){
        batch=new SpriteBatch();
        assetManager=new AssetManager();
       // assetManager.load("12.png",Texture.class);
       // assetManager.load("2.jng",Texture.class);

       // loadstart=assetManager.get("12.png",Texture.class);
        //loadend=assetManager.get("2.jng",Texture.class);




    }




    @Override
    public void show() {



    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_BLUE_BITS);
        batch.begin();

        //batch.draw(loadstart,0,0);
       // batch.draw(loadend,0,0);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
