package com.example.dam.ddit2ej2;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SoloToolBar extends AppCompatActivity {

    Toolbar tb;
    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_tool_bar);

        tb = (Toolbar) findViewById(R.id.tb);
        tb.setTitle(R.string.tSoloT);
        setSupportActionBar(tb);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.itOpcion1:

                return true;

            case R.id.itOpcion2:

                return true;

            case R.id.itOpcion3:

                return true;

            case R.id.itOpcion4:

                return true;

            case R.id.itOpcion5:

                return true;

            case R.id.itOpcion6:

                return true;

            case android.R.id.home:

                Intent i = new Intent(SoloToolBar.this, Principal.class);
                startActivity(i);

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
