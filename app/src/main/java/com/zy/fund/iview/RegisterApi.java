package com.zy.fund.iview;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zy.fund.beans.User;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 13:30
 */
public interface RegisterApi extends MvpView {

    void register(User user);

    void showSuccess();

    void showError();

    void disMiss();

}