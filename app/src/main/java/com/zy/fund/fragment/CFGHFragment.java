package com.zy.fund.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.zy.fund.R;


/**
 * 财富管理
 */
public class CFGHFragment extends Fragment {



    private TextView tvToolTitle;
    private Toolbar toolbarCfgh;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cai_fu_gui_hua, container, false);
//        tvToolTitle.setText("财富规划");
        tvToolTitle = view.findViewById(R.id.tv_title_cfgh);
        toolbarCfgh = view.findViewById(R.id.toolbar_cfgh);
        tvToolTitle.setText("财富规划");
        toolbarCfgh.setTitle("");
        return view;
    }

}
