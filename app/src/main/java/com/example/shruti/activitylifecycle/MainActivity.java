package com.example.shruti.activitylifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG;

    private static final String Create = "create";
    private static final String Start = "start";
    private static final String Resume = "resume";
    private static final String Restart = "restart";
    private static final String Pause = "pause";
    private static final String Stop = "stop";

    int a_Create = 0;
    int a_Start = 0;
    int a_Resume = 0;
    int a_Restart = 0;
    int a_Pause = 0;
    int a_Stop = 0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG= "activity A";
        Log.d(TAG,"in method onCreate");

        tv = (TextView) findViewById(R.id.textView7);

        if (savedInstanceState != null)
        {
            a_Create = savedInstanceState.getInt(Create);
            a_Start = savedInstanceState.getInt(Start);
            a_Resume = savedInstanceState.getInt(Resume);
            a_Restart = savedInstanceState.getInt(Restart);
            a_Pause = savedInstanceState.getInt(Pause);
            a_Stop = savedInstanceState.getInt(Stop);
        }
        a_Create++;
        threadCount();
    }

    public void threadCount(){
        tv.setText(String.valueOf(a_Create));
        tv.setText(String.valueOf(a_Start));
        tv.setText(String.valueOf(a_Resume));
        tv.setText(String.valueOf(a_Restart));
        tv.setText(String.valueOf(a_Pause));
        tv.setText(String.valueOf(a_Stop));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){

        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(Create, a_Create);
        savedInstanceState.putInt(Start, a_Start);
        savedInstanceState.putInt(Resume, a_Resume);
        savedInstanceState.putInt(Restart, a_Restart);
        savedInstanceState.putInt(Pause, a_Pause);
        savedInstanceState.putInt(Stop, a_Stop);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"in method onStart");
        a_Start++;
        threadCount();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"in method onResume");
        a_Resume++;
        threadCount();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"in method onPause");
        a_Pause++;
        threadCount();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"in method onStop");
        a_Stop++;
        threadCount();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"in method onDestroy");
    }

    public void finishActivityA(View v){
        MainActivity.this.finish();
    }
    public  void startAcitivityB(View v){
        Intent b= new Intent(MainActivity.this, ActivityB.class);
        startActivity(b);
    }
    public  void startDialog(View v){
        Intent c= new Intent(MainActivity.this, Dialog.class);
        startActivity(c);
    }
}
