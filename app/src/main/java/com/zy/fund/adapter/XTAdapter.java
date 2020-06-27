package com.zy.fund.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zy.fund.R;
import com.zy.fund.beans.Product;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 23:20
 */
public class XTAdapter extends RecyclerView.Adapter<XTAdapter.VH>{


    private Context mContext;

    public XTAdapter(Context mContext) {
        this.mContext = mContext;

    }

    private String [] name  = {"黎明","微笑","发国","阿文","国队","贵禾","棕色","黄健","簇生"};
    private String [] content  = {"建议做多","多空二次回撤","不建议逆势","拿住等待下一波","做空原油","市场恐慌未见，建议多","指数可能有新高","石油保持强势","港币跌破500大关"};

    @NonNull
    @Override
    public XTAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.xt_item_layout, parent, false);
        return new XTAdapter.VH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull XTAdapter.VH holder, int position) {
        holder.content.setText(content[position]);
        holder.name.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class VH extends RecyclerView.ViewHolder {
        private TextView name,content;
        public VH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_nickName);
            content = itemView.findViewById(R.id.tv_content);
        }
    }
}
