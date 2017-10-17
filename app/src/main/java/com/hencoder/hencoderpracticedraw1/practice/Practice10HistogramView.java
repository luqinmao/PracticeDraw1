package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Util;

public class Practice10HistogramView extends View {

    private int mHeight;
    private int mWidth;
    private Paint mPaint;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint = Util.getPaint();
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(4);

        canvas.drawLine(50,50,50,550,mPaint);
        canvas.drawLine(50,550,mWidth-100,550,mPaint);

        mPaint.setColor(Color.parseColor("#00ff00"));
        Path path = new Path();
        int[] heightArray = {5,10,10,80,150,250,200};
        String[] textArray = {"aa","bb","cc","dd","ee","ff","gg"};

        for (int i = 1; i <= 7; i++) {
            RectF rectF = new RectF();
            rectF.left = 90*i;
            rectF.right = 90*i+60 ;
            rectF.top = 550 -heightArray[i-1];
            rectF.bottom = 550;
            path.addRect(rectF, Path.Direction.CW);

        }
        canvas.drawPath(path,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(30);
        for (int i = 1; i <= textArray.length; i++) {
            int x= i*90+30 -15; //减去值宽度的一半
            canvas.drawText(textArray[i-1],x,550+30,mPaint);
        }


    }
}
