package com.appy.r6hub;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ATK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atk);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));

    }
    public void ash(View v){
        Intent x=new Intent(this, ash.class);
        startActivity(x);
    }
    public void bb(View v){
        Intent x=new Intent(this, bb.class);
        startActivity(x);
    }
    public void blitz(View v){
        Intent x=new Intent(this, blitz.class);
        startActivity(x);
    }
    public void buck(View v){
        Intent x=new Intent(this, buck.class);
        startActivity(x);
    }
    public void cap(View v){
        Intent x=new Intent(this, cap.class);
        startActivity(x);
    }
    public void doks(View v){
        Intent x=new Intent(this, doks.class);
        startActivity(x);
    }
    public void finka(View v){
        Intent x=new Intent(this, finka.class);
        startActivity(x);
    }
    public void fuze(View v){
        Intent x=new Intent(this, fuze.class);
        startActivity(x);
    }
    public void gridlock(View v){
        Intent x=new Intent(this, gridlock.class);
        startActivity(x);
    }
    public void hibs(View v){
        Intent x=new Intent(this, hibs.class);
        startActivity(x);
    }
    public void iq(View v){
        Intent x=new Intent(this, iq.class);
        startActivity(x);
    }
    public void jacks(View v){
        Intent x=new Intent(this, jacks.class);
        startActivity(x);
    }
    public void lion(View v){
        Intent x=new Intent(this, lion.class);
        startActivity(x);
    }
    public void mav(View v){
        Intent x=new Intent(this, mav.class);
        startActivity(x);
    }
    public void monty(View v){
        Intent x=new Intent(this, monty.class);
        startActivity(x);
    }
    public void sledge(View v){
        Intent x=new Intent(this, sledge.class);
        startActivity(x);
    }
    public void thatcher(View v){
        Intent x=new Intent(this, thatcher.class);
        startActivity(x);
    }
    public void thermite(View v){
        Intent x=new Intent(this, thermite.class);
        startActivity(x);
    }
    public void twitch(View v){
        Intent x=new Intent(this, twitch.class);
        startActivity(x);
    }
    public void ying(View v){
        Intent x=new Intent(this, ying.class);
        startActivity(x);
    }
    public void zofia(View v){
        Intent x=new Intent(this, zophia.class);
        startActivity(x);
    }
    public void glaz(View v){
        Intent x=new Intent(this, glaz.class);
        startActivity(x);
    }
 /*   public void op(View v){
        Intent x=new Intent(this, op.class);
        startActivity(x);
    }*/
}
