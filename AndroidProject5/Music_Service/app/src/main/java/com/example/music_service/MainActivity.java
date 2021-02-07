package com.example.music_service;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MusicServiceTest";
    Button start, stop;

    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    public void onClick(View src) {
        switch (src.getId())  {
            case R.id.start:
                Log.d(TAG, "onClick() start ");
                startService(new Intent(this, MusicserviceTest.class));
                break;

            case R.id.stop:
                Log.d(TAG, "onClick() stop");
                stopService(new Intent(this, MusicserviceTest.class));
                break;
        }
    }
}
