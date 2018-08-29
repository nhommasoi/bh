package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


public class user implements Screen {

    private SpriteBatch batch;
    private Texture background;
    private Texture icon;





    private Stage stage;

    private Game game;

    private Skin skin;
    private Label txtid,txtuser ,txtlevel , txtwin,txtlose;
    private Label lblid,lbluser;
    private Label lbllevel ,lblwin,lbllose;




    public  user(Game game){


        skin=new Skin(Gdx.files.internal(GameConstants.myskin));



        batch = new SpriteBatch();
        stage = new Stage();


        background=new Texture("raw_12.jpeg");

        icon=new Texture("raw1.png");

        txtid=new Label("ID :" ,skin);

        txtid.setFontScale(GameConstants.big_font);

        lblid=new Label("0101",skin);
        lblid.setFontScale(GameConstants.big_font);




        txtuser =new Label("User :",skin);

        txtuser.setFontScale(GameConstants.big_font);

        lbluser=new Label("phu",skin);
        lbluser.setFontScale(GameConstants.big_font);






        txtlevel=new Label("Level :",skin);

        txtlevel.setFontScale(GameConstants.big_font);

        lbllevel=new Label("000 ",skin);

        lbllevel.setFontScale(GameConstants.big_font);



        txtwin=new Label( "Win :",skin);
        txtwin.setPosition(GameConstants.centerX-GameConstants.row_height,GameConstants.four_height);
        txtwin.setFontScale(GameConstants.big_font);

        lblwin=new Label( "1",skin);
       lblwin.setPosition(GameConstants.centerX+GameConstants.row_height,GameConstants.four_height);
        lblwin.setFontScale(GameConstants.big_font);

        txtlose=new Label("Lose :",skin);
        txtlose.setPosition(GameConstants.centerX+GameConstants.four_height,GameConstants.four_height);
        txtlose.setFontScale(GameConstants.big_font);

        lbllose=new Label( "10",skin);
        lbllose.setPosition(GameConstants.centerX +GameConstants.centerY,GameConstants.four_height);
        lbllose.setFontScale(GameConstants.big_font);

        Table table=new Table();
        table.setPosition(GameConstants.centerX +GameConstants.col_width , GameConstants.screenHeight-(GameConstants.four_height+GameConstants.row_height));
        table.add(txtid).left();
        table.add(lblid).right();
        table.add().row();
        table.add(txtuser).left();
        table.add(lbluser).right();
        table.add().row();
        table.add(txtlevel).left();
        table.add(lbllevel).right();


        stage=new Stage(new ScreenViewport());
        stage.addActor(table);


        stage.addActor(txtwin);
        stage.addActor(txtlose);


        stage.addActor(lbllose);
        stage.addActor(lblwin);


    }
    @Override
    public void dispose () {
        batch.dispose();

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
        
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        batch.begin();

        batch.draw(background,0,0,GameConstants.screenWidth,GameConstants.screenHeight);

        batch.draw(icon,GameConstants.screenWidth/4-(icon.getWidth()/2), GameConstants.centerY);
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

}
