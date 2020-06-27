package com.zy.fund.fragment;


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
 * 财富学堂
 */
public class CFXTFragment extends Fragment {


    private DTQAdapter xtAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    public CFXTFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the Toolbarlayout for this fragment
        View view = inflater.inflate(R.layout.fragment_chxt, container, false);
        recyclerView = view.findViewById(R.id.rl_xt);
        xtAdapter = new DTQAdapter(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(xtAdapter);
        return view;
    }

}
