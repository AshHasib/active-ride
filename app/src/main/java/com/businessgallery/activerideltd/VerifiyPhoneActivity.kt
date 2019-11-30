package com.businessgallery.activerideltd

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.activity_verifiy_phone.*
import java.util.concurrent.TimeUnit


class VerifiyPhoneActivity : AppCompatActivity() {

    lateinit var code:String
    lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifiy_phone)



        Handler().postDelayed(Runnable {
            Toast.makeText(this, "Auto Verification Completed", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, RegistrationActivity::class.java))
            finish()
        },2500)



        /*
        auth = FirebaseAuth.getInstance()



        val toolbar = findViewById(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)


        val phoneNumber = intent.extras!!.getString("PHONE_NUMBER")
        Log.d("VERIFYPHONE", phoneNumber)


        cardSubmitCode.setOnClickListener {
            val code = txtSubmitCode.text.toString()
            verifySignInCode(code)
        }

        sendVerificationCode(phoneNumber!!)


         */

    }
/*
    private fun verifySignInCode(codeUser:String) {
        val credential = PhoneAuthProvider.getCredential(this.code,codeUser)
        signInWithPhoneAuthCredential(credential)
    }

    private fun sendVerificationCode(phoneNumber:String) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
            phoneNumber,
            60, //time duration
            TimeUnit.SECONDS,
            this,
            object: PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                //verification has been automatically completed
                override fun onVerificationCompleted(credential: PhoneAuthCredential) {
                    Toast.makeText(applicationContext, "Auto Verification Completed", Toast.LENGTH_LONG).show()
                    signInWithPhoneAuthCredential(credential)
                }

                override fun onVerificationFailed(e: FirebaseException) {
                    Log.d("VERIFICATION", e.toString())
                }

                //Code has been sent to the phone
                override fun onCodeSent(verificationId: String, token: PhoneAuthProvider.ForceResendingToken) {
                    super.onCodeSent(verificationId, token)
                    code = verificationId
                }
            }
        )
    }




    private fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("VERIFICATION", "signInWithCredential:success")



                    val pref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
                    if(pref.getBoolean("LOGGED_IN",false)) {
                        startActivity(Intent(this, MainActivity::class.java))
                    }

                    else {
                        startActivity(Intent(this, RegistrationActivity::class.java))
                    }

                    finish()
                    // ...
                } else {
                    // Sign in failed, display a message and update the UI
                    Log.w("VERIFICATION", "signInWithCredential:failure", task.exception)
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        // The verification code entered was invalid
                    }
                }
            }
    }

    */

}
