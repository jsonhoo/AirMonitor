package com.air.monitor.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.air.monitor.R;
import com.air.monitor.adapter.ContactAdapter;
import com.air.monitor.bean.Contact;
import com.air.monitor.utils.HanziToPinyin;
import com.air.monitor.widget.SideBar;

import java.util.ArrayList;

public class ContactActivity extends BaseActivity implements SideBar
        .OnTouchingLetterChangedListener, TextWatcher {

    private TextView mFooterView;
    private ListView mListView;

    private ArrayList<Contact> datas = new ArrayList<>();
    private ContactAdapter mAdapter;

    @Override
    protected View initView() {
        return View.inflate(this, R.layout.activity_contact, null);
    }

    @Override
    protected void initData() {
        super.initData();

        mTitleView.setTitleText(getString(R.string.contact));
        mTitleView.setRightText(getString(R.string.create), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(CreateContactActivity.class);
            }
        });

        SideBar mSideBar = (SideBar) findViewById(R.id.school_friend_sidrbar);
        TextView mDialog = (TextView) findViewById(R.id.school_friend_dialog);
        EditText mSearchInput = (EditText) findViewById(R.id.school_friend_member_search_input);

        mSideBar.setTextView(mDialog);
        mSideBar.setOnTouchingLetterChangedListener(this);
        mSearchInput.addTextChangedListener(this);

        // 给listView设置adapter
        mFooterView = (TextView) View.inflate(this, R.layout.item_list_contact_count, null);
        mListView = mView.findViewById(R.id.school_friend_member);
        mListView.addFooterView(mFooterView);

        parser();
    }

    private void parser() {
        for (int i = 0; i < 20; i++) {
            Contact data = new Contact();
            data.setName("name");
            data.setUrl("portrait");
            data.setId(i);
            data.setPinyin(HanziToPinyin.getPinYin(data.getName()));
            datas.add(data);
        }
        mFooterView.setText(datas.size() + getString(R.string.contact_count));
        mAdapter = new ContactAdapter(mListView, datas);
        mListView.setAdapter(mAdapter);
    }

    @Override
    public void onTouchingLetterChanged(String s) {
        int position = 0;
        // 该字母首次出现的位置
        if (mAdapter != null) {
            position = mAdapter.getPositionForSection(s.charAt(0));
        }
        if (position != -1) {
            mListView.setSelection(position);
        } else if (s.contains("#")) {
            mListView.setSelection(0);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        ArrayList<Contact> temp = new ArrayList<>(datas);
        for (Contact data : datas) {
            if (data.getName().contains(s) || data.getPinyin().contains(s)) {
            } else {
                temp.remove(data);
            }
        }
        if (mAdapter != null) {
            mAdapter.refresh(temp);
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}
