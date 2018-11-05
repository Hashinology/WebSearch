package com.example.hashi.websearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    private static final String TAG = "Second_Activity";

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: ");
    }
}
