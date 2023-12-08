package com.durante.jorence.block5.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val butReturn: Button =findViewById(R.id.btnReturn);
        butReturn.setOnClickListener{
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}