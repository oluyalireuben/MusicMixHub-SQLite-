package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HiphopActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiphop);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://hiphopdx.com/news/id.60586/title.best-hip-hop-songs-of-the-year");
    }
}