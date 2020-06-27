package com.zy.fund.network;

import com.zy.fund.beans.User;

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
 * Date: 2020/1/27 0027
 * Time: 13:55
 */
public class ZhuCeQueryBuilder {


    private static final String BASE_URL = "http://lab.isaaclin.cn/nCoV/api/";
    private static final int DEFAULT_TIME_OUT = 3;
    private static Api api;


    private ZhuCeQueryBuilder(){
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS);//设置默认超时

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        api = retrofit.create(Api.class);

    }

    //在访问QueryBuilder时创建单例
    private static class SingletonHolder {
        private static final ZhuCeQueryBuilder INSTANCE = new ZhuCeQueryBuilder();
    }


    public static ZhuCeQueryBuilder getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /*
     * 获取首页数据
     * */

    public void queryRegister(Subscriber<User> subscriber,String userName,String userPassword){
        api.register(userName,userPassword)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }



}
