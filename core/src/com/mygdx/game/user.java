package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.loaders.AssetLoader;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.awt.Label;
import java.awt.TextField;

public class user implements Screen {
    public static final int W=480;
    public  static final int H=800;
    private final TextField usernameTextField;



    //private GameStateManager gsm;
    private SpriteBatch batch;
    private Texture background;
    private Texture icon;
    private BitmapFont font;
    //private Stage stage;
    private Sprite sprite;


    private Stage stage;

    private Game game;
    private TextField textField;
    private Skin skin;



    public  user(Game game){

        batch=new SpriteBatch();
        font=new BitmapFont();
        background=new Texture("raw_12.jpeg");
        //sprite=new Sprite(background);
        icon=new Texture("raw1.png");

        stage=new Stage(new ScreenViewport());
        int row_hoight=Gdx.graphics.getWidth()/12;





        //skin.add("white", new Texture(pixmap));


        //skin.add("default", new BitmapFont());
        //TextField textFieldStyle=new TextField();

        this.usernameTextField = new TextField("");
        //this.usernameTextField.setPosition(24,73);
        this.usernameTextField.setSize(88, 14);













    }


    

  
    @Override
    public void dispose () {
        batch.dispose();
        font.dispose();



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

        font.getData().setScale(3f);
        GlyphLayout layout=new GlyphLayout(font,"ID :\n\n" +"User :\n\n"+ "Level : ");

        GlyphLayout winloss=new GlyphLayout(font,"\n"+"Win  : \t" +"Lose");

        font.draw(batch,layout,(Gdx.graphics.getWidth()-layout.width)/2, (Gdx.graphics.getHeight()+layout.height)/2);

        font.draw(batch,winloss,(Gdx.graphics.getWidth()/2+ winloss.width)/2, (Gdx.graphics.getHeight()/2+winloss.height)/2);


        batch.draw(icon,user.W/2-(icon.getWidth()/2), user.H/2);


        batch.end();
        
        
        
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
