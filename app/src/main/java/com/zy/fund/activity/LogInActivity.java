package com.zy.fund.activity;

import androidx.annotation.NonNull;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.zy.fund.R;
import com.zy.fund.beans.User;
import com.zy.fund.constans.Constans;
import com.zy.fund.iview.RegisterApi;
import com.zy.fund.presenter.RegisterPresenter;

import java.util.UUID;

public class LogInActivity extends MvpActivity<RegisterApi, RegisterPresenter> implements RegisterApi {

    @butterknife.BindView(R.id.username)
    android.widget.EditText username;
    @butterknife.BindView(R.id.password)
    android.widget.EditText password;
    @butterknife.BindView(R.id.login)
    android.widget.Button login;
    @butterknife.BindView(R.id.register)
    Button register;
    @butterknife.BindView(R.id.btn_youke)
    Button btnYouke;


    private String userName = "";
    private String passWord = "";
    private MaterialDialog materialProgress, registerSuccess, registerFail;
    private Button btn_youke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        butterknife.ButterKnife.bind(this);
        initLogIn();
    }

    private void initLogIn() {

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = username.getText().toString();
                passWord = password.getText().toString();
                if (!userName.equals("") || !passWord.equals("")) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            getPresenter().registerResult(userName, passWord);
                        }
                    }).start();
                    materialProgress = new MaterialDialog.Builder(LogInActivity.this)
                            .title("请等待")
                            .content("请稍等！")
                            .progress(true, 0)
                            .show();
                } else {
                    new MaterialDialog.Builder(LogInActivity.this)
                            .title("信息不完整")
                            .content("请补充注册信息")
                            .positiveText("确认")
                            .negativeText("取消")
                            .show();
                }

            }
        });
        btnYouke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("this","12312321");
                User youke = new User();
                String uuid = String.valueOf(UUID.randomUUID());
                youke.setUserId(uuid);
                youke.setUserName("游客"+ uuid);
                Constans.user = youke;
                startActivity(new Intent(LogInActivity.this, MainActivity.class));
            }
        });


    }

    @NonNull
    @Override
    public RegisterPresenter createPresenter() {
        return new RegisterPresenter();
    }


    @Override
    public void register(User user) {
        Constans.user = user;
    }

    @Override
    public void showSuccess() {

        new MaterialDialog.Builder(LogInActivity.this)
                .title("注册成功")
                .content("恭喜注册成功")
                .positiveText("确认")
                .negativeText("取消")
                .show();
        startActivity(new Intent(LogInActivity.this, MainActivity.class));
    }

    @Override
    public void showError() {

        registerFail = new MaterialDialog.Builder(LogInActivity.this)
                .title("成功失败")
                .positiveText("确认")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        startActivity(new Intent(LogInActivity.this, MainActivity.class));
                    }
                })
                .show();

    }

    @Override
    public void disMiss() {
        materialProgress.dismiss();
    }
}
