package com.geniusnine.android.musicalinstruments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Intro extends AppCompatActivity {
WebView Introductionweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Introductionweb = (WebView) findViewById(R.id.IntroductionWebView);
        WebSettings webSetting = Introductionweb.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        Introductionweb.setWebViewClient(new Intro.WebViewClient());
        Introductionweb.loadUrl("file:///android_res/raw/intoo.html");
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


