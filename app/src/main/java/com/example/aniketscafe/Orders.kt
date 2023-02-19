package com.example.aniketscafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val orders = intent.getStringExtra(MainActivity.KEY)
        val txtView = findViewById<TextView>(R.id.textView2)

        txtView.text = orders.toString()

    }
}