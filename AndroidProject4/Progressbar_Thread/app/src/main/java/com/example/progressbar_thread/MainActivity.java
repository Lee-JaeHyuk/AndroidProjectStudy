package com.example.progressbar_thread;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.app.Activity;


public class MainActivity extends Activity {
    private static final int PROGRESS = 0x1;
    private ProgressBar mProgress;
    private int mProgressStatus = 0;
    int i = 0;

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        mProgress = (ProgressBar) findViewById(R.id.progress_bar);
        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus<100){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    mProgressStatus = i++;
                    mProgress.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressStatus);
                        }
                    });
                }
            }
        }).start();

    }
}
