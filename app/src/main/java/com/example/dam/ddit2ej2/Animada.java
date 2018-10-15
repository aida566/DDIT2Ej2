package com.example.dam.ddit2ej2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Animada extends AppCompatActivity {

    Toolbar tb;
    private RecyclerView mRV;
    private RecyclerView.LayoutManager mLM;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animada);

        tb = (Toolbar) findViewById(R.id.toolbar);
        tb.setTitle(R.string.tAnimada);
        setSupportActionBar(tb);

        //Recycler

        mRV = (RecyclerView) findViewById(R.id.rvAnimada);

        Resources res = getResources();
        String[] frutas = res.getStringArray(R.array.array1);

        mAdapter = new MyAdapter(frutas);
        mRV.setAdapter(mAdapter);

        mLM = new LinearLayoutManager(this);
        mRV.setLayoutManager(mLM);
    }

}
