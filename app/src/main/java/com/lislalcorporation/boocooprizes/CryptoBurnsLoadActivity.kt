package com.lislalcorporation.boocooprizes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class CryptoBurnsLoadActivity : AppCompatActivity() {

    private var splashScreenTime : Long = 3500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_crypto_burns_load)

        Handler(Looper.myLooper()!!).postDelayed({

            startActivity(Intent(
                this, MainActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION))
            overridePendingTransition(0,0)
            finish()

        }, splashScreenTime)
    }
}