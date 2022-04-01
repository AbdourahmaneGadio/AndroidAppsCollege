package com.example.appcontroletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boutonParite;
    Button boutonDiv;
    Button boutonCarre;
    Button boutonRacine;
    Button boutonInv;

    TextView zoneNombre;
    TextView texteResultat;

    ListView listeNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoneNombre = findViewById(R.id.zoneNombre);
        texteResultat = findViewById(R.id.texteReponse);
        listeNombres = findViewById(R.id.listeNombres);

        boutonParite = findViewById(R.id.boutonParite);
        boutonParite.setOnClickListener(this::parite);

        boutonDiv = findViewById(R.id.boutonDiv);
        boutonDiv.setOnClickListener(this::diviseurs);

        boutonCarre = findViewById(R.id.boutonCarre);
        boutonCarre.setOnClickListener(this::carre);

        boutonRacine = findViewById(R.id.boutonRacine);
        boutonRacine.setOnClickListener(this::racine);

        boutonInv = findViewById(R.id.boutonInv);
        boutonInv.setOnClickListener(this::inv);
    }

    private void parite(View view) {
        int nombre = Integer.parseInt(zoneNombre.getText().toString());

        if(nombre%2 == 0)
            texteResultat.setText(nombre + " est pair");
        else
            texteResultat.setText(nombre + " est impair");
    }

    private void diviseurs(View view) {
        int indice;
        int compteur = 0;
        int nombre = Integer.parseInt(zoneNombre.getText().toString());

        String listeDiviseurs[] = new String[nombre];

        for (indice = 0; indice<nombre; indice++){

            if((nombre%(indice+1)) == 0)
                listeDiviseurs[indice] = String.valueOf(indice + 1);

        }

        texteResultat.setText("Les diviseurs de " + nombre + " sont : ");
    }

    private void carre(View view) {
        int nombre = Integer.parseInt(zoneNombre.getText().toString());

        int carre = nombre*nombre;

        texteResultat.setText("Le carré de " + nombre + " est : " + carre);
    }

    private void racine(View view) {
        int nombre = Integer.parseInt(zoneNombre.getText().toString());

        double racine = Math.sqrt(nombre);

        texteResultat.setText("La racine carré de " + nombre + " est : " + racine);
    }

    private void inv(View view) {
        float nombre = Integer.parseInt(zoneNombre.getText().toString());

        if (nombre == 0)
            texteResultat.setText("0 n'a pas d'inverse !!!");

        else{
            float inverse = 1 / nombre;
            texteResultat.setText("L'inverse de " + nombre + " est : " + inverse);
        }
    }

}