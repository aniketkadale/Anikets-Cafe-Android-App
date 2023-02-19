package com.example.aniketscafe

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.aniketscafe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY = "package com.example.aniketscafe.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val eT1 = findViewById<EditText>(R.id.eT1)
        val eT2 = findViewById<EditText>(R.id.eT2)
        val eT3 = findViewById<EditText>(R.id.eT3)


        btnOrder.setOnClickListener {
            val ordersList = eT1.text.toString() + " " + eT2.text.toString() + " " + eT3.text.toString()

            val intent = Intent(this, Orders::class.java)
            intent.putExtra(KEY, ordersList)
            startActivity(intent)
        }
    }
}