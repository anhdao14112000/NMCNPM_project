package com.example.ghienphim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat_box.*
import kotlinx.android.synthetic.main.activity_description_12.*
import kotlinx.android.synthetic.main.activity_description_bg.*
import kotlinx.android.synthetic.main.activity_description_nt.*
import kotlinx.android.synthetic.main.activity_description_vd.*

class ChatBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_box)

        return_btn3.setOnClickListener{
            val intent= Intent(this, Description::class.java)
            startActivity(intent)
            finish()
        }
    }

}