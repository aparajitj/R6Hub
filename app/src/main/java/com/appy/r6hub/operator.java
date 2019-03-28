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

public class operator extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);
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
                        Intent cam= new Intent(operator.this,cam_l.class);
                        startActivity(cam);
                        break;
                    case R.id.nav_account:
                        Intent stats = new Intent(operator.this,a.class);
                        startActivity(stats);
                        break;
                    case R.id.nav_account2:
                        Intent ops = new Intent(operator.this,operator.class);
                        startActivity(ops);
                        break;
                    case R.id.nav_account3:
                        Intent xyz = new Intent(operator.this,MainActivity.class);
                        startActivity(xyz);
                        break;
                }
                return false;
            }
        });

    }
    public void atk(View v){
        Intent x=new Intent(this,ATK.class);
        startActivity(x);
    }
    public void DEF(View v){
        Intent x=new Intent(this,DEF.class);
        startActivity(x);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
