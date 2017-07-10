package org.apache.cordova.x5engine;

import android.os.Bundle;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;



/**
 * Created by aczhengliu on 17-7-3.
 */

public class CordovaX5WebViewActivity extends CordovaActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        //自定义native页面布局　step 1
//        setContentView(R.layout.activity_test_cordova_with_layout);
//        ((TextView)findViewById(R.id.tvTip)).setText("X5CoreVersion:" + QbSdk.getTbsVersion(CordovaX5WebViewActivity.this));
        Log.i(TAG, "CordovaX5WebViewActivity: x5CoreVersion:" + QbSdk.getTbsVersion(CordovaX5WebViewActivity.this));
    }

    @Override
    protected CordovaWebView makeWebView() {
        //自定义native页面布局　step 2
//      X5WebView webView = (X5WebView)findViewById(R.id.cordovaWebView);
        X5WebView webView = new X5WebView(CordovaX5WebViewActivity.this);
        return new CordovaWebViewImpl(new X5WebViewEngine(webView));
    }

}


