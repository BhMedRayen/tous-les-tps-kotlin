package com.mohamedrayen.boitededialogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webV = findViewById<WebView>(R.id.webView)
        webV.loadUrl("https://google.com")
        webV.settings.javaScriptEnabled = true
        webV.settings.setSupportZoom(true)
    }
}