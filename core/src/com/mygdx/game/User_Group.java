package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;


public class User_Group implements Screen {

    private SpriteBatch batch;
    private Texture background,icon,imggold;
    private Label lblTennguoichoi,lblgold;
    private TextButton btnsansang;
    private TextButton btnnext;
    private Label lbluser1,lbluser2,lbluser3,lbluser4,lbluser5,
            lbluser6,lbluser7,lbluser8,lbluser9;
    private  Label lblgold1 ,lblgold2;


    private Stage stage;


    private Game game;
    Skin skin;
    public  User_Group(Game game){
        stage=new Stage();

    batch=new SpriteBatch();

    skin=new Skin(Gdx.files.internal(GameConstants.myskin));
    background=new Texture(Gdx.files.internal("raw_user_group.png"));
        imggold=new Texture(Gdx.files.internal("raw_gold.jpeg"));
        icon=new Texture("raw1.png");
        lblTennguoichoi=new Label("Phu ",skin);
        lblTennguoichoi.setFontScale(GameConstants.font);
        lblTennguoichoi.setPosition(GameConstants.fourty_width,GameConstants.ten_height-GameConstants.sixty_height);


        lblgold=new Label("5000",skin);
        lblgold.setPosition(GameConstants.four_width +GameConstants.sixty_width,GameConstants.sixty_height);
        lblgold.setFontScale(GameConstants.font);


        lblgold1 =new Label("motisson",skin);
       lblgold1.setPosition(GameConstants.col_width,GameConstants.screenHeight-GameConstants.sixty_height);
        lblgold1.setFontScale(GameConstants.font);
        lblgold2=new Label("80000",skin);
        lblgold2.setFontScale(GameConstants.font);
         lblgold2.setPosition(GameConstants.col_width,GameConstants.screenHeight-GameConstants.row_height);

        btnsansang=new TextButton("Ready ",skin);
        btnsansang.setPosition(GameConstants.six_width,GameConstants.centerY);
        btnsansang.setSize(GameConstants.six_width,GameConstants.row_height);
        btnsansang.setColor(Color.ORANGE);
        btnsansang.setScale(GameConstants.font);


        btnnext=new TextButton("",skin);
        btnnext.setColor(Color.RED);
        btnnext.setSize(GameConstants.sixty_width,GameConstants.sixty_width);

        btnnext.setPosition(GameConstants.twenty_width ,GameConstants.screenHeight-GameConstants.row_height);


        lbluser1=new Label("user1",skin);
        lbluser1.setFontScale(GameConstants.font);

        lbluser2=new Label("user2",skin);
        lbluser2.setFontScale(GameConstants.font);
        lbluser3=new Label("user3",skin);
        lbluser3.setFontScale(GameConstants.font);
        lbluser4=new Label("user4",skin);
        lbluser4.setFontScale(GameConstants.font);
        lbluser5=new Label("user5",skin);
        lbluser5.setFontScale(GameConstants.font);
        lbluser6=new Label("user6",skin);
        lbluser6.setFontScale(GameConstants.font);
        lbluser7=new Label("user7",skin);
        lbluser7.setFontScale(GameConstants.font);
        lbluser8=new Label("user8",skin);
        lbluser8.setFontScale(GameConstants.font);
        lbluser9=new Label("user9",skin);
        lbluser9.setFontScale(GameConstants.font);


        final Table tableuser=new Table();
      tableuser.setPosition(GameConstants.centerX+GameConstants.six_width,GameConstants.centerY-GameConstants.sixty_height);
        tableuser.setSize(GameConstants.col_width,GameConstants.row_height);


        tableuser.add(lbluser1).width(GameConstants.six_width).height(GameConstants.row_height);
        tableuser.add(lbluser2).width(GameConstants.six_width);
        tableuser.add(lbluser3).width(GameConstants.six_width);
        tableuser.add().row();

        tableuser.add(lbluser4).width(GameConstants.six_width).height(GameConstants.row_height);
        tableuser.add(lbluser5).width(GameConstants.six_width);
        tableuser.add(lbluser6).width(GameConstants.six_width);
        tableuser.add().row();


        tableuser.add(lbluser7).width(GameConstants.six_width).height(GameConstants.row_height);
        tableuser.add(lbluser8).width(GameConstants.six_width);
        tableuser.add(lbluser9).width(GameConstants.six_width);








        stage.addActor(tableuser);
        stage.addActor(lblgold);
        stage.addActor(lblTennguoichoi);
        stage.addActor(btnsansang);
        stage.addActor(btnnext);
        stage.addActor(lblgold1);
        stage.addActor(lblgold2);

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
        batch.draw(imggold,GameConstants.four_width,GameConstants.sixty_height,GameConstants.iconimg,GameConstants.iconimg);
        batch.draw(icon,GameConstants.sixty_width,GameConstants.ten_height,GameConstants.row_height,GameConstants.row_height);

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
