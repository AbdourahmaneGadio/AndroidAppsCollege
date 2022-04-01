package com.example.troisboutons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bouton1;
    Button bouton2;
    Button bouton3;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton1 = findViewById(R.id.button);
        bouton2 = findViewById(R.id.button2);
        bouton3 = findViewById(R.id.button3);

        textView = findViewById(R.id.textView);

        bouton1.setOnClickListener(this::premierBouton);
        bouton2.setOnClickListener(this::deuxiemeBouton);
        bouton3.setOnClickListener(this::troisiemeBouton);
    }

    public void premierBouton(View view){
        textView.setText(R.string.bouton1);
    }

    public void deuxiemeBouton(View view){
        textView.setText(R.string.bouton2);
    }

    public void troisiemeBouton(View view){
        textView.setText(R.string.bouton3);
    }
}