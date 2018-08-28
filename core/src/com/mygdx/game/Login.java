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
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;


public class Login implements Screen {


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
    private  TextButton btnin;


    Skin skin;

    public Login(final Game game) {

        skin=new Skin(Gdx.files.internal(GameConstants.myskin));


        batch = new SpriteBatch();
        stage = new Stage();
        font=new BitmapFont();
        Gdx.input.setInputProcessor(stage);
        backgroud=new Texture(Gdx.files.internal("raw_user.jpeg"));

        iconfb=new Texture(Gdx.files.internal("raw_fb.jpg"));

        icongoogle=new Texture(Gdx.files.internal("raw_google.png" ));

        iconzl=new Texture(Gdx.files.internal("raw_zl.jpg"));



        username = new Label("Username : ",skin);
        username.setFontScale(GameConstants.font);

        username.setPosition(GameConstants.centerX-GameConstants.centerY,GameConstants.centerY+GameConstants.twenty_height);
        pass = new Label("Password : ",skin);
        pass.setFontScale(GameConstants.font);

        pass.setPosition(GameConstants.centerX-GameConstants.centerY,GameConstants.centerY-GameConstants.twenty_height);



        txtlogin =new Label("LOGIN" ,skin);
        txtlogin.setPosition(GameConstants.centerX-GameConstants.ten_height,GameConstants.centerY+GameConstants.six_width);
        txtlogin.setFontScale(GameConstants.big_font);




        btnin=new TextButton("sign in",skin);
        btnin.setPosition(GameConstants.centerX-GameConstants.twenty_width,GameConstants.four_height);
        btnin.setSize(GameConstants.ten_width,GameConstants.ten_height);
        btnin.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                game.setScreen(new Home(game));
            }
        });

        TextButton btnup=new TextButton("sign up",skin);


        btnup.setPosition(GameConstants.centerX+GameConstants.sixty_width,GameConstants.four_height);
        btnup.setSize(GameConstants.ten_width,GameConstants.ten_height);
        btnup.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                    game.setScreen(new Signup(game));
            }
        });


        tfusername=new TextField("",skin);
        tfusername.setSize(GameConstants.four_width+GameConstants.twenty_width,GameConstants.row_height);
        tfusername.setPosition(GameConstants.centerX-GameConstants.six_height,GameConstants.centerY+GameConstants.twenty_height);

        tfpasswork=new TextField("",skin);
        tfpasswork.setPosition(GameConstants.centerX-GameConstants.six_height,GameConstants.centerY-GameConstants.twenty_height);
        tfpasswork.setSize(GameConstants.four_width+GameConstants.twenty_width,GameConstants.row_height);
        Table table=new Table();
        table.add(username);
        table.add(tfusername).width(GameConstants.four_width+GameConstants.twenty_width).height(GameConstants.row_height);
        table.add().row();
        table.add(pass).height(GameConstants.six_height);
        table.add(tfpasswork).width(GameConstants.four_width+GameConstants.twenty_width).height(GameConstants.row_height);
        table.setPosition(GameConstants.centerX,GameConstants.centerY+GameConstants.sixty_height);
        //table.setSize(GameConstants.centerX,GameConstants.centerY+GameConstants.ten_height);



        stage.addActor(btnin);
        stage.addActor(btnup);
       // stage.addActor(tfusername);
       // stage.addActor(tfpasswork);
        //stage.addActor(username);
       // stage.addActor(pass);
        stage.addActor(table);
        stage.addActor(txtlogin);

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

        batch.draw(backgroud,0,0,GameConstants.screenWidth,GameConstants.screenHeight);




        batch.draw(icongoogle,GameConstants.centerX, GameConstants.row_height,GameConstants.iconimg,GameConstants.iconimg);
        batch.draw(iconfb,GameConstants.centerX+GameConstants.twenty_width,  GameConstants.row_height,GameConstants.iconimg,GameConstants.iconimg);

        batch.draw(iconzl ,GameConstants.centerX+GameConstants.ten_width,  GameConstants.row_height,GameConstants.iconimg,GameConstants.iconimg);



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
