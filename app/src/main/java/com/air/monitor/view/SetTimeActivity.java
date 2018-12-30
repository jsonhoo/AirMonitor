package com.air.monitor.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

import com.air.monitor.R;
import com.kyleduo.switchbutton.SwitchButton;

public class SetTimeActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_data);

        SwitchButton sb_hour = (SwitchButton) findViewById(R.id.sb_hour);
        sb_hour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        SwitchButton sb_auto_time = (SwitchButton) findViewById(R.id.sb_auto_time);
        sb_auto_time.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        RelativeLayout rl_set_arec = (RelativeLayout) findViewById(R.id.rl_set_arec);
        rl_set_arec.setOnClickListener(this);

        RelativeLayout rl_set_hour = (RelativeLayout) findViewById(R.id.rl_set_hour);
        rl_set_hour.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_set_arec:
                break;
            case R.id.rl_set_hour:
                break;
        }
    }
}
