package com.appy.r6hub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.SystemClock.sleep;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sleep(500);
        Intent x=new Intent(this,MainActivity.class);
        startActivity(x);
        finish();
    }
}
