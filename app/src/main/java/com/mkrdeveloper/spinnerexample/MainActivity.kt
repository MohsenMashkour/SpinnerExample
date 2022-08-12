package com.mkrdeveloper.spinnerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val txtRes = findViewById<TextView>(R.id.txtRes)

        val options = arrayOf("item1","item2","item3","item4")

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,options)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                txtRes.text = "you selected:  ${ options.get(p2).toString()}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                txtRes.text = " please select an item"
            }

        }
    }
}