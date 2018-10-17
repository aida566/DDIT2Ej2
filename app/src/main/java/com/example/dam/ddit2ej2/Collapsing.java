package com.example.dam.ddit2ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Collapsing extends AppCompatActivity {

    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);

        tb = (Toolbar) findViewById(R.id.tbCollapsing);
        setSupportActionBar(tb);
    }
}
