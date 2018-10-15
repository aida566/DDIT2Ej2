package com.example.dam.ddit2ej2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Extendida extends AppCompatActivity {

    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extendida);

        tb = (Toolbar) findViewById(R.id.tbExtendida);

        tb.setTitle(R.string.tExtendida);
        tb.setTitleMargin(10, 300, 150, 10);

        tb.setSubtitle(R.string.sExtendida);

    }
}
