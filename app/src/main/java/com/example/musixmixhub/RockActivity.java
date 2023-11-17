package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class RockActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.google.com/amp/s/digitaldreamdoor.com/mobile/rock/songs-rock-greatest.html");
    }
}