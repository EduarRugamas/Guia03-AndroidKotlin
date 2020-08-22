package com.example.practica03.MaterialDesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.practica03.R

class MaterialDesing2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_desing2)

        val navegar = findViewById<TextView>(R.id.nav)
        val btn = findViewById<Button>(R.id.btnToast)

        navegar.setOnClickListener{
            val intent = Intent(this, MaterialDesing1::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener{
            Toast.makeText(this, "Te has Registrado con exito", Toast.LENGTH_LONG).show()
        }

    }
}