package com.example.guru22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var coinButton: ImageButton
    lateinit var diceButton: ImageButton
    lateinit var ImageView : ImageView
    lateinit var ImageView2 : ImageView
    lateinit var ImageView4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coinButton=findViewById<ImageButton>(R.id.coinButton)
        diceButton=findViewById<ImageButton>(R.id.diceButton)

        ImageView=findViewById(R.id.imageView)
        ImageView2=findViewById(R.id.imageView2)
        ImageView4=findViewById(R.id.imageView4)



        coinButton.setOnClickListener{
            var intent = Intent(this,coinButtonresult::class.java)
            startActivity(intent)
        }
        diceButton.setOnClickListener{
            var intent= Intent(this,diceButtonresult::class.java)
            startActivity(intent)
        }


    }
}