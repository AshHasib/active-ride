package com.businessgallery.activerideltd

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupToolbar()

        showName()


        /*
        btnSignout.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this,BeginVerificationActivity::class.java))
            finish()
        }*/


    }

    private fun showName() {
        val preference = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
        txtShowName.text = "Welcome, ${preference.getString("NAME", "John!")}"
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setHomeAsUpIndicator(R.drawable.ic_menu)
        actionBar!!.title = ""
    }


    fun showToast(v:View) {
        Toast.makeText(this,"Service will be available soon", Toast.LENGTH_LONG).show()
    }


}
