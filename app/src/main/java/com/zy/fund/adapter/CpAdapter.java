package com.zy.fund.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zy.fund.R;
import com.zy.fund.beans.Product;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 22:00
 */
public class CpAdapter extends RecyclerView.Adapter<CpAdapter.VH> {


    private Context mContext;
    private Product product;

    public CpAdapter(Context mContext, Product product) {
        this.mContext = mContext;
        this.product = product;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cp_item_layout, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        if (product==null){
            return;
        }


        holder.trad.setText(product.getResult().get(position).get_$1().getTotalcap());
        holder.code.setText(product.getResult().get(position).get_$1().getCode());
        holder.name.setText(product.getResult().get(position).get_$1().getName());

    }

    @Override
    public int getItemCount() {
        return product.getResult().size();
    }

    public class VH extends RecyclerView.ViewHolder {
        private TextView name,code,trad;
        public VH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_fund_name_real);
            code = itemView.findViewById(R.id.tv_fund_code_real);
            trad = itemView.findViewById(R.id.tv_fund_trad_real);
        }
    }
}
