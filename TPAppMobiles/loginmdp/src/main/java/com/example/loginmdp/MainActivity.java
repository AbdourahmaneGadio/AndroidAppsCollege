package com.example.loginmdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boutonEnvoi;
    EditText texteLogin;
    EditText textePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boutonEnvoi = findViewById(R.id.buttonEnvoi);
        texteLogin = findViewById(R.id.textLogin);
        textePassword = findViewById(R.id.textPassword);

        boutonEnvoi.setOnClickListener(this::envoiToast);
    }

    private void envoiToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Le login est : " + texteLogin.getText() +
                " et le mot de passe est : " + textePassword.getText();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}