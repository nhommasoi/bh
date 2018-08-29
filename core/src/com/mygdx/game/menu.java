package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class menu implements Screen {


    private Game game;
    private Stage stage;
    //private TextField b;




    public menu(Game g) {
        game=g;
        stage=new Stage();
        Gdx.input.setInputProcessor(stage);

        Skin skin=new Skin(Gdx.files.internal("uiskin.json"));

        //tfusername=new java.awt.TextField("",skin);

        TextButton btnUser=new TextButton("click",skin);




        TextField b=new TextField("",skin);
        //text=new TextField(" ",skin);
       //text.setPosition(300,300);
       // text.setSize(100,200);
        //stage.addActor(text);
        stage.addActor(btnUser);



    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();


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
