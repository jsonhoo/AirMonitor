package com.air.monitor.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.air.monitor.R;
import com.air.monitor.utils.StatusBarUtils;
import com.air.monitor.widget.TitleView;


public abstract class BaseActivity extends AppCompatActivity {

    protected View mView;
    protected TitleView mTitleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_base, null);
        mView = initView();
        FrameLayout baseContent = (FrameLayout) view.findViewById(R.id.base_content_view);
        baseContent.addView(mView);
        setContentView(view);
        mTitleView = (TitleView) view.findViewById(R.id.title);
        StatusBarUtils.setStatusBarColor(this, getResources().getColor(R.color.titleColor));
        initData();
    }

    protected abstract View initView();

    protected void initData() {
    }

    protected void toActivity(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
