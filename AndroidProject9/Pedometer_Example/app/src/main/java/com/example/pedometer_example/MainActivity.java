package com.example.pedometer_example;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView gx, gy, gz;
    private TextView stepsTextView, sensitiveTextView;
    private Button reset;
    private SensorManager sensorManager;

    private float acceleration;
    private float previousY, currentY;
    private int steps;

    SeekBar seekBar;
    int threshold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gx = (TextView) findViewById(R.id.gx);
        gy = (TextView) findViewById(R.id.gy);
        gz = (TextView) findViewById(R.id.gz);

        stepsTextView = (TextView) findViewById(R.id.steps);
        sensitiveTextView = (TextView) findViewById(R.id.sensitive);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setProgress(10);
        SeekBar.OnSeekBarChangeListener seekBarListener =
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser) {
                        threshold = seekBar.getProgress();
                        sensitiveTextView.setText(String.valueOf(threshold));
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                };
        seekBar.setOnSeekBarChangeListener(seekBarListener);

        threshold = 10;
        sensitiveTextView.setText(String.valueOf(threshold));
        previousY = currentY = steps = 0;
        acceleration = 0.0f;

        SensorEventListener stepDetector = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float x = event.values[0];
                float y = event.values[1];
                float z = event.values[2];
                currentY = y;
                if (Math.abs(currentY - previousY) > threshold) {
                    steps++;
                    stepsTextView.setText(String.valueOf(steps));
                }
                gx.setText(String.valueOf(x));
                gy.setText(String.valueOf(y));
                gz.setText(String.valueOf(z));
                previousY = y;
            }
            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }
        };

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.registerListener(stepDetector,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);

    }

    public void reset_btn(View view) {
        steps = 0;
        stepsTextView.setText(String.valueOf(steps));
    }
}