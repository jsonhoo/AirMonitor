package com.air.monitor.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.air.monitor.R;

public class UpdataToServerActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_email,tv_sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_data);

        RelativeLayout rl_handle_server = (RelativeLayout)findViewById(R.id.rl_handle_server);
        rl_handle_server.setOnClickListener(this);


        RelativeLayout rl_auto_to_server = (RelativeLayout)findViewById(R.id.rl_auto_to_server);
        rl_auto_to_server.setOnClickListener(this);


        RelativeLayout rl_dump_sd = (RelativeLayout)findViewById(R.id.rl_dump_sd);
        rl_dump_sd.setOnClickListener(this);


        RelativeLayout rl_dump_email = (RelativeLayout)findViewById(R.id.rl_dump_email);
        rl_dump_email.setOnClickListener(this);

        RelativeLayout rl_dump_usb  = (RelativeLayout)findViewById(R.id.rl_dump_usb);
        rl_dump_usb.setOnClickListener(this);

        tv_email= (TextView)findViewById(R.id.tv_email);

        tv_sd= (TextView)findViewById(R.id.tv_email);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rl_handle_server:
                break;
            case R.id.rl_auto_to_server:
                break;
            case R.id.rl_dump_sd:
                break;
            case R.id.rl_dump_email:
                break;
            case R.id.rl_dump_usb:
                break;
        }
    }
}
