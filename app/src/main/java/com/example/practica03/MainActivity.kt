package com.example.practica03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practica03.MaterialDesing.MaterialDesing1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_agregar = findViewById<Button>(R.id.btn_agregar)
        val nombre = findViewById<EditText>(R.id.nombre)
        val numeroT = findViewById<EditText>(R.id.numeroDeTarjeta)
        val fecha = findViewById<EditText>(R.id.fecha)
        val CVV = findViewById<EditText>(R.id.cvv)
        val btn_navegar = findViewById<Button>(R.id.btn_navegar)
        val btn_material = findViewById<Button>(R.id.btnMaterial)

        btn_agregar.setOnClickListener{
            val name = nombre.text
            val numberT = numeroT.text
            val date = fecha.text
            val cvv = CVV.text

            Toast.makeText(this, "Hola $name, Numero de tarjeta $numberT, con fecha $date, y CVV $cvv ", Toast.LENGTH_LONG).show()

            Log.d("Nombre", name.toString())
            Log.d("Numero de tarjeta", numberT.toString())
            Log.d("Fecha", date.toString())
            Log.d("CVV", cvv.toString())
        }

        btn_navegar.setOnClickListener{
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        btn_material.setOnClickListener{
            val intent = Intent(this, MaterialDesing1::class.java)
            startActivity(intent)
        }

    }
}