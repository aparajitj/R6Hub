package com.appy.r6hub;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
     {
         private DrawerLayout dl;
         private ActionBarDrawerToggle toggle;
         WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w= findViewById(R.id.ww1);
        w.animate().alpha(1f);
        //b.animate().alpha(0f);
        //et.animate().alpha(0f);
        w.getSettings().setLoadsImagesAutomatically(true);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setAppCacheEnabled(true);
        w.loadUrl("https://rainbow6.ubisoft.com/siege/en-us/news/index.aspx");
        w.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                w.loadUrl("https://r6stats.com/");

            }

            public void onPageFinished(WebView view, String url) {

            }

        });
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        dl = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_account1:
                        Intent cam= new Intent(MainActivity.this,cam_l.class);
                        startActivity(cam);
                        break;
                    case R.id.nav_account:
                        Intent stats = new Intent(MainActivity.this,a.class);
                        startActivity(stats);
                        break;
                    case R.id.nav_account2:
                        Intent ops = new Intent(MainActivity.this,operator.class);
                        startActivity(ops);
                        break;
                    case R.id.nav_account3:
                        Intent xyz = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(xyz);
                        break;


                }
                return false;
            }
        });

    }



    public void one(View v){
        Intent intent=new Intent(this,a.class);
        startActivity(intent);
        }
    public void cam_l(View x){
        Intent intent1=new Intent(this,cam_l.class);
        startActivity(intent1);
    }
    public void operator(View x){
        Intent intent1=new Intent(this,operator.class);
        startActivity(intent1);
    }
         public boolean onOptionsItemSelected(MenuItem item){
             if(toggle.onOptionsItemSelected(item)) {
                 return true;
             }
             return super.onOptionsItemSelected(item);
         }


}