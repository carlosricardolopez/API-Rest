package edu.udb.retrofitappcrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txtusu = findViewById<TextView>(R.id.txtusuario)
        val txtpwd = findViewById<TextView>(R.id.txtcontraseña)
        val btnsesion = findViewById<Button>(R.id.btnsesion)

        btnsesion.setOnClickListener{
            val usuario = txtusu.text.toString()
            val contraseña = txtpwd.text.toString()

            if(usuario.isNotEmpty() && contraseña.isNotEmpty()){

                if(usuario == "admin" && contraseña == "admin123"){
                    val intent = Intent(this@Login, Menu::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this,"Datos de inicio de sesion incorrectos", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Por favor, ingrese sus datos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}