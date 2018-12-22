package com.air.monitor.ui;

import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.air.monitor.R;
import com.air.monitor.adapter.RecordAdapter;
import com.air.monitor.bean.HistoryRecord;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

public class RecordActivity extends BaseActivity {

    private RecordAdapter adapter;
    private List<HistoryRecord> mDataList = new ArrayList<>();

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
                toActivity(ChartActivity.class);
            }
        }, R.mipmap.chart);


        for (int i = 0; i < 20; i++) {
            HistoryRecord record = new HistoryRecord();
            mDataList.add(record);
        }

        RefreshLayout refreshLayout = (RefreshLayout) mView.findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000);
            }
        });
        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadmore(2000);
            }
        });
        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        adapter = new RecordAdapter(this, mDataList, R.layout.item_list_record);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new RecordAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
            }
        });
    }


}
