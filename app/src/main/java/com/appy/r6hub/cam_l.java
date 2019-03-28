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

public class cam_l extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_l);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        dl = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView=findViewById(R.id.nav_view1);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_account1:
                        Intent cam= new Intent(cam_l.this,cam_l.class);
                        startActivity(cam);
                        break;
                    case R.id.nav_account:
                        Intent stats = new Intent(cam_l.this,a.class);
                        startActivity(stats);
                        break;
                    case R.id.nav_account2:
                        Intent ops = new Intent(cam_l.this,operator.class);
                        startActivity(ops);
                        break;
                    case R.id.nav_account3:
                        Intent xyz = new Intent(cam_l.this,MainActivity.class);
                        startActivity(xyz);
                        break;

                }
                return false;
            }
        });


    }
    public void house(View a){
        Intent x=new Intent(this,house.class);
        startActivity(x);
    }
    public void chalet(View a){
        Intent x=new Intent(this,chalet.class);
        startActivity(x);
    }
    public void plane(View a){
        Intent x=new Intent(this,Plane.class);
        startActivity(x);
    }
    public void bank(View a){
        Intent x=new Intent(this,bank.class);
        startActivity(x);
    }
    public void border(View a){
        Intent x=new Intent(this,border.class);
        startActivity(x);
    }
    public void clubhouse(View a){
        Intent x=new Intent(this,clubhouse.class);
        startActivity(x);
    }
    public void coastline(View a){
        Intent x=new Intent(this,coastline.class);
        startActivity(x);
    }
    public void consulate(View a){
        Intent x=new Intent(this,consulate.class);
        startActivity(x);
    }
    public void favela(View a){
        Intent x=new Intent(this,favela.class);
        startActivity(x);
    }
    public void hereford(View a){
        Intent x=new Intent(this,hereford.class);
        startActivity(x);
    }
    public void kafe(View a){
        Intent x=new Intent(this,kafe.class);
        startActivity(x);
    }
    public void kanal(View a){
        Intent x=new Intent(this,kanal.class);
        startActivity(x);
    }
    public void oregon(View a){
        Intent x=new Intent(this,oregon.class);
        startActivity(x);
    }
    public void skyscraper(View a){
        Intent x=new Intent(this,skyscraper.class);
        startActivity(x);
    }
    public void park(View a){
        Intent x=new Intent(this,park.class);
        startActivity(x);
    }
    public void tower(View a){
        Intent x=new Intent(this,tower.class);
        startActivity(x);
    }
    public void yacht(View a){
        Intent x=new Intent(this,yacht.class);
        startActivity(x);
    }
    public void fortress(View a){
        Intent x=new Intent(this,fortress.class);
        startActivity(x);
    }
    public void villa(View a){
        Intent x=new Intent(this,villa.class);
        startActivity(x);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
