package com.zy.fund.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zy.fund.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 23:38
 */
public class DTQAdapter extends RecyclerView.Adapter<DTQAdapter.VH>{


    private Context mContext;

    public DTQAdapter(Context mContext) {
        this.mContext = mContext;

    }

    private String [] name  = {"网易课堂","易迅","老刘炒股","缠论","缠中说禅","网易严选","公开课" };
    private String [] content  = {"马上开讲","马上开讲","马上开讲","马上开讲","马上开讲","马上开讲，马上开讲","马上开讲"};


    @NonNull
    @Override
    public DTQAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dtq_item_layout, parent, false);
        return new DTQAdapter.VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DTQAdapter.VH holder, int position) {
        holder.content.setText(content[position]);
        holder.name.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class VH extends RecyclerView.ViewHolder{
        private TextView name,content;
        public VH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_kcName);
            content = itemView.findViewById(R.id.tv_kcContent);
        }
    }
}
