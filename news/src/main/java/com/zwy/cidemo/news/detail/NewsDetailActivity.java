package com.zwy.cidemo.news.detail;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zwy.base.base.BaseActivity;

@Route(path = "/news/detail")
public class NewsDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NewsDetailView detailView = new NewsDetailView(this);
        setContentView(detailView);
        String id = getIntent().getStringExtra("id");
        new NewsDetailPresenter(detailView).getNewsDetail(id);
    }

}
