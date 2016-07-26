package com.viewpager.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.viewpager.R;
import com.viewpager.adapter.DepthPageTransformer;
import com.viewpager.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager = null;

    private ViewPagerAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        viewPager = (ViewPager) findViewById(R.id.img_pager);
        adapter = new ViewPagerAdapter(MainActivity.this);
        viewPager.setAdapter(adapter);
        //设置动画
        viewPager.setPageTransformer(true,new DepthPageTransformer());
    }
}
