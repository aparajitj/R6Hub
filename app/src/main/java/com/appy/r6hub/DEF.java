package com.appy.r6hub;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DEF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));

    }
    public void alibi(View v){
        Intent x =new Intent (this,alibi.class);
        startActivity(x);
    }
    public void bandit(View v){
        Intent x =new Intent(this,bandit.class);
            startActivity(x);

    }
    public void castle(View v){
        Intent x =new Intent(this,castle.class);
        startActivity(x);
    }
    public void cav (View v){
        Intent x=new Intent(this,cav.class);
        startActivity(x);
    }
    public void clash(View v){
        Intent x=new Intent(this,clash.class);
        startActivity(x);
    }
    public void doc(View v){
        Intent x=new Intent(this,doc.class);
        startActivity(x);
    }
    public void echo(View v){
        Intent x=new Intent(this,echo.class);
        startActivity(x);
    }
    public void ela(View v){
        Intent x=new Intent(this,ela.class);
        startActivity(x);
    }
}
