package org.apache.cordova.x5engine;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;

import io.cordova.hellocordova.R;


/**
 * Created by aczhengliu on 17-7-3.
 */

public class CordovaX5WebViewActivity extends CordovaActivity {


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_cordova_with_layout);
        super.init();
        // Load your application
        // launchUrl = "file:///android_asset/www/index.html"
        Log.i("testlz","oncreaste version:" + QbSdk.getTbsVersion(CordovaX5WebViewActivity.this));
//        loadUrl(launchUrl);
        loadUrl("http://www.baidu.com");
    }


    @Override
    protected CordovaWebView makeWebView() {
        Log.i("testlz","makeWebView:");
        X5WebView webView = (X5WebView)findViewById(R.id.cordovaWebView);
        Log.i("testlz","makeWebView version:" + QbSdk.getTbsVersion(CordovaX5WebViewActivity.this));
        return new CordovaWebViewImpl(new X5WebViewEngine(webView));
    }

    @Override
    protected void createViews() {
        //Why are we setting a constant as the ID? This should be investigated
//        appView.getView().setId(100);
//        appView.getView().setLayoutParams(new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));
//
//        setContentView(appView.getView());
        Log.i("testlz","createViews version:" + QbSdk.getTbsVersion(CordovaX5WebViewActivity.this));
        if (preferences.contains("BackgroundColor")) {
            int backgroundColor = preferences.getInteger("BackgroundColor", Color.BLACK);
            // Background of activity:
            appView.getView().setBackgroundColor(backgroundColor);
        }

        appView.getView().requestFocusFromTouch();
    }

}

