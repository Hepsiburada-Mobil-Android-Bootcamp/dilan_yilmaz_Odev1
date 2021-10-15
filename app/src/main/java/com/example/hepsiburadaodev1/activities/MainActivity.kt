package com.example.hepsiburadaodev1.activities


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.hepsiburadaodev1.R

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var liveData: LiveData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        liveData()

    }
    private fun liveData() {
        liveData = LiveData(application)
        liveData.observe(this) { isConnected ->
            if (isConnected) {
                imageView.setImageResource(R.drawable.wifi_connect)

                textView.setTextColor(Color.parseColor("#4CAF50"))
            } else {
                imageView.setImageResource(R.drawable.wifi_disconnected)

                textView.setTextColor(Color.parseColor("#F44336"))
            }
        }

    }
}
