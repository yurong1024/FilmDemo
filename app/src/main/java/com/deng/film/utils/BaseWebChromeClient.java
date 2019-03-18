package com.deng.film.utils;


import android.view.View;
import android.webkit.WebChromeClient;

public class BaseWebChromeClient extends WebChromeClient {

    private IVideo mIVideo;

    public BaseWebChromeClient(IVideo mIVideo) {
        this.mIVideo = mIVideo;
    }

    @Override
    public void onShowCustomView(View view, CustomViewCallback callback) {
        if (mIVideo != null) {
            mIVideo.onShowCustomView(view, callback);
        }

    }

    @Override
    public void onHideCustomView() {
        if (mIVideo != null) {
            mIVideo.onHideCustomView();
        }
    }

}
