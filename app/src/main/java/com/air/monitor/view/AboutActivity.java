package com.air.monitor.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.air.monitor.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        RelativeLayout rl_about = (RelativeLayout)findViewById(R.id.rl_about);
        rl_about.setOnClickListener(this);

        RelativeLayout rl_network = (RelativeLayout)findViewById(R.id.rl_network);
        rl_network.setOnClickListener(this);


        RelativeLayout rl_up_data = (RelativeLayout)findViewById(R.id.rl_up_data);
        rl_up_data.setOnClickListener(this);


        RelativeLayout rl_set_time = (RelativeLayout)findViewById(R.id.rl_set_time);
        rl_set_time.setOnClickListener(this);

        RelativeLayout rl_set_mark = (RelativeLayout)findViewById(R.id.rl_set_mark);
        rl_set_mark.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rl_about:
                break;
            case R.id.rl_network:
                break;
            case R.id.rl_up_data:
                break;
            case R.id.rl_set_time:
                break;
            case R.id.rl_set_mark:
                break;
        }
    }
}
