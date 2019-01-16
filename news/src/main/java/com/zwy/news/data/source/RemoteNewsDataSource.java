package com.zwy.news.data.source;


import com.zwy.base.base.InfoCallback;
import com.zwy.base.http.DataType;
import com.zwy.base.http.HttpClient;
import com.zwy.base.http.OnResultListener;
import com.zwy.news.Constants;
import com.zwy.news.data.NewsDataSource;
import com.zwy.news.data.bean.MessageDetail;
import com.zwy.news.data.bean.StoryList;

public class RemoteNewsDataSource implements NewsDataSource {

    @Override
    public void getNewsList(String date, final InfoCallback<StoryList> callback) {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.ZHIHU_DAILY_BEFORE_MESSAGE)
                .url(date)
                .bodyType(DataType.JSON_OBJECT, StoryList.class)
                .build();
        client.get(new OnResultListener<StoryList>() {

            @Override
            public void onSuccess(StoryList result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(int code, String message) {
                callback.onError(code, message);
            }

            @Override
            public void onFailure(String message) {
                callback.onError(0, message);
            }
        });
    }


    @Override
    public void getNewsDetail(String id, final InfoCallback<MessageDetail> callback) {
        HttpClient client = new HttpClient.Builder()
                .baseUrl(Constants.ZHIHU_DAILY_BEFORE_MESSAGE_DETAIL)
                .url(id)
                .bodyType(DataType.JSON_OBJECT, MessageDetail.class)
                .build();
        client.get(new OnResultListener<MessageDetail>() {

            @Override
            public void onSuccess(MessageDetail result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(int code, String message) {
                callback.onError(code, message);
            }

            @Override
            public void onFailure(String message) {
                callback.onError(0, message);
            }
        });
    }


}
