package com.zwy.cidemo.news;

import android.support.annotation.Keep;
import android.view.View;

import com.zwy.cidemo.base.base.BaseFragment;
import com.zwy.cidemo.base.base.IViewDelegate;


@Keep
public class MyViewDelegate implements IViewDelegate {

    @Override
    public BaseFragment getFragment(String name) {
        return NewsFragment.newInstance();
    }

    @Override
    public View getView(String name) {
        return null;
    }
}
