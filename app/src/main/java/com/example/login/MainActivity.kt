package com.example.login

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginbtn: Button
    private lateinit var forgotPassword: TextView
    private lateinit var alreadyHaveAccount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.Username_input)
        passwordInput = findViewById(R.id.Password_input)
        loginbtn = findViewById(R.id.login_button)
        forgotPassword = findViewById(R.id.forgot_password)
        alreadyHaveAccount = findViewById(R.id.already_have_account)

        loginbtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("LoginInfo", "Username: $username, Password: $password")
        }

        forgotPassword.setOnClickListener {
            // Tambahkan logika untuk menangani lupa password di sini
            Toast.makeText(this, "Lupa Password? Fungsi ini akan ditambahkan.", Toast.LENGTH_SHORT).show()
        }

        alreadyHaveAccount.setOnClickListener {
            // Tambahkan logika untuk menangani login dengan akun yang sudah ada di sini
            Toast.makeText(this, "Sudah punya akun? Fungsi ini akan ditambahkan.", Toast.LENGTH_SHORT).show()
        }
    }
}
