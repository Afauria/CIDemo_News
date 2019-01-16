package com.zwy.news.main;

import com.zwy.base.base.InfoCallback;
import com.zwy.news.data.NewsDataSource;
import com.zwy.news.data.bean.StoryList;
import com.zwy.news.data.source.RemoteNewsDataSource;

/**
 * <p>类说明</p>
 */
public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListContract.View mView;
    private NewsDataSource mDataSource;

    public NewsListPresenter(NewsListContract.View view) {
        mView = view;
        mDataSource = new RemoteNewsDataSource();
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getNewMessages(int page, int size, String date) {
        mDataSource.getNewsList(date, new InfoCallback<StoryList>() {
            @Override
            public void onSuccess(StoryList info) {
                if (mView.isActive()) {
                    mView.showNewsList(info);
                }
            }

            @Override
            public void onError(int code, String message) {

            }
        });
    }
}
