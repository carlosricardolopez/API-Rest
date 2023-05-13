package edu.udb.retrofitappcrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val alumnos = findViewById<Button>(R.id.btnalumnos)
        val profesores = findViewById<Button>(R.id.btnprofesores)

        alumnos.setOnClickListener{
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }
        profesores.setOnClickListener{
            //codigo para abrir venta ade profesores
            val intent = Intent(this@Menu, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}