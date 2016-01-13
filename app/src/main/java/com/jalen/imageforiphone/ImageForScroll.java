package com.jalen.imageforiphone;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

/**
 * Created by Jalen on 2016/1/12.
 */
public class ImageForScroll extends ScrollView {

    /**改变的View*/
    private View view;
    /**图片所在位置*/
    private int marker;
    private int height;
    public ImageForScroll(Context context) {
        this(context,null);
    }

    public ImageForScroll(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ImageForScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.image);
        marker = a.getInteger(R.styleable.image_marker,0);
        a.recycle();

    }

    public void setChangeView(View view){
        this.view = view;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        height = ((ViewGroup) getChildAt(0)).getChildAt(0).getHeight();
        Log.d("yu",""+height);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        final boolean change = t!=oldt;
        if(change&&view!=null){
            view.setTranslationY(t/2);
        }
        Log.d("yu","scroll+ l:"+t);
        if(t<=height){

        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
        }

        return super.onTouchEvent(ev);

    }
}
