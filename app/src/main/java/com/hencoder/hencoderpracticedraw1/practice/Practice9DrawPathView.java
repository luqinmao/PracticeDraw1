package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Util;

public class Practice9DrawPathView extends View {

    private int mWidth;
    private int mHeight;

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth =w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Path path = new Path();
//        path.addCircle(mWidth/2 -50,mHeight/2,50, Path.Direction.CW);
//        path.addCircle(mWidth/2 +50,mHeight/2,50, Path.Direction.CW);
//        path.moveTo(mWidth/2-100,mHeight/2);
//        path.lineTo(mWidth/2+100,mHeight/2);
//        path.lineTo(mWidth/2,mHeight/2+200);
//        path.lineTo(mWidth/2 - 100,mHeight/2);
//        canvas.drawPath(path, Util.getPaint());


        path.addArc(canvas.getWidth() / 2 - 200, 380, canvas.getWidth() / 2, 580, -225, 225);
        path.arcTo(canvas.getWidth() / 2, 380, canvas.getWidth() / 2 + 200, 580, -180, 225, false);
        path.lineTo(canvas.getWidth() / 2, 700);
        canvas.drawPath(path, Util.getPaint());


    }
}
