package com.github.lzyzsd.androiduiproblems;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by bruce on 2/27/16.
 */
public class OverDrawView extends View {
    Paint mPaint = new Paint();

    public OverDrawView(Context context) {
        super(context);
    }

    public OverDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OverDrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public OverDrawView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init() {
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        mPaint.setColor(Color.GRAY);
        canvas.drawRect(0, 0, width, height, mPaint);

        mPaint.setColor(Color.CYAN);
        canvas.drawRect(0, height/4, width, height, mPaint);

        mPaint.setColor(Color.DKGRAY);
        canvas.drawRect(0, height/3, width, height, mPaint);

        mPaint.setColor(Color.LTGRAY);
        canvas.drawRect(0, height/2, width, height, mPaint);
    }
}
