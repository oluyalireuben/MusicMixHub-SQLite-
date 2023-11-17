package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class RegaeActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regae);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.musicgrotto.com/best-reggae-songs/");
    }
}