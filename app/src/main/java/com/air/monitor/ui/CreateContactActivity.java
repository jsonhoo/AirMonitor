package com.air.monitor.ui;


import android.view.View;

import com.air.monitor.R;

public class CreateContactActivity extends BaseActivity {
    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_create_contact, null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(getString(R.string.create_contact));
    }

    public void add(View view) {
        toActivity(RecordActivity.class);
    }
}
