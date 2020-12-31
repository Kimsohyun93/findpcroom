package com.example.findpcroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        goMain()
    }

    private fun goMain() {
        var count = 0
        val countDownTimer = object : CountDownTimer(3000L, 500L){
            override fun onFinish() {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()

            }

            override fun onTick(millisUntilFinished: Long) {
                Log.e("count" ,"${count++}")
                if(count>3){
                    cancel()
                    onFinish()
                }

            }

        }.start()
    }
}