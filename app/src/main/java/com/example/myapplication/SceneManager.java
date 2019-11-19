package com.example.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;

/**
 * Created by Pujan KC on 11/19/2019.
 */
public class SceneManager {
    private ArrayList<Scene> scenes = new ArrayList<>();
    public static int ACTIVE_SCENE;

    public SceneManager(){
        ACTIVE_SCENE = 0;
        scenes.add(new GameplayScene());

    }

    public void recieveTouch(MotionEvent event){
        scenes.get(ACTIVE_SCENE).recieveTouch(event);
    }

    public void update(){
        scenes.get(ACTIVE_SCENE).update();
    }

    public void draw(Canvas canvas){
        scenes.get(ACTIVE_SCENE).draw(canvas);
    }

}
