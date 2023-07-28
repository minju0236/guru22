package com.example.guru22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class diceButtonresult : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var Radio_group : RadioGroup
    lateinit var button_one : RadioButton
    lateinit var button_two : RadioButton
    lateinit var button_three : RadioButton
    lateinit var button_four : RadioButton
    lateinit var button_five : RadioButton
    lateinit var button_six : RadioButton
    lateinit var button_seven : RadioButton
    lateinit var btnOK : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_buttonresult)

        text1=findViewById(R.id.Text1)
        Radio_group=findViewById(R.id.radio_group)

        button_one=findViewById(R.id.radio_button_one)
        button_two=findViewById(R.id.radio_button_two)
        button_three=findViewById(R.id.radio_three)
        button_four=findViewById(R.id.radio_button_four)
        button_five=findViewById(R.id.radio_button_five)
        button_six=findViewById(R.id.radio_button_six)
        button_seven=findViewById(R.id.radio_button_seven)

        btnOK=findViewById(R.id.buttonOK)

        btnOK.setOnClickListener{
            var intent= Intent(this,dicescreen::class.java)
            startActivity(intent)
        }


    }
}