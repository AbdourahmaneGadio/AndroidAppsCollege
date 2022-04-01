package com.example.calculrayon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zoneNombre = findViewById<EditText>(R.id.zoneNombre)
        zoneNombre.setOnClickListener(View.OnClickListener { zoneNombre.setText("") })
        var zoneReponse = findViewById<TextView>(R.id.zoneReponse)

        var boutonAire = findViewById<Button>(R.id.boutonAire)
        boutonAire.setOnClickListener(View.OnClickListener {
            val aireCercle = 2 * Math.PI * zoneNombre.text.toString().toDouble()
            zoneReponse.setText("L'aire du cercle est : " + aireCercle.toString() + " m")
        })

        var boutonSurface = findViewById<Button>(R.id.boutonSurface)
        boutonSurface.setOnClickListener(View.OnClickListener {
            val surfaceCercle = Math.PI * Math.pow(zoneNombre.text.toString().toDouble(), 2.0)
            zoneReponse.setText("La surface du cercle est : " + surfaceCercle.toString() + " m²")
        })

        var boutonVolume = findViewById<Button>(R.id.boutonVolume)
        boutonVolume.setOnClickListener(View.OnClickListener {
            val volumeCercle = (4/3) * Math.PI * Math.pow(zoneNombre.text.toString().toDouble(), 3.0)
            zoneReponse.setText("Le volume de la boule est : " + volumeCercle.toString() + " m3")
        })
    }

}