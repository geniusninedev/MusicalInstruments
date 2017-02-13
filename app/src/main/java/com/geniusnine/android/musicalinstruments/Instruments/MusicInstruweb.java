package com.geniusnine.android.musicalinstruments.Instruments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.musicalinstruments.R;

public class MusicInstruweb extends AppCompatActivity {
WebView Musicweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_instruweb);
        Musicweb = (WebView) findViewById(R.id.MusicWebView);
        Musicweb.setBackgroundColor(0x00000000);
        WebSettings BasicWebSettings = Musicweb.getSettings();
        BasicWebSettings.setBuiltInZoomControls(true);
        Musicweb.setWebViewClient(new MusicInstruweb.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            Musicweb.loadUrl("file:///android_res/raw/sitar.html");
        }  else if (position == 1) {
            Musicweb.loadUrl("file:///android_res/raw/dilbura.html");
        }else if (position == 2) {
            Musicweb.loadUrl("file:///android_res/raw/tabla.html");
        }
        else if (position == 3) {
            Musicweb.loadUrl("file:///android_res/raw/santoor.html");

        }
        else if (position == 4) {
            Musicweb.loadUrl("file:///android_res/raw/tanpura.html");
        }else if (position == 5) {
            Musicweb.loadUrl("file:///android_res/raw/sarod.html");
        }else if (position == 6) {
            Musicweb.loadUrl("file:///android_res/raw/har.html");
        } else if (position == 7) {
            Musicweb.loadUrl("file:///android_res/raw/swar.html");
        } else if (position == 8) {
            Musicweb.loadUrl("file:///android_res/raw/bansuri.html");

        }else if (position == 9) {
            Musicweb.loadUrl("file:///android_res/raw/sarangi.html");
        }else if (position == 10) {
            Musicweb.loadUrl("file:///android_res/raw/pakh.html");
        }else if (position == 11) {
            Musicweb.loadUrl("file:///android_res/raw/sheh.html");
        }else if (position == 12) {
            Musicweb.loadUrl("file:///android_res/raw/thavil.html");
        } else if (position == 13) {
            Musicweb.loadUrl("file:///android_res/raw/veena.html");

        }else if (position == 14) {
            Musicweb.loadUrl("file:///android_res/raw/nada.html");
        }else if (position == 15) {
            Musicweb.loadUrl("file:///android_res/raw/khan.html");
        } else if (position == 16) {
            Musicweb.loadUrl("file:///android_res/raw/mor.html");

        }else if (position == 17) {
            Musicweb.loadUrl("file:///android_res/raw/sru.html");
        }else if (position == 18) {
            Musicweb.loadUrl("file:///android_res/raw/flute.html");
        }else if (position == 19) {
            Musicweb.loadUrl("file:///android_res/raw/tambura.html");
        }else if (position == 20) {
            Musicweb.loadUrl("file:///android_res/raw/mrudanga.html");
        }else if (position == 21) {
            Musicweb.loadUrl("file:///android_res/raw/violin.html");
        }else if (position == 22) {
            Musicweb.loadUrl("file:///android_res/raw/ghatam.html");
        }else if (position == 23) {
            Musicweb.loadUrl("file:///android_res/raw/tumbi.html");
        }else if (position == 24) {
            Musicweb.loadUrl("file:///android_res/raw/bassoon.html");
        }else if (position == 25) {
            Musicweb.loadUrl("file:///android_res/raw/piano.html");
        }else if (position == 26) {
            Musicweb.loadUrl("file:///android_res/raw/saxoo.html");
        }else if (position == 27) {
            Musicweb.loadUrl("file:///android_res/raw/djembe.html");
        }else if (position == 28) {
            Musicweb.loadUrl("file:///android_res/raw/clarinet.html");
        }else if (position == 29) {
            Musicweb.loadUrl("file:///android_res/raw/ela.html");
        }else if (position == 30) {
            Musicweb.loadUrl("file:///android_res/raw/snare.html");
        }else if (position == 31) {
            Musicweb.loadUrl("file:///android_res/raw/chimes.html");
        }else if (position == 32) {
            Musicweb.loadUrl("file:///android_res/raw/tubular.html");
        }else if (position == 33) {
            Musicweb.loadUrl("file:///android_res/raw/marimba.html");
        }else if (position == 34) {
            Musicweb.loadUrl("file:///android_res/raw/trombone.html");
        }else if (position == 35) {
            Musicweb.loadUrl("file:///android_res/raw/trumpet.html");
        }else if (position == 36) {
            Musicweb.loadUrl("file:///android_res/raw/guitar.html");
        }else if (position == 37) {
            Musicweb.loadUrl("file:///android_res/raw/banjo.html");
        }else if (position == 38) {
            Musicweb.loadUrl("file:///android_res/raw/oboe.html");
        }else if (position == 39) {
            Musicweb.loadUrl("file:///android_res/raw/cello.html");
        }else if (position == 40) {
            Musicweb.loadUrl("file:///android_res/raw/double2.html");
        }else if (position == 41) {
            Musicweb.loadUrl("file:///android_res/raw/dholak.html");
        }else if (position == 42) {
            Musicweb.loadUrl("file:///android_res/raw/pungi.html");
        }else if (position == 43) {
            Musicweb.loadUrl("file:///android_res/raw/tam.html");
        }else if (position == 44) {
            Musicweb.loadUrl("file:///android_res/raw/xylo.html");
        }else if (position == 45) {
            Musicweb.loadUrl("file:///android_res/raw/maraca.html");
        }else if (position == 46) {
            Musicweb.loadUrl("file:///android_res/raw/harp.html");
        }else if (position == 47) {
            Musicweb.loadUrl("file:///android_res/raw/panflute.html");
        }else if (position == 48) {
            Musicweb.loadUrl("file:///android_res/raw/tassa.html");
        }else if (position == 49) {
            Musicweb.loadUrl("file:///android_res/raw/tun.html");
        }else if (position == 50) {
            Musicweb.loadUrl("file:///android_res/raw/mouth.html");
        }else if (position == 51) {
            Musicweb.loadUrl("file:///android_res/raw/agung.html");
        }else if (position == 52) {
            Musicweb.loadUrl("file:///android_res/raw/agun.html");
        }else if (position == 53) {
            Musicweb.loadUrl("file:///android_res/raw/cas.html");
        }else if (position == 54) {
            Musicweb.loadUrl("file:///android_res/raw/clap.html");
        }else if (position == 55) {
            Musicweb.loadUrl("file:///android_res/raw/glock.html");
        }else if (position == 56) {
            Musicweb.loadUrl("file:///android_res/raw/hand.html");
        }else if (position == 57) {
            Musicweb.loadUrl("file:///android_res/raw/mbira.html");
        }else if (position == 58) {
            Musicweb.loadUrl("file:///android_res/raw/triangle.html");
        }else if (position == 59) {
            Musicweb.loadUrl("file:///android_res/raw/wood.html");
        }else if (position == 60) {
            Musicweb.loadUrl("file:///android_res/raw/agida.html");
        }else if (position == 61) {
            Musicweb.loadUrl("file:///android_res/raw/cuica.html");
        }else if (position == 62) {
            Musicweb.loadUrl("file:///android_res/raw/dabakan.html");
        }else if (position == 63) {
            Musicweb.loadUrl("file:///android_res/raw/drumkit.html");
        }else if (position == 64) {
            Musicweb.loadUrl("file:///android_res/raw/homemade.html");
        }
    }


    public class WebViewClient extends android.webkit.WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}



