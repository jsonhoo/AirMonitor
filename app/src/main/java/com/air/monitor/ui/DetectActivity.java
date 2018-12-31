package com.air.monitor.ui;


import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

import com.air.monitor.R;
import com.air.monitor.widget.RateTextCircularProgressBar;

public class DetectActivity extends BaseActivity {

    private RateTextCircularProgressBar mTVOCTextCircularProgressBar;
    private RateTextCircularProgressBar mHCHOTextCircularProgressBar;


    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_detect, null);
    }

    @Override
    protected void initData() {
        super.initData();
        mTitleView.setTitleText(R.string.detection);
        mTitleView.setRightText(getString(R.string.save), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(ContactActivity.class);
            }
        });

        mTVOCTextCircularProgressBar = (RateTextCircularProgressBar) findViewById(R.id.tvoc_progress_bar);
        mTVOCTextCircularProgressBar.setMax(100);
        mTVOCTextCircularProgressBar.getCircularProgressBar().setCircleWidth(20);
        mTVOCTextCircularProgressBar.setProgress(56);

        mHCHOTextCircularProgressBar = (RateTextCircularProgressBar) findViewById(R.id.hcho_progress_bar);
        mHCHOTextCircularProgressBar.setMax(100);
        mHCHOTextCircularProgressBar.getCircularProgressBar().setCircleWidth(20);
        mHCHOTextCircularProgressBar.setProgress(30);
    }

    public void menu(View view) {
        toActivity(AboutActivity.class);
    }


    public void detect(View view) {
        showDialog();
    }

    private Dialog dialog;

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = View.inflate(this, R.layout.dialog_detect_type, null);
        Button btnCancel=view.findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        builder.setView(view);
        dialog = builder.show();
    }
}
