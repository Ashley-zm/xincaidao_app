package com.zy.fund.network;

import com.zy.fund.beans.User;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/1/27 0027
 * Time: 13:59
 */
public interface Api {

    @POST("/")
    Observable<User> register(@Query("userId") String userName,
                              @Query("password") String password);
}
