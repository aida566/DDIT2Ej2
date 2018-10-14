package com.example.dam.ddit2ej2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button btSoloT;
    private Button btExtendida;
    private Button btAnimada;
    private Button btCollapsingT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        btSoloT = (Button) findViewById(R.id.btSoloT);
        btExtendida = (Button) findViewById(R.id.btExtendida);
        btAnimada = (Button) findViewById(R.id.btAnimada);
        btCollapsingT = (Button) findViewById(R.id.btCollapsingT);

        buttonListeners();

    }

    public void buttonListeners(){

        btSoloT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Principal.this, SoloToolBar.class);
                startActivity(i);

            }
        });

        btExtendida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Principal.this, SoloToolBar.class);
                startActivity(i);

            }
        });

        btAnimada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Principal.this, SoloToolBar.class);
                startActivity(i);

            }
        });

        btCollapsingT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Principal.this, SoloToolBar.class);
                startActivity(i);

            }
        });
    }
}
