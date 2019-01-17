package com.zwy.cidemo.news.detail;


import com.zwy.base.base.InfoCallback;
import com.zwy.cidemo.news.data.NewsDataSource;
import com.zwy.cidemo.news.data.bean.MessageDetail;
import com.zwy.cidemo.news.data.source.RemoteNewsDataSource;

public class NewsDetailPresenter implements NewsDetailContract.Presenter {

    private NewsDetailContract.View mView;
    private NewsDataSource mDataSource;

    public NewsDetailPresenter(NewsDetailContract.View view) {
        mView = view;
        mDataSource = new RemoteNewsDataSource();
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }


    @Override
    public void getNewsDetail(String newsId) {
        mDataSource.getNewsDetail(newsId, new InfoCallback<MessageDetail>() {
            @Override
            public void onSuccess(MessageDetail detail) {
                if (mView.isActive()) {
                    mView.showNewsDetail(detail);
                }
            }

            @Override
            public void onError(int code, String message) {

            }
        });
    }

}
