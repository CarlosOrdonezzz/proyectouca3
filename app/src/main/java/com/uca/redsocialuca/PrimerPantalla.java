package com.uca.redsocialuca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PrimerPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_pantalla);
        //este metodo permite cuanto tiempo demora la pantalla principal
        final int Duracion= 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //esto es lo que se ejecutara para comenzar con la aplicacion
                Intent intent =new Intent(PrimerPantalla.this, MainActivity. class);
                startActivity(intent);
                //Esto nos permite cambiar de una actividad a otra
            }
        },Duracion);
    }
}