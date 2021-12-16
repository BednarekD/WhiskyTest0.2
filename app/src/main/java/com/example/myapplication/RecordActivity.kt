package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_record.*


class RecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)
        setSupportActionBar(findViewById(R.id.toolbar))
        // najpierw wyciągamy valuesy z pól
        val entryName: String = editNazwa.text.toString()
        val entryVoltage: String = editZawAlko.text.toString()
        val entryRegion: String = spinnerRegion.selectedItem.toString()
        val entryVisual: String = spinnerOko.selectedItem.toString()
        val entryScent: String = spinnerNos.selectedItem.toString()
        val entryTaste: String = spinnerJezyk.selectedItem.toString()
        val entryFinish: String = spinnerFinisz.selectedItem.toString()
        val entryNote: String = editNotka.text.toString()
        val entryRating: String = ratingBarRekord.rating.toString()
        // na onclicku buttona Dodaj wrzucamy obiekt wpisu w pamięć wewnętrzną
        val btnDodaj = findViewById<Button>(R.id.buttonDodaj)
        btnDodaj.setOnClickListener {
            val entry = ItemsViewModel(entryRating,entryName,entryVisual,entryScent,entryTaste,entryFinish,entryRegion,entryVoltage)

            print("O teraz się to zrobiło")
        }

    }
}