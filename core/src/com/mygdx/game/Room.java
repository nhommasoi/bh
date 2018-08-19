package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.utils.Align;

import java.util.ArrayList;


public class Room implements Screen {

    private Game game;
    private Stage stage;
    private Texture texture;
    private SpriteBatch batch;
    private TextButton btnnew,btnchoi;
    private TextField tfseach;
    float w,h;

    List<Phong> phongList;

    ScrollPane scrollPane;




    Skin skin;

    public Room(Game game) {
        h=Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();

        skin=new Skin(Gdx.files.internal("uiskin.json"));


        batch = new SpriteBatch();
        stage = new Stage();
        btnchoi =new TextButton(" PLAY",skin);
        btnchoi.setPosition(w/2+h/2,h-w/12);
        btnchoi.setSize(150,50);

        btnnew=new TextButton("NEW ",skin);
        btnnew.setPosition(w/2+h/4,h-w/12);
        btnnew.setSize(100,50);

        tfseach=new TextField(" ",skin);
        tfseach.setPosition(w/10,h-w/12);
        tfseach.setSize(300,50);
        stage.addActor(btnchoi);
        stage.addActor(btnnew);
        stage.addActor(tfseach);


        final  Label lb =new Label( "bàn",skin);
        lb.setAlignment(Align.left);
        final Label lb1 =new Label("Tên Bàn",skin);

        lb1.setAlignment(Align.center);

        final Label lb2 =new Label("mức cược",skin);
        lb2.setAlignment(Align.center);
        final Label lb3=new Label("Số người ",skin);
        lb3.setAlignment(Align.right);
        lb2.setWrap(true);
        final Table scrollTable=new Table();
        scrollTable.row().height(50);
        scrollTable.add(lb).width(200);
        scrollTable.add(lb1).width(200);



        scrollTable.add(lb2).width(200);
        scrollTable.add(lb3).width(200);


        Phong phong= new Phong(1,"pro9x",2,"hai" );
        phong.setId(2);
        phong.setName("sdsdf");
        phong.setMota("10s5");
        phong.setSonguoi(1);
        addsd();
        phongList= new List<Phong>(skin);


        phongList.setItems(phong);


        scrollPane=new ScrollPane(phongList);
        //final Table table=new Table();
        //table.setFillParent(true);
        //table.add(scrollPane).fill().expand();
        this.stage.addActor(scrollTable);
        scrollTable.setPosition(w/2,h-w/8);


        scrollPane.setBounds(0,0,w+w/2+w/4,h-100);
        scrollPane.setSmoothScrolling(false);
        scrollPane.setPosition(w/2-scrollPane.getWidth()/4,
               h/2-scrollPane.getHeight()/4);
        scrollPane.setTransform(true);
        scrollPane.setScale(0.5f);


        stage.addActor(scrollPane);
        Gdx.input.setInputProcessor(stage);

        texture=new Texture(Gdx.files.internal("raw_room.png"));


    }

    private ArrayList<Phong> addsd(){
        ArrayList<Phong> lst=new ArrayList<Phong>();
        lst.add(new Phong(1,"ba hai",1,"ok men"));
        lst.add(new Phong(2,"ba hai",1,"ok men"));

        return lst;



    }

    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1f,0,1f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

            batch.begin();
            batch.draw(texture,w,h);

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
