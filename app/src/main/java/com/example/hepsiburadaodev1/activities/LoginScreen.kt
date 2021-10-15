package com.example.hepsiburadaodev1.activities

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import com.example.hepsiburadaodev1.R

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        val textView = findViewById<TextView>(R.id.foodninja)
        val textView2 = findViewById<TextView>(R.id.textView7)
        val shader = LinearGradient(0f, 0f, 0f, textView.textSize,Color.parseColor("#53E88B"), Color.parseColor("#15BE77"), Shader.TileMode.CLAMP)
        textView.paint.shader = shader
        textView2.paint.shader = shader
    }

}