package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;

import java.util.ArrayList;


public class Room implements Screen {

    private Game game;
    private Stage stage;
    private Texture texture,texturetop,imggold ,icon;
    private SpriteBatch batch;
    private TextButton btnnew,btnchoi,btntimkiem;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTextureRegionDrawable;
    private Label labelTennguoichoi;
    private Label labelgold;
    private TextField tfseach;
    float w,h;

    List<Phong> phongList;




    Skin skin;


    public Room(Game game) {

        Gdx.input.setInputProcessor(stage);

        h=Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();
        icon=new Texture("raw1.png");
        texture=new Texture(Gdx.files.internal("black.png"));
        texturetop =new Texture(Gdx.files.internal("pink.png"));
       imggold=new Texture(Gdx.files.internal("raw_gold.jpeg"));

        //myTextureRegion=new TextureRegion(texturetop);
        //myTextureRegionDrawable=new TextureRegionDrawable(myTextureRegion);


        skin=new Skin(Gdx.files.internal("uiskin.json"));


        batch = new SpriteBatch();
        stage = new Stage();
        btnchoi =new TextButton(" PLAY",skin);
        btnchoi.setPosition(w/2+h/2,h-w/12);
        btnchoi.setSize(150,50);
        btnchoi.setColor(Color.PINK);
       // btnchoi.setBackground(Color.rgba4444());
       // btnchoi.background("ic_launcher.png");


        btnnew=new TextButton("NEW ",skin);
        btnnew.setPosition(w/2+h/4,h-w/12);
        btnnew.setSize(100,50);
        btnnew.setColor(Color.PURPLE);

        btntimkiem=new TextButton("Tìm",skin);
        btntimkiem.setPosition(w/2-w/6,h-w/12);
        btntimkiem.setSize(50,50);

        labelTennguoichoi=new Label("Phu ",skin);
        labelTennguoichoi.setFontScale(2f);
        labelTennguoichoi.setPosition(w/12,h/18);

        labelgold=new Label("5000",skin);
        labelgold.setPosition(w/2-w/6,h/8);
        labelgold.setFontScale(2f);



        tfseach=new TextField(" ",skin);
        tfseach.setPosition(w/10,h-w/12);
        tfseach.setSize(300,50);
        tfseach.setColor(Color.WHITE);

        Phong phong= new Phong(1,"thay",2,"hai" );
        Phong phong2= new Phong(2,"phu",2,"hba" );
        Phong phong3= new Phong(3,"hi",2,"hbon" );

        ArrayList<Phong> lst=new ArrayList<Phong>();
        lst.add(phong);
        lst.add(phong2);
        lst.add(phong3);
        phongList = new List<Phong>(skin);


        final  Label lb =new Label( "ban",skin);
        lb.setAlignment(Align.left);
        final Label lb1 =new Label("Ten Ban",skin);

        lb1.setAlignment(Align.center);

        final Label lb2 =new Label("muc cuoc",skin);
        lb2.setAlignment(Align.center);
        final Label lb3=new Label("So nguoi ",skin);
        lb3.setAlignment(Align.right);
        lb2.setWrap(true);




        final Label text = new Label(phong.toString(), skin);
        text.setAlignment(Align.center);
        text.setWrap(true);

        final Label text3 = new Label(phong2.toString(), skin);
        text3.setAlignment(Align.center);


        final Table scrollTable = new Table();
        scrollTable.row().height(100);
        scrollTable.add(lb).width(300);


        scrollTable.add(lb1).width(300);
        scrollTable.add(lb2).width(250);
        scrollTable.add(lb3).width(300);
        scrollTable.setColor(Color.BLACK);

        scrollTable.row();

        scrollTable.add(text);
        scrollTable.row();
        scrollTable.add(text3);

        final ScrollPane scroller = new ScrollPane(scrollTable);

        final Table table = new Table();

        table.setFillParent(true);
        table.add(scroller).fill().expand();
        table.setColor(Color.BROWN);
        scroller.setScale(1f);

        table.setPosition(w/30,h/4);
        table.setScale(1f);



        this.stage.addActor(table);


        stage.addActor(labelgold);
        stage.addActor(labelTennguoichoi);
        stage.addActor(btnchoi);
        stage.addActor(btnnew);
        stage.addActor(btntimkiem);
        stage.addActor(tfseach);








    }


    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(texturetop,0,h-w/10 , w, h/2+w);
        batch.draw(texture,0,0 ,w,h/2-h/4);

        batch.draw(icon,w/14,h/10,100,100);
        batch.draw(imggold,w/4,h/10,50,50);
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
