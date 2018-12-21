package com.air.monitor.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.air.monitor.bean.Contact;

import java.util.List;


public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.MyViewHolder> implements View.OnClickListener {

    private Context context;
    private List<Contact> dataList;
    private int layoutId;
    private OnItemClickListener mOnItemClickListener = null;

    public RecordAdapter(Context context, List data, int layoutId) {
        this.context = context;
        this.dataList = data;
        this.layoutId = layoutId;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layoutId, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //将position保存在itemView的Tag中，以便点击时进行获取
        holder.itemView.setTag(position);
//        ConsumeRecordModel consumeRecordModel = dataList.get(position);
//        holder.tvTime.setText(consumeRecordModel.getCreated_at());
//        holder.tvChannel.setText(consumeRecordModel.getQudao());
//        holder.tvMoney.setText(consumeRecordModel.getMoney() + "");
//        holder.tvPayType.setText(consumeRecordModel.getPay_type());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (int) v.getTag());
        }
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTime;
        TextView tvChannel;
        TextView tvMoney;
        TextView tvPayType;

        public MyViewHolder(View view) {
            super(view);
//            tvTime = (TextView) view.findViewById(R.id.tv_time);
//            tvChannel = (TextView) view.findViewById(R.id.tv_channel);
//            tvMoney = (TextView) view.findViewById(R.id.tv_money);
//            tvPayType = (TextView) view.findViewById(R.id.tv_pay_type);
        }
    }

//    public void setListAll(List<ConsumeRecordModel> deviceModels) {
//        if (this.dataList == null) {
//            this.dataList = new ArrayList();
//        }
//        this.dataList.clear();
//        dataList.addAll(deviceModels);
//        this.notifyDataSetChanged();
//    }
//
//    public List<ConsumeRecordModel> getList() {
//        return this.dataList;
//    }
}
