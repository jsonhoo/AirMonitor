package com.air.monitor.ui;


import android.view.View;

import com.air.monitor.R;

public class FindPwdActivity extends BaseActivity{
    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_find_pwd,null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(R.string.find_pwd);
    }
}
