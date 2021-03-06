package com.uca.redsocialuca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button LoginBTN, RegistrarBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginBTN = findViewById(R.id.LoginBTN);
        RegistrarBTN = findViewById(R.id.RegistrarBTN);

        LoginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Iniciar_Sesion.class));
            }
        });
        RegistrarBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Registro.class));
            }
        });
    }
}