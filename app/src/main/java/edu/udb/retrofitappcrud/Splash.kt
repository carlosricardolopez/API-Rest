package edu.udb.retrofitappcrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import java.util.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val task = object: TimerTask(){
            override fun run(){
                val intent = Intent(this@Splash, Login::class.java)
                startActivity(intent)
                finish()
            }
        }
        val timer = Timer()
        timer.schedule(task, 3500)

    }
}