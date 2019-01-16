package com.zwy.news.main;


import com.zwy.base.base.BasePresenter;
import com.zwy.base.base.BaseView;
import com.zwy.news.data.bean.StoryList;

/**
 * <p>类说明</p>
 */
public interface NewsListContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showNewsList(StoryList info);

    }

    interface Presenter extends BasePresenter {

        /**
         * 获取最新列表
         *
         * @param date
         */
        void getNewMessages(int page, int size, String date);

    }

}
