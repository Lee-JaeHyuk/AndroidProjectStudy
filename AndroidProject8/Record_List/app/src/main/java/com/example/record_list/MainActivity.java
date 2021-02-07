package com.example.record_list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback{

    Button mBtRecord;
    Button mBtPlay;

    MediaRecorder mRecorder;
    MediaPlayer mPlayer;
    String mPath;

    boolean isRecording = false;
    boolean isPlaying = false;
    boolean hasVideo = false;

    SurfaceView mSurface = null;
    SurfaceHolder mSurfaceHolder = null;
    Camera mCamera = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurface = (SurfaceView)findViewById(R.id.sv);
        mBtRecord = (Button)findViewById(R.id.btn_record);
        //mBtPlay = (Button)findViewById(R.id.btn_play);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)!= PackageManager.PERMISSION_GRANTED||
                ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED||
                ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO, Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE},10);
        }
        else{
            mRecorder = new MediaRecorder();
            mPlayer = new MediaPlayer();

            mBtRecord.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hasVideo = true;
                    initVideoRecorder();
                    startVideoRecorder();
                }
            });
            mBtPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(isPlaying == false){
                        try {
                            mPlayer.setDataSource(mPath);
                            if (hasVideo==true){
                                mPlayer.setDisplay(mSurfaceHolder);
                            }
                            mPlayer.prepare();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        mPlayer.start();
                        isPlaying = true;
                        mBtPlay.setText("Stop Recording");
                    }else {
                        mPlayer.stop();
                        isPlaying = false;
                        mBtPlay.setText("Start Playing");
                        mCamera = null;
                    }
                }
            });

            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    isPlaying = false;
                    mBtPlay.setText("Start Playing");
                    mCamera = null;
                }
            });

        }
    }
    void initVideoRecorder() {
        mCamera = Camera.open();
        mCamera.setDisplayOrientation(90);
        mSurfaceHolder = mSurface.getHolder();
        mSurfaceHolder.addCallback(this);
    }
    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        if (mCamera == null){
            try {
                mCamera.setPreviewDisplay(mSurfaceHolder);
                mCamera.startPreview();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
        mCamera.stopPreview();

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {


    }


    private void startVideoRecorder() {
        if(isRecording){
            mRecorder.stop();
            mRecorder.release();
            mRecorder = null;

            mCamera.lock();
            isRecording = false;
            mBtRecord.setText("Start Recording");
        }
        else{
            mRecorder = new MediaRecorder();
            mCamera.unlock();
            mRecorder.setCamera(mCamera);
            mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
            mRecorder.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH));
            mRecorder.setOrientationHint(90);

            mPath = getExternalCacheDir().getAbsolutePath() + "/record.mp4";
            mRecorder.setOutputFile(mPath);

            mRecorder.setPreviewDisplay(mSurfaceHolder.getSurface());
            try {
                mRecorder.prepare();
                mRecorder.start();
            }catch (Exception e){
                e.printStackTrace();
            }

            isRecording = true;
            mBtRecord.setText("Stop Recording");

        }

    }

    public void List_View(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }


}