package com.example.troisboutons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var texte = findViewById<TextView>(R.id.textView)

        var bouton1 = findViewById<Button>(R.id.bouton1)
        bouton1.setOnClickListener(View.OnClickListener { texte.setText(bouton1.text) })

        var bouton2 = findViewById<Button>(R.id.bouton2)
        bouton2.setOnClickListener(View.OnClickListener { texte.setText(bouton2.text) })

        var bouton3 = findViewById<Button>(R.id.bouton3)
        bouton3.setOnClickListener(View.OnClickListener { texte.setText(bouton3.text) })
    }
}