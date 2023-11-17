package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DanceHallActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_hall);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://tidal.com/browse/playlist/7fd61f0f-0e2d-4563-83fd-784dd39c2a73");
    }
}