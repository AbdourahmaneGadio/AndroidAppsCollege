package com.example.weight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bouton1;
    Button bouton2;
    Button bouton3;
    Button bouton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton1 = findViewById(R.id.button);
        bouton2 = findViewById(R.id.button2);
        bouton3 = findViewById(R.id.button3);
        bouton4 = findViewById(R.id.button4);

        bouton1.setOnClickListener(this::premierBouton);
        bouton2.setOnClickListener(this::deuxiemeBouton);
        bouton3.setOnClickListener(this::troisiemeBouton);
        bouton3.setOnClickListener(this::quatriemeBouton);
    }

    public void premierBouton(View view){
    }

    public void deuxiemeBouton(View view){
    }

    public void troisiemeBouton(View view){
    }

    public void quatriemeBouton(View view){
    }
}