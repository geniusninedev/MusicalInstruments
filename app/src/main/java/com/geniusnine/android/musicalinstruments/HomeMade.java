package com.geniusnine.android.musicalinstruments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HomeMade extends AppCompatActivity {
WebView Homeweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_made);
        Homeweb = (WebView) findViewById(R.id.HomeWebView);
        WebSettings webSetting = Homeweb.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        Homeweb.setWebViewClient(new HomeMade.WebViewClient());
        Homeweb.loadUrl("file:///android_res/raw/homemade.html");
    }



    class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}

