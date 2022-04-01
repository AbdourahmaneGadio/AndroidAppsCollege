package com.example.textealeatoire;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText texte;
    Button button;
    private String listeTexte[] =
            {"Incroyable !", "Génie :)", "Meh...", "Vive Linux !",
                    "T'as vu Game of Thrones ?", "SNK surcôté",
                    "Hé ho, vous m'entendez ?", "Bien ou bien ?",
                    "J'sais pas moi", "Je m'ennuie...",
                    "Je fais quoi ?", "C'est tout ?"};
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texte = findViewById(R.id.editTextTextPersonName);
                int randomNumber = new Random().nextInt(listeTexte.length);
                texte.setText(listeTexte[randomNumber]);
            }
        });
    }
}