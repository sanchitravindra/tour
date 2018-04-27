package com.example.android.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sanchitdeshmukh on 17/03/18.
 * Standard View Pager Code taken from Google
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    /**
     * here i added images and text
     */
    private Integer[] images = {R.drawable.napalicoast, R.drawable.haleakaaa, R.drawable.roadtohana};
    private Integer[] strings = {R.string.haleaka, R.string.napali, R.string.Paragraph_hawaii};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
/**
 * here we tell layout inflater to inflate custom_layout.xml with relevant images and text
 */
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(strings[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
