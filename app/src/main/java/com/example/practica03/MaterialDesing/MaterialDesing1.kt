package com.example.practica03.MaterialDesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.practica03.R

class MaterialDesing1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_desing1)

        val navegar = findViewById<TextView>(R.id.nav)
        val btn = findViewById<Button>(R.id.btnToast)

        navegar.setOnClickListener{
            val intent = Intent(this, MaterialDesing2::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener{
            Toast.makeText(this, "Has Iniciado Sesion", Toast.LENGTH_LONG).show()
        }
    }
}