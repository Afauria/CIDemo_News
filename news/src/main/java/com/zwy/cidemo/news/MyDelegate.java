package com.zwy.cidemo.news;

import android.support.annotation.Keep;

import com.orhanobut.logger.Logger;
import com.zwy.cidemo.base.base.IApplicationDelegate;
import com.zwy.cidemo.base.base.ViewManager;

@Keep
public class MyDelegate implements IApplicationDelegate {

    @Override
    public void onCreate() {
        Logger.init("pattern");
        //主动添加
        ViewManager.getInstance().addFragment(0, NewsFragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
