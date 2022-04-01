package com.example.switchgraphique;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch switchCouleur;
    int indiceSwitch = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCouleur = findViewById(R.id.switchCouleur);
        switchCouleur.setOnClickListener(this::changeCouleur);
    }

    private void changeCouleur(View view) {
        ConstraintLayout layoutTP = findViewById(R.id.layoutID);

        if(indiceSwitch == 0) { // Si Off au début
            layoutTP.setBackgroundColor(Color.CYAN);
            indiceSwitch = 1; // On le déclare comme ON
        }

        else {
            layoutTP.setBackgroundColor(Color.WHITE);
            indiceSwitch = 0;
        }
    }
}