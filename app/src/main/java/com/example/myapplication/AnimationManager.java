package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by Pujan KC on 11/19/2019.
 */
public class AnimationManager {
    private Animation[] animations;
    private int animationIndex = 0;

    public AnimationManager(Animation[] animations){
        this.animations = animations;
    }

    public void playAnim(int index){
        for(int i = 0; i< animations.length; i++){
            if(i==index) {
                if(!animations[index].isPlaying())
                animations[i].play();

            }
            else
                animations[i].stop();
        }
        animationIndex = index;
    }

    public void draw(Canvas canvas, Rect rect){
        if(animations[animationIndex].isPlaying())
        animations[animationIndex].draw(canvas, rect);
    }

    public void update(){
        animations[animationIndex].update();
    }

}
