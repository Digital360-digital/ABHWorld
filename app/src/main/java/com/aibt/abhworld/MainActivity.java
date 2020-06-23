package com.aibt.abhworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeb = findViewById(R.id.abhworld);
        mWeb.getSettings().setJavaScriptEnabled(true);
        mWeb.getSettings().setLoadsImagesAutomatically(true);
        mWeb.setWebViewClient(new WebViewClient());
        mWeb.loadUrl("https://abhworld.info/");
    }

    @Override
    public void onBackPressed() {
        if (mWeb.canGoBack()) {
            mWeb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
