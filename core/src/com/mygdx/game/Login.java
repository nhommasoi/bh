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
    SpriteBatch batch;
   private Game game;
    private Stage stage;
    BitmapFont font;
    private  Label lb;
    Skin skin;

    public Login(Game game){

        //this.game=game;
        //stage=new Stage();
        //Gdx.input.setInputProcessor(stage);


      //texture=new Texture("badlogic.jpg");
      // Skin skin=new Skin(Gdx.files.internal("uiskin.json"));

         //Skin skin = new Skin();
        //skin.addRegions(atlas)
        //lb= new Label("Skip Intro", skin);
        //stage.addActor(lb);
        //TextField introText = new TextField("", skin);

        //table.add(introLabel);
        //table.add(introText).width(100);
        //table.row();

       //TextButton btnlogic=new TextButton("click",skin);
         //btnlogic.setPosition(300,300);
       //btnlogic.setSize(300,60);
       //stage.addActor(btnlogic);
        batch = new SpriteBatch();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);


        skin = new Skin();

        // Generate a 1x1 white texture and store it in the skin named "white".
        Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.BLUE);
        pixmap.fill();
        skin.add("white", new Texture(pixmap));


        skin.add("default", new BitmapFont());

        /*TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
        textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
        textButtonStyle.font = skin.getFont("default");
        skin.add("default", textButtonStyle);
        final TextButton button = new TextButton("Click me!", skin);
        button.setPosition(300,300);
        button.setSize(300,60);
        stage.addActor(button);*/
        TextField.TextFieldStyle textFieldStyle=new TextField.TextFieldStyle();

        textFieldStyle.font = skin.getFont("default");
        skin.add("default", textFieldStyle);

        final TextField textField=new TextField("",skin);
        textField.setScale(5f);

        stage.addActor(textField);


    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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
        stage.dispose();


    }
}
