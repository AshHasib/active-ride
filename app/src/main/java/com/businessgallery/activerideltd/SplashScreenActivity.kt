package com.businessgallery.activerideltd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val anim = AlphaAnimation(0.2f, 1.0f)

        //FirebaseDatabase.getInstance().getReference("MESSAGE").setValue("Hello")

        anim.duration = 1500

        imgLogo.animation = anim


        Handler().postDelayed(Runnable {
            startActivity(Intent(this, BeginVerificationActivity::class.java))
            finish()
        }, 2500)




    }
}
