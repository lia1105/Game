package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {

    private Object Paint;
    private float posX,posY = 400;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas ) {//畫布
        super.onDraw(canvas);
        Paint  paint= new Paint();//畫筆
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bird);
        canvas.drawBitmap(bitmap,posX,posY,paint);
    }

    public void setPosX(float posX) {
        if(posX>0 && posX< getWidth()-120){
            this.posX = posX;
        }
    }

    public void setPosY(float posY) {
        if(posY>0 && posY< getHeight()-120){
        this.posY = posY;
        }
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

}
