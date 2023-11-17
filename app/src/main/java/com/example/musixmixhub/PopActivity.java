package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PopActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.billboard.com/lists/best-pop-songs-all-time-hits/100-del-shannon-runaway-2/");
    }
}