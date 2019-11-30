package com.businessgallery.activerideltd

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        cardRegister.setOnClickListener {
            writeUser()
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }



    private fun writeUser() {
        val name = txtFullName.text.toString()
        val email = txtEmail.text.toString()
        val password = txtPassword.text.toString()

        val editor= getSharedPreferences("UserPref", Context.MODE_PRIVATE).edit()
        editor.putString("NAME", name)
        editor.putString("EMAIL", email)
        editor.putString("PASSWORD", password)
        editor.putBoolean("LOGGED_IN", true)
        editor.commit()
    }

}
