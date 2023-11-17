package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class RnBActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rn_bactivity);


        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.oprahdaily.com/entertainment/g33896452/best-rnb-songs/");
    }
}