package com.example.eventtrackingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare views
    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnCreateAccount: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Connects to activity_main.xml

        // Initialize views
        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnCreateAccount = findViewById(R.id.btnCreateAccount)

        // Handle Login
        btnLogin.setOnClickListener {
            val username = editUsername.text.toString().trim()
            val password = editPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            } else {
                // Placeholder: In future, check database for credentials
                Toast.makeText(this, "Login successful (placeholder)", Toast.LENGTH_SHORT).show()

                // Navigate to Event Grid screen
                val intent = Intent(this, EventGridActivity::class.java)
                startActivity(intent)
            }
        }

        // Handle Create Account
        btnCreateAccount.setOnClickListener {
            val username = editUsername.text.toString().trim()
            val password = editPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter a username and password", Toast.LENGTH_SHORT).show()
            } else {
                // Placeholder: In future, save credentials to database
                Toast.makeText(this, "Account created (placeholder)", Toast.LENGTH_SHORT).show()

                // Navigate to Event Grid screen
                val intent = Intent(this, EventGridActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
