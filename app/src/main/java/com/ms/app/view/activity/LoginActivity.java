package com.ms.app.view.activity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

import com.alipay.mobile.antui.basic.AUButton;
import com.ms.app.R;
import com.ms.app.presenter.activity.LoginActivityPresenter;

import org.ms.module.base.view.BaseAppCompatActivity;

@RequiresApi(api = Build.VERSION_CODES.N)
public class LoginActivity extends BaseAppCompatActivity<LoginActivityPresenter> implements ILoginActivity {


    private static final String TAG = "LoginActivity";

    private AUButton auButtonLogin;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected boolean isFullScreen() {
        return true;
    }


    @Override
    protected void initView() {

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(this, MainActivity.class));

    }

    @Override
    public void login(String username, String password) {

    }

    @Override
    public void onLoginResultCallBack() {

    }

    @Override
    protected LoginActivityPresenter initPresenter() {
        return new LoginActivityPresenter(this);
    }
}
