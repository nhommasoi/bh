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
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class Setting implements Screen{
    private Game game;
    private Stage stage;
    private SpriteBatch batch;
    private Skin skin;

    private Texture background ,logout,support,fanpage;
    private Label lblmusic,lblrung,lblaudio,lblsetting;
    private CheckBox cbmusic,cbrung,cbaudio;
    private Label lblfanpage,lblsupport,lbllogout;



    public Setting(Game game){
        batch=new SpriteBatch();
        stage=new Stage();
        Gdx.input.setInputProcessor(stage);

        skin=new Skin(Gdx.files.internal("uiskin.json"));
        background=new Texture("raw_12.jpeg");
        support=new Texture("support.png");
        logout=new Texture("log_out.jpeg");
        fanpage=new Texture("fan_page.png");

        skin=new Skin(Gdx.files.internal(GameConstants.myskin));

        lblsetting=new Label("Setting",skin);
        lblsetting.setPosition(GameConstants.col_width,GameConstants.centerY+GameConstants.four_height);
        lblsetting.setFontScale(GameConstants.big_font);
        lblsetting.setColor(Color.BLACK);

        lbllogout =new Label("Log out",skin);
        lbllogout.setPosition(GameConstants.six_width,GameConstants.ten_height);


        lblsupport=new Label("support",skin);
        lblsupport.setPosition(GameConstants.four_width,GameConstants.ten_height);

        lblfanpage=new Label("fanpage",skin);
        lblfanpage.setPosition(GameConstants.row_height,GameConstants.ten_height);





        lblmusic=new Label("Music",skin);

        lblrung=new Label("Rung",skin);

        lblaudio=new Label("Audio",skin);
        cbaudio=new CheckBox("",skin);
        cbmusic=new CheckBox("",skin);
        cbrung=new CheckBox("",skin);



        Table table=new Table();

        table.add(lblmusic).height(GameConstants.six_height);
        table.add(cbmusic).width(GameConstants.col_width);
        table.add().row();
        table.add(lblaudio);
        table.add(cbaudio);
        table.add().row();
        table.add(lblrung).height(GameConstants.six_height);
        table.add(cbrung);




        table.setPosition(GameConstants.six_width,GameConstants.centerY);


        stage.addActor(table);
        stage.addActor(lblsetting);
        stage.addActor(lblfanpage);
        stage.addActor(lblsupport);
        stage.addActor(lbllogout);







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
        batch.draw(logout,GameConstants.six_width,GameConstants.six_height,GameConstants.big_iconimg,GameConstants.big_iconimg);
        batch.draw(support,GameConstants.four_width,GameConstants.six_height,GameConstants.big_iconimg,GameConstants.big_iconimg);
        batch.draw(fanpage,GameConstants.ten_width,GameConstants.six_height,GameConstants.big_iconimg,GameConstants.big_iconimg);


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
