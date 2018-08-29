package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.ArrayList;


public class Room implements Screen {

    private Game game;
    private Stage stage;
    private Texture texture,texturetop,imggold ,icon,texturemid;
    private SpriteBatch batch;
    private TextButton btnnew,btnchoi,btntimkiem;

    private Label lblTennguoichoi;
    private Label labelgold;
    private TextField tfseach;
    float w,h;
    private OrthographicCamera camera;
    final float W=100;
    final float H=50;

    List<Phong> phongList;




    Skin skin;
    private Viewport viewport;

    public Room(final Game game) {







        h=Gdx.graphics.getHeight();
        w=Gdx.graphics.getWidth();
        float kt=(float)h/(float)w;
        camera=new OrthographicCamera(w*kt,h);
        viewport=new ScreenViewport(camera);
        camera.position.set(W/2,H/2,0);

        icon=new Texture("raw1.png");
        texture=new Texture(Gdx.files.internal("black.png"));
        texturetop =new Texture(Gdx.files.internal("pink.png"));
       imggold=new Texture(Gdx.files.internal("raw_gold.jpeg"));
       texturemid=new Texture(Gdx.files.internal("black.png"));

       skin=new Skin(Gdx.files.internal("uiskin.json"));


        batch = new SpriteBatch();
        stage = new Stage();
        btnchoi =new TextButton(" PLAY",skin);
        btnchoi.setPosition(w/2+h/2,h-w/12);
        btnchoi.setSize(GameConstants.col_width,GameConstants.ten_height);
        btnchoi.setColor(Color.PINK);



        btnnew=new TextButton("NEW ",skin);
        btnnew.setPosition(w/2+h/4,h-w/12);
        btnnew.setSize(GameConstants.col_width,GameConstants.ten_height);
        btnnew.setColor(Color.PURPLE);
         btnnew.addListener(new ClickListener(){
             @Override
             public void clicked(InputEvent event, float x, float y) {

                 game.setScreen(new User_Group(game));

             }

         }


         );



        lblTennguoichoi=new Label("Phu ",skin);
        lblTennguoichoi.setFontScale(GameConstants.font);
        lblTennguoichoi.setPosition(GameConstants.fourty_width,GameConstants.ten_height-GameConstants.sixty_height);

        labelgold=new Label("5000",skin);
        labelgold.setPosition(GameConstants.four_width +GameConstants.sixty_width,GameConstants.sixty_height);
        labelgold.setFontScale(GameConstants.font);

        btntimkiem=new TextButton("Find",skin);
        btntimkiem.setPosition(GameConstants.centerX -GameConstants.six_width,GameConstants.screenHeight-w/12);
        btntimkiem.setSize(GameConstants.ten_height,GameConstants.ten_height);

        tfseach=new TextField(" ",skin);
        tfseach.setPosition(w/14,h-w/12);
        tfseach.setSize(GameConstants.six_width +GameConstants.ten_width,GameConstants.ten_height);
        tfseach.setColor(Color.WHITE);

        Phong phong= new Phong(1,"thay",2,"hai" );
        Phong phong2= new Phong(2,"phu",2,"hba" );
        Phong phong3= new Phong(3,"hi",2,"hbon" );

        ArrayList<Phong> lst=new ArrayList<Phong>();
        lst.add(phong);
        lst.add(phong2);
        lst.add(phong3);
        phongList = new List<Phong>(skin);


        final  Label lb =new Label( "Ban",skin);
        lb.setAlignment(Align.left);
        lb.setFontScale(GameConstants.font);
        final Label lb1 =new Label("Ten Ban",skin);
        lb1.setFontScale(GameConstants.font);
        lb1.setAlignment(Align.center);

        final Label lb2 =new Label("Muc cuoc",skin);
        lb2.setAlignment(Align.center);
        lb2.setFontScale(GameConstants.font);

        final Label lb3=new Label("So nguoi ",skin);
        lb3.setAlignment(Align.right);
        lb3.setFontScale(GameConstants.font);
        lb2.setWrap(true);

        final Label text = new Label(phong.toString(), skin);
        text.setAlignment(Align.center);
        text.setWrap(true);
        text.setFontScale(GameConstants.font);

        final Label text3 = new Label(phong2.toString(), skin);
        text3.setAlignment(Align.center);
        text3.setFontScale(GameConstants.font);

        final Table scrollTable = new Table();
        scrollTable.row().height(GameConstants.row_height);
        scrollTable.add(lb).width(GameConstants.col_width);


        scrollTable.add(lb1).width(GameConstants.four_width);
        scrollTable.add(lb2).width(GameConstants.four_width);
        scrollTable.add(lb3).width(GameConstants.four_width);
        scrollTable.setFillParent(true);
        scrollTable.setPosition(0,GameConstants.four_height);


        final Table table = new Table();
        table.setFillParent(true);

        table.row();
        table.add(text);
        table.row();
        table.add(text3).colspan(4);
        table.setPosition(0,GameConstants.ten_height);
        table.setSize(GameConstants.screenWidth,GameConstants.four_height);
        table.setScale(GameConstants.four_width);



        this.stage.addActor(table);
        stage.addActor(scrollTable);
        stage.addActor(labelgold);
        stage.addActor(lblTennguoichoi);
        stage.addActor(btnchoi);
        stage.addActor(btnnew);
        stage.addActor(btntimkiem);
        stage.addActor(tfseach);

    }


    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        batch.begin();



        batch.draw(texturetop,0,GameConstants.screenHeight-GameConstants.col_width, GameConstants.screenWidth, GameConstants.four_height);
        batch.draw(texture,0,0 , GameConstants.screenWidth,GameConstants.four_height);
       batch.draw(texturemid,0,h/2+w/10, GameConstants.screenWidth,GameConstants.row_height);

        batch.draw(icon,GameConstants.sixty_width,GameConstants.ten_height,GameConstants.row_height,GameConstants.row_height);
        batch.draw(imggold,GameConstants.four_width,GameConstants.sixty_height,GameConstants.iconimg,GameConstants.iconimg);


        batch.end();


        stage.act(delta);
        stage.draw();






    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height);

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
