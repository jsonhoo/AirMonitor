package com.air.monitor.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.air.monitor.R;

public class AboutActivity extends BaseActivity{

    @Override
    protected View initView() {
        return View.inflate(this,R.layout.activity_about,null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(R.string.menu_about);
    }

}
