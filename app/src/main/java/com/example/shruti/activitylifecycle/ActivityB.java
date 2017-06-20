package com.example.shruti.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    private String ACT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ACT= "activity B";
        Log.d(ACT,"in method onStart");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(ACT,"in method onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(ACT,"in method onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(ACT,"in method onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(ACT,"in method onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(ACT,"in method onDestroy");
    }

    public void finishActivityB(View v){
        ActivityB.this.finish();
    }

}
