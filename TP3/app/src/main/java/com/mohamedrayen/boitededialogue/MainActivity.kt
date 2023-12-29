package com.mohamedrayen.boitededialogue

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nom = findViewById<EditText>(R.id.nom)
        val prenom = findViewById<EditText>(R.id.prenom)
        val email = findViewById<EditText>(R.id.email)
        val valid = findViewById<Button>(R.id.button)
        val snack = findViewById<Button>(R.id.button2)
        val webBtn = findViewById<Button>(R.id.button3)
        valid.setOnClickListener {
            if (nom.getText().length === 0 || prenom.getText().length === 0 || email.getText().length === 0) {
                val ad: AlertDialog.Builder
                ad = AlertDialog.Builder(this)
                ad.setMessage("Les champs ne doivent pas être vide")
                ad.setTitle("Error")
                ad.setIcon(android.R.drawable.btn_dialog)
                ad.setPositiveButton(
                    "yes"
                ) { dialogInterface, i -> finish() }
                val a = ad.create()
                a.show()
            }
            else {
                val progressDialog = ProgressDialog(this@MainActivity)
                progressDialog.setTitle("Kotlin Progress Dialog")
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
                progressDialog.setMessage("Downloading music, please wait")
                progressDialog.setIndeterminate(true)
                progressDialog.setProgress(0)
                progressDialog.show()
            }

        }

     snack.setOnClickListener {
         val snack = Snackbar.make(it,"Un Snackbar simple ",Snackbar.LENGTH_LONG)
         snack.show()

     }

        webBtn.setOnClickListener {
            val intent = Intent(this,web::class.java)
            startActivity(intent)
        }

    }

}