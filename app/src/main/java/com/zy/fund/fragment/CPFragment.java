package com.zy.fund.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.zy.fund.R;
import com.zy.fund.adapter.CpAdapter;
import com.zy.fund.beans.Product;
import com.zy.fund.iview.CpApi;
import com.zy.fund.presenter.CpPresenter;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;


/**
 * 产品
 */
public class CPFragment extends MvpFragment<CpApi, CpPresenter> implements CpApi {


    @BindView(R.id.tv_title_cp)
    TextView tvTitleCp;
    @BindView(R.id.toolbar_cp)
    Toolbar toolbarCp;
    @BindView(R.id.rl_cp)
    RecyclerView rlCp;
    private CpAdapter cpAdapter;
    private Product product;
    private LinearLayoutManager  mLayoutManager;
    private RecyclerView recyclerView;
    @Override
    public CpPresenter createPresenter() {
        return new CpPresenter();
    }


    @SuppressLint("WrongConstant")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(OrientationHelper.VERTICAL);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the Toolbarlayout for this fragment
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        recyclerView = view.findViewById(R.id.rl_cp);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter().getCPData();
    }

    @Override
    public void queryInfo(Product product) {
//        Log.d("product=====",product.getReason());
//        textView.setText(product.getReason());
        this.product = product;
        if (product != null) {
            cpAdapter = new CpAdapter(getActivity(), product);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(cpAdapter);
        }

    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showError() {

    }
}
