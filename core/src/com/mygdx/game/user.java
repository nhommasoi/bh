package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.utils.viewport.ScreenViewport;




public class user implements Screen {

    float w,h;
    private SpriteBatch batch;
    private Texture background;
    private Texture icon;


    private Sprite sprite;


    private Stage stage;

    private Game game;

    private Skin skin;
    private Label txtid,txtuser ,txtlevel , txtwin,txtlose;
    private Label labelid,labeluser;
    private Label labellevel ,labelwin,labellose;



    public  user(Game game){
        h=Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();
        skin=new Skin(Gdx.files.internal("uiskin.json"));



        batch = new SpriteBatch();
        stage = new Stage();


        background=new Texture("raw_12.jpeg");

        icon=new Texture("raw1.png");

        txtid=new Label("ID :" ,skin);
        txtid.setPosition(w/2, h/2 + w/10);
        txtid.setFontScale(2f);

        labelid=new Label("0101",skin);
        labelid.setFontScale(2f);
        labelid.setPosition(w/2+h/4,h/2 + w/10);



        txtuser =new Label("User :",skin);
        txtuser.setPosition(w/2,h/2+30);
        txtuser.setFontScale(2f);

        labeluser=new Label("phu",skin);
        labeluser.setFontScale(2f);
       labeluser.setPosition(w/2+h/4,h/2+30);





        txtlevel=new Label("Level :",skin);
        txtlevel.setPosition(w/2,h/2-w/20);
        txtlevel.setFontScale(2f);

        labellevel=new Label("000 ",skin);
        labellevel.setPosition(w/2+h/4,h/2-w/20);
        labellevel.setFontScale(2f);



        txtwin=new Label( "Win :",skin);
        txtwin.setPosition(w/2-h/8,h/4);
        txtwin.setFontScale(2f);

        labelwin=new Label( "1",skin);
        labelwin.setPosition(w/2+h/8,h/4);
        labelwin.setFontScale(2f);

        txtlose=new Label("Lose :",skin);
        txtlose.setPosition(w/2 +h/4,h/4);
        txtlose.setFontScale(2f);

        labellose=new Label( "10",skin);
        labellose.setPosition(w/2 +h/2,h/4);
        labellose.setFontScale(2f);

        stage=new Stage(new ScreenViewport());
        stage.addActor(txtid);
        stage.addActor(txtuser);
        stage.addActor(txtlevel);
        stage.addActor(txtwin);
        stage.addActor(txtlose);
        stage.addActor(labelid);
        stage.addActor(labeluser);
        stage.addActor(labellevel);
        stage.addActor(labellose);
        stage.addActor(labelwin);


    }
    @Override
    public void dispose () {
        batch.dispose();

    }

    @Override
    public void show() {
        
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

        batch.draw(icon,w/4-(icon.getWidth()/2), h/2);
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
