package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var username = "admin"
    var password = "admin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtUser = findViewById<EditText>(R.id.txtUser)
        val txtPass = findViewById<EditText>(R.id.txtPass)
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            if (txtUser.text.toString()
                    .equals(username, ignoreCase = true) && txtPass.text.toString()
                    .equals(password, ignoreCase = true)
            ) {
                startActivity(Intent(this@MainActivity, ActivityBeranda::class.java))
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Username atau Password Salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}