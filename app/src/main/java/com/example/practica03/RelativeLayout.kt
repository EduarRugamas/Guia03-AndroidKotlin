package com.example.practica03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative__layout)

        val btn_agregar = findViewById<Button>(R.id.btn_agregar)
        val nombre = findViewById<EditText>(R.id.nombre)
        val numeroT = findViewById<EditText>(R.id.numeroDeTarjeta)
        val fecha = findViewById<EditText>(R.id.fecha)
        val CVV = findViewById<EditText>(R.id.cvv)
        val btn_navegar = findViewById<Button>(R.id.btn_navegar)

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
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}