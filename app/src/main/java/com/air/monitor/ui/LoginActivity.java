package com.air.monitor.ui;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.air.monitor.R;

public class LoginActivity extends BaseActivity{
    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_login,null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(R.string.login);

        TextView tvForgetPwd = findViewById(R.id.forget_pwd);
        tvForgetPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(FindPwdActivity.class);
            }
        });

        TextView tvRegister = findViewById(R.id.register);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(RegisterActivity.class);
            }
        });

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(DetectActivity.class);
            }
        });
    }
}
