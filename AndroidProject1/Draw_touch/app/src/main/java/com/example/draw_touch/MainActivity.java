package com.example.draw_touch;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Myview myview = new Myview(this);
        setContentView(myview);

    }

    class Myview extends View{
        float x,y;
        String str = "";
        Paint paint = new Paint();
        Path path = new Path();
        public Myview(Context context) {
            super(context);
            setBackgroundColor(Color.YELLOW);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(5f);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event){
            x = event.getX();
            y = event.getY();

            if(event.getAction() == MotionEvent.ACTION_DOWN){
                path.moveTo(x,y);
            }
            if(event.getAction() == MotionEvent.ACTION_UP){
                str = "Action_up";
            }
            if (event.getAction() == MotionEvent.ACTION_MOVE){
                str = "Action_move";
                path.lineTo(x,y);
            }
            invalidate();
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            /*
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            canvas.drawCircle(x,y,100,paint);
            paint.setTextSize(50);
            canvas.drawText("텍스트 종류" + str, 0,100,paint);
            */
            canvas.drawPath(path,paint);
        }
    }
}
