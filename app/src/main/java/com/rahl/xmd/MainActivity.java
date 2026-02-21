package com.rahl.xmd;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        setContentView(webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://rahl-tech.onrender.com");

    }

}
