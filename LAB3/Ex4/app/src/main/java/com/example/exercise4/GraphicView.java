package com.example.exercise4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

public class GraphicView extends View {

    Bitmap[] frames = new Bitmap[128];
    int i = 0;
    long last_tick = 0;
    long period = 200;
    static Context ctext;
    static MediaPlayer mediaPlayer;
    
    public GraphicView(Context context) {
        super(context);
        ctext = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.cat1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.cat2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.cat3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.cat4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.cat5);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.cat6);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.cat7);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.cat8);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.cat9);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.cat10);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.cat12);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.cat12);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.cat13);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.cat14);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.cat15);
        frames[15] = BitmapFactory.decodeResource(getResources(), R.drawable.cat16);
        frames[16] = BitmapFactory.decodeResource(getResources(), R.drawable.cat17);
        frames[17] = BitmapFactory.decodeResource(getResources(), R.drawable.cat18);
        frames[18] = BitmapFactory.decodeResource(getResources(), R.drawable.cat19);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 128 && frames[i] != null){
            canvas.scale(0.75f, 0.8f);
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        } else {
            i = 0;
        }
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}
