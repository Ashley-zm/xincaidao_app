package com.zy.fund.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zy.fund.R;
import com.zy.fund.adapter.DTQAdapter;
import com.zy.fund.adapter.XTAdapter;


/**
 * 动态圈
 */
public class DTQFragment extends Fragment {

    private XTAdapter xtAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the Toolbarlayout for this fragment
        View view = inflater.inflate(R.layout.fragment_dtq, container, false);
        recyclerView = view.findViewById(R.id.rl_dtq);
        xtAdapter = new XTAdapter(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(xtAdapter);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }


}
