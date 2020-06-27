package com.zy.fund.presenter;

import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.zy.fund.beans.Product;
import com.zy.fund.beans.User;
import com.zy.fund.iview.CpApi;
import com.zy.fund.iview.RegisterApi;
import com.zy.fund.network.CPQueryBuilder;
import com.zy.fund.network.ZhuCeQueryBuilder;

import rx.Subscriber;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 20:57
 */
public class CpPresenter extends MvpBasePresenter<CpApi> {

    public void getCPData(){
        final CpApi cpApi = getView();
        if (cpApi != null){
            Subscriber<Product> subscriber = new Subscriber<Product>(){
                @Override
                public void onCompleted() {
                    cpApi.showSuccess(); //

                }

                @Override
                public void onError(Throwable e) {
                    cpApi.showError();//
                    Log.d("error",e.toString());
                }

                @Override
                public void onNext(Product product) {
                    cpApi.queryInfo(product);

                }
            };
            CPQueryBuilder.getInstance().queryData(subscriber);
        }
    }

}
