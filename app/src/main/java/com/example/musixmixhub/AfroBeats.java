package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AfroBeats extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afro_beats);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/hashtag/afrobeats");
    }
}