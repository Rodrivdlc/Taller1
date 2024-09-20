package com.example.taller1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

class MainUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user)

        // Referencias a los componentes de la interfaz
        val nombreEditText = findViewById<EditText>(R.id.nombreEditText)
        val guardarButton = findViewById<Button>(R.id.guardarButton)
        val nombreTextView = findViewById<TextView>(R.id.nombreTextView)
        val irAConfiguracionButton = findViewById<Button>(R.id.irAConfiguracionButton)

        // Evento del botón "Guardar Nombre"
        guardarButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            nombreTextView.text = nombre
        }

        // Evento del botón para ir a la pantalla de configuración
        irAConfiguracionButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
