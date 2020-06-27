package com.zy.fund.presenter;


import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.zy.fund.beans.User;
import com.zy.fund.iview.RegisterApi;
import com.zy.fund.network.ZhuCeQueryBuilder;

import rx.Subscriber;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 15:43
 */
public class RegisterPresenter extends MvpBasePresenter<RegisterApi> {
    public void registerResult(String userName,String password){
        final RegisterApi registerApi = getView();
        if (registerApi != null){
            Subscriber<User> subscriber = new Subscriber<User>(){
                @Override
                public void onCompleted() {
                    registerApi.showSuccess(); //显示注册成功
                    registerApi.disMiss();//取消等待
                }

                @Override
                public void onError(Throwable e) {
                    registerApi.showError();//注册失败
                    registerApi.disMiss();
                }

                @Override
                public void onNext(User user) {
                    Log.d("user===",user.toString());
                    registerApi.register(user);

                }
            };
            ZhuCeQueryBuilder.getInstance().queryRegister(subscriber,userName,password);
        }
    }


}
