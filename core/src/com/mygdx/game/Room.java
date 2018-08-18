package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Room implements Screen {
    private Game game;
    private Stage stage;
    BitmapFont font;
    private Label lb;
    private SpriteBatch batch;
    private Texture backgroud ;
    private Texture iconfb;
    private Texture iconzl;
    private Texture icongoogle;


    public Room(Game game) {
        batch = new SpriteBatch();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        backgroud=new Texture(Gdx.files.internal("raw_user.jpeg"));
        iconfb=new Texture(Gdx.files.internal("raw_fb.jpeg"));
        icongoogle=new Texture(Gdx.files.internal("raw_google.png" ));
        iconzl=new Texture(Gdx.files.internal("raw_zl.jpeg"));


         //Skin skin=new Skin(Gdx.files.internal("data/ui.json"));
        //TextButton btnlogic=new TextButton("click",skin);
       // btnlogic.setPosition(300,300);
       // btnlogic.setSize(300,60);
       // stage.addActor(btnlogic);

    }



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        batch.draw(backgroud,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
       batch.draw(iconfb,0, 0);
       iconfb.setFilter(Texture.TextureFilter.MipMap, Texture.TextureFilter.MipMap);
        //batch.draw(icongoogle,0,50);
        //batch.draw(iconfb,0,100);

        stage.act(delta);
        stage.draw();
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
