package com.example.activeride

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_get_phone_number.*

class GetPhoneNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_phone_number)

        setSupportActionBar(findViewById(R.id.toolbar))
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)


        cardGetPhoneNumber.setOnClickListener {
            Toast.makeText(this, "You will be sent a message and redirected to complete your registration", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
