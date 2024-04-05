package com.example.webtoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView = findViewById(R.id.xml_Webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://trends.google.com/trends/")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (myWebView.canGoBack()){
            myWebView.goBack()
        } else{
            super.onBackPressed()
        }
    }
}
