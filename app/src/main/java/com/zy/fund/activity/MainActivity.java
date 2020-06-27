package com.zy.fund.activity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.afollestad.materialdialogs.MaterialDialog;
import com.zy.fund.constans.Constans;
import com.zy.fund.fragment.CFGHFragment;
import com.zy.fund.fragment.CFXTFragment;
import com.zy.fund.fragment.CPFragment;
import com.zy.fund.fragment.DTQFragment;
import com.zy.fund.fragment.TJFXFragment;
import com.zy.fund.fragment.WDCFFragment;
import com.zy.fund.fragment.WDKHFragment;
import com.zy.fund.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.ly_btn_cfgh)
    LinearLayout lyBtnCfgh;
    @BindView(R.id.ly_btn_school)
    LinearLayout lyBtnSchool;
    @BindView(R.id.ly_btn_caifu)
    LinearLayout lyBtnCaifu;
    @BindView(R.id.ly_btn_friend)
    LinearLayout lyBtnFriend;
    @BindView(R.id.ly_btn_product)
    LinearLayout lyBtnProduct;
    @BindView(R.id.ly_btn_customer)
    LinearLayout lyBtnCustomer;
    @BindView(R.id.main_menu)
    LinearLayout mainMenu;
    @BindView(R.id.blue_menu)
    RelativeLayout blueMenu;
    @BindView(R.id.rl_menu)
    RelativeLayout rlMenu;
    @BindView(R.id.drawer_layout)
    RelativeLayout drawerLayout;
    @BindView(R.id.iv_cfgh)
    ImageView ivCfgh;
    @BindView(R.id.iv_school)
    ImageView ivSchool;
    @BindView(R.id.iv_caifu)
    ImageView ivCaifu;
    @BindView(R.id.iv_friend)
    ImageView ivFriend;
    @BindView(R.id.iv_product)
    ImageView ivProduct;
    @BindView(R.id.iv_customer)
    ImageView ivCustomer;
    private CFGHFragment cfghFragment = new CFGHFragment();
    private CFXTFragment cfxtFragment = new CFXTFragment();
    private CPFragment cpFragment = new CPFragment();
    private DTQFragment dtqFragment = new DTQFragment();
    private TJFXFragment tjfxFragment = new TJFXFragment();
    private WDKHFragment wdkhFragment = new WDKHFragment();
    private WDCFFragment wdcfFragment = new WDCFFragment();
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    private Fragment mfrom = cfghFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        new MaterialDialog.Builder(MainActivity.this)
                .title("欢迎回来")
                .content("欢迎"+ Constans.user.getUserName()+"回来")
                .positiveText("确认")
                .show();
        initLays();
        addDefaultFragment();

    }

    private void initLays() {
        lyBtnCfgh.setOnClickListener(this);
        lyBtnSchool.setOnClickListener(this);
        lyBtnCaifu.setOnClickListener(this);
        lyBtnFriend.setOnClickListener(this);
        lyBtnProduct.setOnClickListener(this);
        lyBtnCustomer.setOnClickListener(this);
    }


    /**
     * 控制从activity
     */
    public void switchContent(Fragment from, Fragment to) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        if (!to.isAdded()) { // 先判断是否被add过
            fragmentTransaction.hide(from).add(R.id.fragment_content, to).commit(); // 隐藏当前的fragment，add下一个到Activity中
            // Log.i("status", "===没有添加过===");
        } else {
            fragmentTransaction.hide(from).show(to).commit(); // 隐藏当前的fragment，显示下一个
            // Log.i("status", "===添加过===");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ly_btn_cfgh:
                switchContent(mfrom, cfghFragment);//先执行fragment切换操作
                changeCFGHMenu();
                mfrom = cfghFragment;
                break;
            case R.id.ly_btn_school:
                switchContent(mfrom, cfxtFragment);
                changeSchoolMenu();
                mfrom = cfxtFragment;
                break;
            case R.id.ly_btn_product:
                switchContent(mfrom, cpFragment);
                changeCPMenu();
                mfrom = cpFragment;
                break;
            case R.id.ly_btn_friend:
                switchContent(mfrom, dtqFragment);
                changeFriendsMenu();
                mfrom = dtqFragment;
                break;
            case R.id.ly_btn_caifu:
                switchContent(mfrom, wdcfFragment);
                changeWdCfMenu();
                mfrom = wdcfFragment;
                break;
            case R.id.ly_btn_customer:
                switchContent(mfrom, wdkhFragment);
                changeKHMenu();
                mfrom = wdkhFragment;
                break;
            default:
                break;
        }
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeCFGHMenu() {
        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuapressed));//
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolunpressed));//
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfunpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendsunpressed));//
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cpunpressed));//
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehuunpressed));//
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeSchoolMenu() {

        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuaunpressed));
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolpressed));
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfunpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendsunpressed));
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cpunpressed));
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehuunpressed));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeWdCfMenu() {

        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuaunpressed));
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolunpressed));
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendsunpressed));
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cpunpressed));
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehuunpressed));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeFriendsMenu() {

        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuaunpressed));
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolunpressed));
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfunpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendspressed));
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cpunpressed));
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehuunpressed));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeCPMenu() {

        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuaunpressed));
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolunpressed));
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfunpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendsunpressed));
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cppressed));
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehuunpressed));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void changeKHMenu() {
        // ivCfgh  ivSchool  ivCaifu  ivFriend ivProduct ivCustomer
        ivCfgh.setBackground(getResources().getDrawable(R.drawable.ic_guihuaunpressed));
        ivSchool.setBackground(getResources().getDrawable(R.drawable.ic_schoolunpressed));
        ivCaifu.setBackground(getResources().getDrawable(R.drawable.ic_cfunpressed));
        ivFriend.setBackground(getResources().getDrawable(R.drawable.ic_friendsunpressed));
        ivProduct.setBackground(getResources().getDrawable(R.drawable.ic_cpunpressed));
        ivCustomer.setBackground(getResources().getDrawable(R.drawable.ic_kehupressed));
    }

    /*
     *添加默认fragment
     * */
    public void addDefaultFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_content, cfghFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        //注释掉以防view重叠
        //super.onSaveInstanceState(outState, outPersistentState);
    }

}
