package com.example.kotlinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var texteBouton = findViewById<TextView>(R.id.texteBouton)
        var imageBouton = findViewById<ImageButton>(R.id.imageBouton)

        imageBouton.setOnClickListener(View.OnClickListener { texteBouton.setText(imageBouton.contentDescription) })
    }

}