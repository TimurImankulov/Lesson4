package com.example.lesson4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val btnSaveResult = findViewById<Button>(R.id.btnSaveResult)
        val cbMovie1 = findViewById<CheckBox>(R.id.cbMovie1)
        val cbMovie2 = findViewById<CheckBox>(R.id.cbMovie2)
        val cbMovie3 = findViewById<CheckBox>(R.id.cbMovie3)

        var nameOfMovie1: String? = null
        var nameOfMovie2: String? = null
        var nameOfMovie3: String? = null

        btnSaveResult.setOnClickListener {

            val intent = Intent()

            if (cbMovie1.isChecked)
            {nameOfMovie1 = cbMovie1.text.toString()}
             else
            {nameOfMovie1 = "не готов"}

            if (cbMovie2.isChecked)
            {nameOfMovie2 = cbMovie2.text.toString()}
            else
            {nameOfMovie2 = "не готов"}

            if (cbMovie3.isChecked)
            {nameOfMovie3 = cbMovie3.text.toString()}
            else
            {nameOfMovie3 = "не готов"}

            intent.putExtra("nameOfMovie1", nameOfMovie1)
            intent.putExtra("nameOfMovie2", nameOfMovie2)
            intent.putExtra("nameOfMovie3", nameOfMovie3)

            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}