package com.neo.http.myviewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/7/22 0022.
 */
public class CountView extends View implements View.OnClickListener{
    private Rect mBounds;
    private Paint mPaint;
    private int mCount;
    public CountView(Context context,AttributeSet attrs) {
        super(context);
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mBounds=new Rect();
        setOnClickListener(this);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);

        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(30);
        String text=String.valueOf(mCount);
        mPaint.getTextBounds(text,0,text.length(),mBounds);

        float textWidth=mBounds.width();
        float textheight=mBounds.height();
        canvas.drawText(text,getWidth()/2-textWidth/2,getHeight()/2+textheight/2,mPaint);

    }

    @Override
    public void onClick(View v) {

        mCount++;
        invalidate();
    }
}
