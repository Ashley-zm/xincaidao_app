package com.zy.fund.fragment;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zy.fund.R;


public class ToolBarFragment extends Fragment {


    @butterknife.BindView(R.id.tv_tool_title)
    TextView tvToolTitle;
    @butterknife.BindView(R.id.fragment_toolbar)
    Toolbar toolbar;
    private TextView tv_tool_title;
    public ToolBarFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the Toolbarlayout for this fragment
        View v = inflater.inflate(R.layout.fragment_tool_bar, container, false);
        setTitle("title");
        return v;
    }

    protected void setTitle(String title){
        tvToolTitle.setText(title);
    }

}
