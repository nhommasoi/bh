package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Search implements Screen {
    private Game game;
    private Texture bgscreen,imguser,imghost;
    SpriteBatch batch;
    BitmapFont font;
    Stage stage;
    Image image1,image2,image3,image4,image5,image6,image7,image8,image9,imageleader;
    private float sum=0;
    public Search(Game game)
    {
        this.game=game;
        bgscreen = new Texture(Gdx.files.internal("bgsearch.jpg"));
        imguser = new Texture(Gdx.files.internal("image_user.png"));
        imghost = new Texture(Gdx.files.internal("raw1.png"));
        batch=new SpriteBatch();
        stage = new Stage();
        font = new BitmapFont();
        image1 = new Image(imguser);
        image2 = new Image(imguser);
        image3 = new Image(imguser);
        image4 = new Image(imguser);
        image5 = new Image(imguser);
        image6 = new Image(imguser);
        image7 = new Image(imguser);
        image8 = new Image(imguser);
        image9 = new Image(imguser);
        imageleader = new Image(imghost);

    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);

        image1.setSize(100,100);
        image1.setPosition(Gdx.graphics.getWidth()*5/8+ Gdx.graphics.getWidth()*4/16,Gdx.graphics.getHeight()/4);

        image2.setSize(100,100);
        image2.setPosition(Gdx.graphics.getWidth()*2/8+ Gdx.graphics.getWidth()/16,Gdx.graphics.getHeight()*2/4);

        image3.setSize(100,100);
        image3.setPosition(Gdx.graphics.getWidth()*3/8+ Gdx.graphics.getWidth()*2/16,Gdx.graphics.getHeight()*2/4);

        image4.setSize(100,100);
        image4.setPosition(Gdx.graphics.getWidth()*4/8+ Gdx.graphics.getWidth()*3/16,Gdx.graphics.getHeight()*2/4);

        image5.setSize(100,100);
        image5.setPosition(Gdx.graphics.getWidth()*5/8+ Gdx.graphics.getWidth()*4/16,Gdx.graphics.getHeight()*2/4);

        image6.setSize(100,100);
        image6.setPosition(Gdx.graphics.getWidth()/8,Gdx.graphics.getHeight()/4);

        image7.setSize(100,100);
        image7.setPosition(Gdx.graphics.getWidth()*2/8+ Gdx.graphics.getWidth()/16,Gdx.graphics.getHeight()/4);

        image8.setSize(100,100);
        image8.setPosition(Gdx.graphics.getWidth()*3/8+ Gdx.graphics.getWidth()*2/16,Gdx.graphics.getHeight()/4);

        image9.setSize(100,100);
        image9.setPosition(Gdx.graphics.getWidth()*4/8+ Gdx.graphics.getWidth()*3/16,Gdx.graphics.getHeight()/4);

        imageleader.setSize(100,100);
        imageleader.setPosition(Gdx.graphics.getWidth()/8,Gdx.graphics.getHeight()*2/4);

        stage.addActor(image1);
        stage.addActor(image2);
        stage.addActor(image3);
        stage.addActor(image4);
        stage.addActor(image5);
        stage.addActor(image6);
        stage.addActor(image7);
        stage.addActor(image8);
        stage.addActor(image9);
        stage.addActor(imageleader);



    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(bgscreen,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.end();
        stage.act();
        stage.draw();
        sum+=delta;
        System.out.println(sum);
        if(sum>=5)
        {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                        game.setScreen(new User_Group(game));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.run();
        }

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
