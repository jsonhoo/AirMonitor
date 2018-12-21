package com.air.monitor.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.air.monitor.R;


public class TitleView extends RelativeLayout {

    private Context mContext;

    private RelativeLayout rlLeft;
    private LinearLayout llRight;

    private ImageView titleLeft;
    private TextView titleText;
    private ImageView titleRight;
    private TextView tvRight;


    public TitleView(Context context) {
        super(context);
        init(context);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        LayoutInflater.from(context).inflate(R.layout.view_title, this);

        rlLeft = (RelativeLayout) findViewById(R.id.rl_left);
        llRight = (LinearLayout) findViewById(R.id.ll_right);
        rlLeft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        titleLeft = (ImageView) findViewById(R.id.title_left);
        titleText = (TextView) findViewById(R.id.title_text);
        titleRight = (ImageView) findViewById(R.id.title_right);
        tvRight = (TextView) findViewById(R.id.tv_right);
    }


    public void setTitleText(int res) {
        titleText.setText(res);
    }

    public void setTitleText(String text) {
        if (!TextUtils.isEmpty(text)) {
            titleText.setText(text);
        } else {
            titleText.setText("");
        }
    }

    public void setLeftOnClickListener(OnClickListener l) {
        if (titleLeft.getVisibility() == View.GONE) {
            titleLeft.setVisibility(View.VISIBLE);
            rlLeft.setClickable(true);
        }
        rlLeft.setOnClickListener(l);
    }

    public void setLeftImageView(int resId) {
        titleLeft.setImageResource(resId);
    }

    public void setLeftGone() {
        titleLeft.setVisibility(GONE);
        rlLeft.setClickable(false);
    }


    public void setTitleTextColor(int color) {
        titleText.setTextColor(color);
    }

    public void setLeftOnClickListener(OnClickListener l, int resId) {
        titleLeft.setImageResource(resId);
        setLeftOnClickListener(l);
    }

    public void setRightVisible(int visible) {
        titleRight.setVisibility(visible);
        llRight.setClickable(View.VISIBLE == visible);
    }

    public void setRightTextVisible(int visible) {
        tvRight.setVisibility(visible);
        llRight.setClickable(View.VISIBLE == visible);
    }


    public void setRightOnClickListener(OnClickListener l) {
        if (titleRight.getVisibility() == View.GONE) {
            titleRight.setVisibility(View.VISIBLE);
            llRight.setClickable(true);
        }
        llRight.setOnClickListener(l);
    }

    public void setRightOnClickListener(OnClickListener l, int resId) {
        titleRight.setImageResource(resId);
        setRightOnClickListener(l);
    }

    public void setRightText(String text, OnClickListener l) {
        titleRight.setVisibility(View.GONE);
        tvRight.setVisibility(View.VISIBLE);
        tvRight.setText(text);
        llRight.setClickable(true);
        llRight.setOnClickListener(l);
    }

    public TextView getTitleTextView() {
        return titleText;
    }

    public ImageView getLeftImageView() {
        return titleLeft;
    }

    public ImageView getRightImageView() {
        return titleRight;
    }

    public TextView getTvRightView() {
        return tvRight;
    }

}
