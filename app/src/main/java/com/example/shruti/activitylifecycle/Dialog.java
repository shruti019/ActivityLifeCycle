package com.example.shruti.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Dialog extends AppCompatActivity {

    private String DIALOG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        DIALOG= "Dialog";
        Log.d(DIALOG,"in method onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(DIALOG,"in method onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(DIALOG,"in method onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(DIALOG,"in method onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(DIALOG,"in method onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(DIALOG,"in method onDestroy");
    }

//    public void finishActivityA(View v){
//        MainActivity.this.finish();
//    }

    public void finishDialog(View v){
        Dialog.this.finish();
    }
}
