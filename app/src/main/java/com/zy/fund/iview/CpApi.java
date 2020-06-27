package com.zy.fund.iview;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.zy.fund.beans.Product;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 20:38
 */
public interface CpApi extends MvpView {

    void queryInfo(Product product);
    void showSuccess();
    void showError();
}
