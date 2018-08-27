package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;


import java.awt.ScrollPane;
import java.nio.channels.SelectionKey;

public class Setting_Room implements Screen{

    private Game game;
    private Stage stage;
    private SpriteBatch batch;
    private Skin skin;

    private Texture background;
    private Label lblroiphong,lblcaidat,lblsuport;
    private Button btnroiphong,btncaidat,btnsuport;



    public Setting_Room(Game game){
        batch=new SpriteBatch();
        stage=new Stage();


        skin=new Skin(Gdx.files.internal("uiskin.json"));

        background=new Texture("raw_12.jpeg");
        skin=new Skin(Gdx.files.internal(GameConstants.myskin));



        lblroiphong=new Label("exit room",skin);


        lblcaidat=new Label("setting",skin);

        lblsuport=new Label("support",skin);

        btnroiphong=new Button(skin);
        btnroiphong.setColor(Color.RED);

        btncaidat=new Button(skin);
        btncaidat.setColor(Color.RED);

        btnsuport=new Button(skin);
        btnsuport.setColor(Color.RED);


        Table table=new Table();
        table.add(btnroiphong).left();
        table.add(lblroiphong).center().height(GameConstants.row_height);
        table.add().row();
        table.add(btncaidat).left();
        table.add(lblcaidat).center();
        table.add().row();
        table.add(btnsuport).left();
        table.add(lblsuport).center().height(GameConstants.row_height);
        table.setPosition(GameConstants.screenWidth-GameConstants.col_width,GameConstants.screenHeight -GameConstants.four_height);


        stage.addActor(table);








    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        batch.draw(background,0,0,GameConstants.screenWidth,GameConstants.screenHeight);
        batch.end();
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
