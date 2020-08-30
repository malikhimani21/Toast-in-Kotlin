package com.example.myapplication123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(){
            Toast.makeText(this, "Button1",Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener(){
            Toast.makeText(this, "Button 2", Toast.LENGTH_LONG).show()
        }


    }
}