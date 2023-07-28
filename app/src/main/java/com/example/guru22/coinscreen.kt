package com.example.guru22


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.guru22.databinding.ActivityMainBinding
import java.security.AccessController.getContext
import java.util.Random


class coinscreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val random = Random()
    val num = random.nextInt(1)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coinscreen)

        val btnResult = findViewById<Button>(R.id.btnResult)

        btnResult.setOnClickListener {
/*
            if (num == 0) {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "앞"
            } else {
                val text1 = findViewById<TextView>(R.id.resultTextView)
                text1.text = "뒤"
            }*/
            val dialog = CustomDialog(this)
            dialog.showDialog()
        }
    }
}

class CustomDialog(context: Context) {
    private val dialog = Dialog(context)
    private lateinit var onClickListener: OnDialogClickListener

    fun setOnClickListener(listener: OnDialogClickListener) {
        onClickListener = listener
    }

    fun showDialog() {
        dialog.setContentView(R.layout.result)
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
            System.exit(0)
        }
    }

    interface OnDialogClickListener {
        fun onClicked(name: String)
    }
}

