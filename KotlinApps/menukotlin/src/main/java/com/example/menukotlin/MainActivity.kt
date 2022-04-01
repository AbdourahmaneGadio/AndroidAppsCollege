package com.example.menukotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Charge le menu décrit dans le fichier mon_menu.xml
        getMenuInflater().inflate(R.menu.mon_menu, menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Permet de détecter quel choix a été fait.
        when (item?.itemId) {
            R.id.item1 -> Toast.makeText(this, "item1", Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this, "item2", Toast.LENGTH_LONG).show()
            else -> {
                Toast.makeText(
                    this,
                    "Action inconnue", Toast.LENGTH_LONG
                ).show()
            }
        } //when
        return true;
    } //onOptionsItemselected
}