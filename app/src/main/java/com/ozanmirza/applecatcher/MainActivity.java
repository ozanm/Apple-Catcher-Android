package com.ozanmirza.applecatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView main_view = findViewById(R.id.main_view);
        main_view.getSettings().setJavaScriptEnabled(true);
        main_view.getSettings().getAllowFileAccess();
        main_view.getSettings().getAllowContentAccess();
        main_view.getSettings().setDomStorageEnabled(true);
        main_view.setWebViewClient(new WebViewClient());
        main_view.loadUrl("file:///android_asset/index.html");
    }
}
