package com.example.toastperso;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boutonToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boutonToast = findViewById(R.id.button);
        boutonToast.setOnClickListener(this::afficheToast);
    }

    private void afficheToast(View view) {
        Toast toast = new Toast(getApplicationContext());
        View viewLayoutPerso = getLayoutInflater().inflate(R.layout.layout_perso,findViewById(R.id.layoutPersoID));

        toast.setView(viewLayoutPerso);
        toast.show();
    }
}