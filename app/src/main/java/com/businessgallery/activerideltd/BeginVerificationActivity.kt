package com.businessgallery.activerideltd

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_begin_verification.*
import com.google.firebase.auth.FirebaseAuth


class BeginVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_verification)

        cardContinuePhoneNumber.setOnClickListener {
            startActivity(Intent(this, GetPhoneNumberActivity::class.java))
            finish()

        }
    }

    override fun onStart() {
        super.onStart()

        val pref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
        if(pref.getBoolean("LOGGED_IN", false)) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
