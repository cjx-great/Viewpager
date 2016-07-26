package com.viewpager.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.viewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CJX on 2016-7-26.
 */
public class ViewPagerAdapter extends PagerAdapter{

    private int[] imags = {R.drawable.m0,R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4};

    private static List<ImageView> imageViewList = null;

    private Context context = null;

    public ViewPagerAdapter(Context context){
        this.context = context;

        imageViewList = new ArrayList<>();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imags[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        container.addView(imageView);
        imageViewList.add(imageView);
        return imageView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView(imageViewList.get(position));
    }

    @Override
    public int getCount() {
        return imags.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
