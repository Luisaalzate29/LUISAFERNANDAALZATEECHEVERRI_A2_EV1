package com.example.presupuestoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val greetButton = findViewById<Button>(R.id.greetButton)
        val messageOutput = findViewById<TextView>(R.id.messageOutput)

        greetButton.setOnClickListener {
            val name = nameInput.text.toString().trim()
            if (name.isNotEmpty()) {
                val message = "Hola $name, con esta aplicación vas a organizar tu presupuesto familiar mes a mes, con el que podrás pagar tus necesidades, entretenimiento y ahorrar."
                messageOutput.text = message
            } else {
                messageOutput.text = "Por favor, ingresa tu nombre."
            }
        }
    }
}
