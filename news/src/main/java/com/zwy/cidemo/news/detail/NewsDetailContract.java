package com.zwy.cidemo.news.detail;


import com.zwy.base.base.BasePresenter;
import com.zwy.base.base.BaseView;
import com.zwy.cidemo.news.data.bean.MessageDetail;

public interface NewsDetailContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showNewsDetail(MessageDetail detail);

    }

    interface Presenter extends BasePresenter {

        /**
         * 获取最新列表
         *
         * @param newsId 新闻id
         */
        void getNewsDetail(String newsId);

    }

}
