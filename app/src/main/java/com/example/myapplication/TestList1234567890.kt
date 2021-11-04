package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.activity_main.*

class TestList1234567890 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list1234567890)
        val recordsListView: RecyclerView = findViewById(R.id.recyclerRecordsList)
        recordsListView.apply {
            layoutManager = LinearLayoutManager(this@TestList1234567890)
            adapter = RecyclerRecordsAdapter()
        }
/*        recyclerRecordsList.apply {

        }*/

    }

}