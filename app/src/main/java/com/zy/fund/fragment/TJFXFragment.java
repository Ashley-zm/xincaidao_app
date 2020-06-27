package com.zy.fund.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zy.fund.R;


/**
 * 统计分析
 */
public class TJFXFragment extends Fragment {

    public TJFXFragment() {
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
        return inflater.inflate(R.layout.fragment_tjfx, container, false);
    }


}
