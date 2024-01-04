package com.mohamedrayen.tpsharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var savedData : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val remember = findViewById<CheckBox>(R.id.checkBox)
    }
    private fun saveInfoDate (savedData : ArrayList<String>) {
        val sharedPreferences : SharedPreferences = getSharedPreferences("name", MODE_PRIVATE)
        val save : SharedPreferences.Editor = sharedPreferences.edit()
        save.putString("data", savedData.toString()).commit()
    }
    
}