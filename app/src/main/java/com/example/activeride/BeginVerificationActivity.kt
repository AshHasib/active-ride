package com.example.activeride

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_begin_verification.*

class BeginVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_verification)

        cardContinuePhoneNumber.setOnClickListener {
            startActivity(Intent(this, GetPhoneNumberActivity::class.java))
            finish()
        }

    }
}
