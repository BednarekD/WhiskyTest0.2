package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainList : AppCompatActivity() {
    private lateinit var listView: ListView
    val filters: Array<String> = resources.getStringArray(R.array.Filters)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*        setContentView(R.layout.activity_main_list)
        listView = findViewById<ListView>(R.id.recipe_list_view)
        val listItems = listOf("Octomore 5", "Lagavulin 16", "Glenfiddich 15")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = adapter

        val spinnerfil = findViewById<Spinner>(R.id.spinnerFilter)
        if (spinnerfil != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, filters
            )
            //spinnerfil.adapter = adapter
        }
        spinnerfil.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                Toast.makeText(this@MainList,
                   spinnerfil.selectedItem.toString() + filters[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }*/
    }
}