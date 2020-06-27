package com.zy.fund.network;

import com.zy.fund.beans.Product;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 20:48
 */
public class CPQueryBuilder {
    private static final String BASE_URL = "http://web.juhe.cn:8080/fund/";
    private static final int DEFAULT_TIME_OUT = 3;
    private static CpQueryApi cpQueryApi;


    private CPQueryBuilder() {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS);//设置默认超时

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        cpQueryApi = retrofit.create(CpQueryApi.class);

    }

    //在访问QueryBuilder时创建单例
    private static class SingletonHolder {
        private static final CPQueryBuilder INSTANCE = new CPQueryBuilder();
    }


    public static CPQueryBuilder getInstance() {
        return CPQueryBuilder.SingletonHolder.INSTANCE;
    }

    /*
     * 获取产品数据
     * */
    public void queryData(Subscriber<Product> subscriber ){
        cpQueryApi.queryDatas()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


}
