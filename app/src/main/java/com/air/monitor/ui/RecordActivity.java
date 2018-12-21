package com.air.monitor.ui;

import android.view.View;

import com.air.monitor.R;

public class RecordActivity extends BaseActivity {

    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_record, null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(getString(R.string.history_record));
        mTitleView.setRightOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }, R.mipmap.chart);
    }


}
