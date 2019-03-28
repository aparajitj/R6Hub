package com.appy.r6hub;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class a extends AppCompatActivity {
WebView w;
public ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        w= findViewById(R.id.ww);
        w.animate().alpha(1f);
      //  b.animate().alpha(0f);
        // et.animate().alpha(0f);
        w.getSettings().setLoadsImagesAutomatically(true);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setAppCacheEnabled(true);
        w.loadUrl("https://r6stats.com/");
        w.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                w.loadUrl("https://r6stats.com/");

            }

            public void onPageFinished(WebView view, String url) {

            }

        });
DrawerLayout dl;
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
                        Intent cam= new Intent(a.this,cam_l.class);
                        startActivity(cam);
                        break;
                    case R.id.nav_account:
                        Intent stats = new Intent(a.this,a.class);
                        startActivity(stats);
                        break;
                    case R.id.nav_account2:
                        Intent ops = new Intent(a.this,operator.class);
                        startActivity(ops);
                        break;
                    case R.id.nav_account3:
                        Intent xyz = new Intent(a.this,MainActivity.class);
                        startActivity(xyz);
                        break;
                }
                return false;
            }
        });

    }
    /*public void cu(View v)
    {Button b = findViewById(R.id.button);
    EditText et= findViewById(R.id.et);
    String xyz=et.getText().toString();


    }*/
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
