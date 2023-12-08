package com.durante.jorence.block5.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttStart: Button =findViewById(R.id.btnStart);
        buttStart.setOnClickListener{
            val Intent = Intent (this,MainActivity2::class.java)
            startActivity(Intent)
        }
        val butInstruct: Button =findViewById(R.id.btnInstruction);
        butInstruct.setOnClickListener{
            val Intent = Intent (this,MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}