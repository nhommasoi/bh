package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import java.awt.ScrollPane;
import java.nio.channels.SelectionKey;

public class Setting_Room implements Screen{
    private Game game;
    private Stage stage;
    private SpriteBatch batch;
    private Skin skin;
    float h,w;
    private Texture background;



    public Setting_Room(Game game){
        batch=new SpriteBatch();
        stage=new Stage();
        Gdx.input.setInputProcessor(stage);
        h=Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();
        skin=new Skin(Gdx.files.internal("uiskin.json"));
        background=new Texture("raw_12.jpeg");




    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        batch.draw(background,0,0,w,h);
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
