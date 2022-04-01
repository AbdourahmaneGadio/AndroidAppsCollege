package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar barre;
    TextView valeurBarre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barre = findViewById(R.id.seekBar);
        valeurBarre = findViewById(R.id.valeurBar);

        barre.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                valeurBarre.setText(String.valueOf(barre.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                valeurBarre.setText(String.valueOf(barre.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                valeurBarre.setText(String.valueOf(barre.getProgress()));
            }
        });
    }

}