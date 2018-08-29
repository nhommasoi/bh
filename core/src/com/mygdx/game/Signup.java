package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Signup implements Screen {
    private Game game;
    private Stage stage;
    private  SpriteBatch batch;
    float h,w;
    Skin skin;
    private Texture background;
    private Label labeluser1,labeluser2,labeluser3,labeluser4,labelsignup;
    private TextButton   btnsignup;
    private TextField tfuser,tfpass,tfgainpass,tfbirthday;


    public Signup(final Game game){
        stage=new Stage();

        batch=new SpriteBatch();
        h= Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();
        skin=new Skin(Gdx.files.internal("uiskin.json"));
        background=new Texture(Gdx.files.internal("sign_up.jpeg"));

        labelsignup=new Label("sign up",skin);
        labelsignup.setFontScale(GameConstants.big_font);
        labelsignup.setPosition(GameConstants.centerX-GameConstants.twenty_width,GameConstants.screenHeight-GameConstants. six_height);


        labeluser1=new Label("user",skin);
        labeluser1.setFontScale(GameConstants.font);

        labeluser2=new Label("pass",skin);
        labeluser2.setFontScale(GameConstants.font);

        labeluser3=new Label("again pass",skin);
        labeluser3.setFontScale(GameConstants.font);

        labeluser4=new Label("birthday",skin);
        labeluser4.setFontScale(GameConstants.font);

        tfuser=new TextField("",skin);
        tfpass=new TextField("",skin);
        tfgainpass=new TextField("",skin);
        tfbirthday=new TextField("",skin);





        btnsignup=new TextButton("Sign up ",skin);
        btnsignup.setPosition(GameConstants.four_width,GameConstants.centerY-GameConstants.row_height);
        btnsignup.setSize(GameConstants.col_width,GameConstants.row_height);
        btnsignup.setColor(Color.ORANGE);
        btnsignup.setScale(GameConstants.font);

        btnsignup.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {

                game.setScreen(new Home(game));
            }
        });



        final Table table =new Table();
        table.setPosition(GameConstants.centerX,GameConstants.centerY);

        table.add(labeluser1).left();
        table.add(tfuser).width(GameConstants.four_width);
        table.add().row();
        table.add(labeluser2).left().height(GameConstants.ten_height);
        table.add(tfpass).width(GameConstants.four_width);
        table.add().row();
        table.add(labeluser3);
        table.add(tfgainpass).width(GameConstants.four_width);
        table.add().row();
        table.add(labeluser4).left().height(GameConstants.ten_height);
        table.add(tfbirthday).width(GameConstants.four_width);
        table.add().row();
        table.add().height(GameConstants.six_height);
        table.add(btnsignup).center().height(GameConstants.ten_height);
        stage.addActor(table);


        stage.addActor(labelsignup);



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
