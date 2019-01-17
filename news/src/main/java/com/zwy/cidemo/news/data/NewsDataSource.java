package com.zwy.cidemo.news.data;


import com.zwy.base.base.InfoCallback;
import com.zwy.cidemo.news.data.bean.MessageDetail;
import com.zwy.cidemo.news.data.bean.StoryList;

public interface NewsDataSource {


    /**
     * 获取当天的新闻列表
     *
     * @param date     日期
     * @param callback 回调
     */
    void getNewsList(String date, InfoCallback<StoryList> callback);

    /**
     * 获取某条新闻详情
     *
     * @param id       新闻Id
     * @param callback 回调
     */
    void getNewsDetail(String id, InfoCallback<MessageDetail> callback);

}

