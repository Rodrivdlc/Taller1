package com.example.taller1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al TextView y Button
        val saludoTextView = findViewById<TextView>(R.id.saludoTextView)
        val buttonInicio = findViewById<Button>(R.id.buttonInicio)

        // Obtener la hora actual y cambiar el saludo
        val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
        val saludo = when {
            currentHour in 0..11 -> "Buenos días"
            currentHour in 12..17 -> "Buenas tardes"
            else -> "Buenas noches"
        }
        saludoTextView.text = saludo

        // Evento del botón para ir a la siguiente actividad
        buttonInicio.setOnClickListener {
            val intent = Intent(this, MainUserActivity::class.java)
            startActivity(intent)
        }
    }
}
