package com.example.memorycrash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listOf(
            R.drawable.ic_a,
            R.drawable.ic_b,
            R.drawable.ic_c,
            R.drawable.ic_d,
            R.drawable.ic_e,
            R.drawable.ic_f,
            R.drawable.ic_g,
            R.drawable.ic_h,
            R.drawable.ic_i,
        ).forEach {
            ContextCompat.getDrawable(
                this,
                it,
            )
        }
    }
}
