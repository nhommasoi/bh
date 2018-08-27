package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Home implements Screen{
    private Game game;
    private Texture background ,imggold,icon;
    private SpriteBatch batch;
    private Stage stage;
    private Skin skin;
    private Label lblTennguoichoi,lblgold ,lbllistfriend;
    private TextButton btnchoi,btnchonban;




    public  Home(Game game){
        batch=new SpriteBatch();
        stage=new Stage();
        skin=new Skin(Gdx.files.internal(GameConstants.myskin));
        background=new Texture(Gdx.files.internal("background_home.jpeg"));

        imggold=new Texture(Gdx.files.internal("raw_gold.jpeg"));
        icon=new Texture("raw1.png");
        lblTennguoichoi=new Label("Phu ",skin);
        lblTennguoichoi.setFontScale(GameConstants.font);
        lblTennguoichoi.setPosition(GameConstants.screenWidth-GameConstants.fourty_width,GameConstants.ten_height-GameConstants.sixty_height);


        lblgold=new Label("5000",skin);
        lblgold.setPosition(GameConstants.screenWidth -GameConstants.four_width,GameConstants.sixty_height);
        lblgold.setFontScale(GameConstants.font);

        lbllistfriend=new Label("List Friends",skin);
        lbllistfriend.setPosition(GameConstants.four_width,GameConstants.centerY+GameConstants.four_height);
        lbllistfriend.setFontScale(GameConstants.cen_font);


        btnchoi=new TextButton("Choi ngay",skin);
        btnchoi.setColor(1f,0f,1,1);
        btnchoi.setSize(GameConstants.col_width,GameConstants.ten_height);
        btnchoi.setPosition(GameConstants.centerX +GameConstants.six_width,GameConstants.centerY+GameConstants.six_height);


        btnchonban=new TextButton("Chon ban",skin);
        btnchonban.setPosition(GameConstants.centerX +GameConstants.six_width,GameConstants.centerY);
        btnchonban.setSize(GameConstants.col_width,GameConstants.ten_height);
        btnchonban.setColor(1f,1f,1.2f,1.5f);

        Table table=new Table(skin);
        table.setColor(1,0,0,1.5f);
        table.setPosition(GameConstants.four_width,GameConstants.centerY);
        table.setSize(GameConstants.col_width,GameConstants.row_height);
        //table.add(lbllistfriend);
        Label lb=new Label("sndj",skin);
        table.add(lb);



        stage.addActor(table);
        stage.addActor(lblTennguoichoi);
        stage.addActor(lblgold);
        stage.addActor(btnchoi);
        stage.addActor(btnchonban);
        stage.addActor(lbllistfriend);



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

        batch.draw(imggold,GameConstants.screenWidth-(GameConstants.four_width +GameConstants.sixty_width),GameConstants.sixty_height,GameConstants.iconimg,GameConstants.iconimg);
        batch.draw(icon,GameConstants.screenWidth-GameConstants.twelve_width,GameConstants.ten_height,GameConstants.row_height,GameConstants.row_height);

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
