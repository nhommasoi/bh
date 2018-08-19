package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;


public class Login implements Screen {

    float h,w;
    private Game game;
    private Stage stage;
    BitmapFont font;

    private SpriteBatch batch;

    private Texture backgroud ;
    private Texture iconfb;
    private Texture iconzl;
    private Texture icongoogle;
    private Label username;
    private Label pass;
    private Label txtlogin;
    private TextField tfusername;
    private TextField tfpasswork;



    Skin skin;

    public Login(Game game) {

        skin=new Skin(Gdx.files.internal("uiskin.json"));

            h=Gdx.graphics.getHeight();
            w=Gdx.graphics.getWidth();
        batch = new SpriteBatch();
        stage = new Stage();
        font=new BitmapFont();
        Gdx.input.setInputProcessor(stage);
        backgroud=new Texture(Gdx.files.internal("raw_user.jpeg"));

        iconfb=new Texture(Gdx.files.internal("raw_fb.jpg"));

        icongoogle=new Texture(Gdx.files.internal("raw_google.png" ));

        iconzl=new Texture(Gdx.files.internal("raw_zl.jpg"));



        username = new Label("USERNAME : ",skin);
        username.setFontScale(1f);

        username.setPosition(w/2-h/2,h/2+w/20);
        pass = new Label("PASSWORD : ",skin);
        pass.setFontScale(1f);

        pass.setPosition(w/2-h/2,h/2-w/20);



        txtlogin =new Label("LOGIN" ,skin);
        txtlogin.setPosition(w/2-h/10,h/2+w/6);
        txtlogin.setFontScale(5f);


        TextButton btnin=new TextButton("sign in",skin);
        btnin.setPosition(w/2-w/20,h/4);
        btnin.setSize(100,60);

        TextButton btnup=new TextButton("sign up",skin);


        btnup.setPosition(w/2+w/20,h/4);
        btnup.setSize(100,60);


        //tfname=new TextField("",skin);

        tfusername=new TextField("",skin);
        tfusername.setSize(350,60);
        tfusername.setPosition(w/2-h/6,h/2+w/20);

        tfpasswork=new TextField("",skin);
        tfpasswork.setPosition(w/2-h/6,h/2-w/20);
        tfpasswork.setSize(350,60);


        stage.addActor(btnin);
        stage.addActor(btnup);
        stage.addActor(tfusername);
        stage.addActor(tfpasswork);
        stage.addActor(username);
        stage.addActor(pass);
        stage.addActor(txtlogin);

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




        batch.draw(icongoogle,w/2-h/8, h/8);
        batch.draw(iconfb,w/2, h/8);

        batch.draw(iconzl ,w/2+h/8, h/8);



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
