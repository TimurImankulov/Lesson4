package com.example.lesson4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var TextView1: TextView? = null
    var TextView2: TextView? = null
    var TextView3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView1 = findViewById(R.id.TextView1)
        TextView2 = findViewById(R.id.TextView2)
        TextView3 = findViewById(R.id.TextView3)

        val chekButton = findViewById<Button>(R.id.chekButton)

        chekButton.setOnClickListener {
            val intent = Intent(this, MoviesActivity::class.java)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==1 && resultCode== Activity.RESULT_OK) {
            val nameOfMovie1 = data?.getStringExtra("nameOfMovie1")
            TextView1?.text = nameOfMovie1
            val nameOfMovie2 = data?.getStringExtra("nameOfMovie2")
            TextView2?.text = nameOfMovie2
            val nameOfMovie3 = data?.getStringExtra("nameOfMovie3")
            TextView3?.text = nameOfMovie3
        } else {
            Log.d("onActivityResult", "no data")
        }
    }




}