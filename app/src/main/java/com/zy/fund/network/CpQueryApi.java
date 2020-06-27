package com.zy.fund.network;

import com.zy.fund.beans.Product;

import retrofit2.http.GET;
import rx.Observable;
import rx.Producer;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 20:52
 */
public interface CpQueryApi {
    @GET("zcgjj/?key=1f2e1b2825d766766563cb945e40cf6b")
    Observable<Product> queryDatas();

}
