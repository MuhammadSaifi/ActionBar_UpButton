package com.example.actionbar_upbutton

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // when we set our up button then it will not work because we have not
        // set the parent activity in the androidmanifest.xml
        // go there and in tag of second activity we will
        // declared parent name where we set the parent
        // activity name.


      supportActionBar?.setTitle("Activity 2")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setIcon(R.drawable.ic_directions)

        btn2.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
