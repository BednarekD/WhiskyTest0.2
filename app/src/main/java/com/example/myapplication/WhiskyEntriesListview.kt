package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WhiskyEntriesListview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.whisky_entries_listview)

        val buttonAddRecord = findViewById<Button>(R.id.btn_addRecord)
        buttonAddRecord.setOnClickListener {
            val intent = Intent(this, RecordActivity::class.java) //was TestList1234567890::class.java
            startActivity(intent)
        }

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        //for (i in 1..20) {}
        data.add(ItemsViewModel(rating = "5.0/5.0", name = "Lagavulin 16",visual = "bursztyn", "turf","dym","kapeć legionisty","Islay","22" , "chuj"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}