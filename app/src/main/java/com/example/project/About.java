package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        myWebView = (WebView) findViewById(R.id.about);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("///android_asset/about.html");

    }

}