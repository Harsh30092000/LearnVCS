package com.example.learnvcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.temporal.TemporalAmount

class PaymentActivity : AppCompatActivity() {
    var Amount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
    }
    fun pay(amount: Int): Boolean {
        return amount>100
    }
}