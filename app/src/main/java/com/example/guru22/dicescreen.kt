package com.example.guru22

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.guru22.databinding.ActivityMainBinding
import java.util.Random

class dicescreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val random = Random()
    val num1 = random.nextInt(5)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dicescreen)

        val btnResult = findViewById<Button>(R.id.btnResult)

        btnResult.setOnClickListener {
/*
            if (num1 == 0) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "1"
            } else if (num1 == 1) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "2"
            } else if (num1 == 2) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "3"
            } else if (num1 == 3) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "4"
            } else if (num1 == 4) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "5"
            } else {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "6"
            }
*/
            val dialog = CustomDialog2(this)
            dialog.showDialog()
        }
    }
}


class CustomDialog2(context: Context) {
    private val dialog = Dialog(context)
    private lateinit var onClickListener: OnDialogClickListener

    fun setOnClickListener(listener: OnDialogClickListener) {
        onClickListener = listener
    }

    fun showDialog() {
        dialog.setContentView(R.layout.result2)
        dialog.window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.show()

        val btnAgain = dialog.findViewById<Button>(R.id.btnAgain)
        btnAgain.setOnClickListener {
            dialog.dismiss()
        }

        val btnClose = dialog.findViewById<Button>(R.id.btnClose)
        btnClose.setOnClickListener {
            //종료버튼을 누르면 메인 화면으로 연결되는 걸 구현해야 함. 밑은 임시로 적음.
            //onClickListener.onClicked(edit_name.text.toString())
            dialog.dismiss()
        }
    }

    interface OnDialogClickListener {
        fun onClicked(name: String)
    }
}