package com.businessgallery.activerideltd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_get_phone_number.*

class GetPhoneNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_phone_number)

        setSupportActionBar(findViewById(R.id.toolbar))
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)


        cardGetPhoneNumber.setOnClickListener {
            //send verification
            val phoneNumber= txtPhoneNumber.text.toString()

            if(!phoneNumber.isEmpty()) {
                val number = "+8801"+phoneNumber
                val intent = Intent(this, VerifiyPhoneActivity::class.java)
                intent.putExtra("PHONE_NUMBER", number)
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this, "Please enter a phone number", Toast.LENGTH_LONG).show()
            }
        }
    }
}
