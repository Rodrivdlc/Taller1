package com.example.taller1


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.LinearLayout

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Referencia al layout para cambiar el color de fondo
        val layout = findViewById<LinearLayout>(R.id.layout)

        // Referencias a los botones
        val colorButtonRojo = findViewById<Button>(R.id.colorButtonRojo)
        val colorButtonAzul = findViewById<Button>(R.id.colorButtonAzul)
        val volverInicioButton = findViewById<Button>(R.id.volverInicioButton)

        // Eventos de los botones para cambiar el color de fondo
        colorButtonRojo.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
        }

        colorButtonAzul.setOnClickListener {
            layout.setBackgroundColor(Color.BLUE)
        }

        // Evento del botón para volver a la pantalla de inicio
        volverInicioButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
