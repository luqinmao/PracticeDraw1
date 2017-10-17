package com.hencoder.hencoderpracticedraw1;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by luqinmao on 2017/10/16.
 */

public class Util {

    private static Paint mPaint;

    public static Paint getPaint(){
        if (mPaint == null){
            mPaint = new Paint();
            mPaint.setAntiAlias(true);
            mPaint.setStrokeCap(Paint.Cap.ROUND);
            mPaint.setStrokeWidth(10);
            mPaint.setColor(Color.BLACK);
            return mPaint;
        }else{
            return mPaint;
        }
    }
}
