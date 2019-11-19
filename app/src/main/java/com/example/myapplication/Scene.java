package com.example.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Pujan KC on 11/19/2019.
 */
public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
