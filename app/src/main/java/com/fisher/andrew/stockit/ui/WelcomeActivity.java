package com.fisher.andrew.stockit.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fisher.andrew.stockit.R;

//GET RID OF BTN NEXT???? SINCE IT IS INVISIBLE
public class WelcomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private WelcomeViewPagerAdapter mWelcomeViewPagerAdapter;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    private Button btnSkip;
    private Button btnNext;
    private PrefManager prefManager;


    //ignored the tutorial code that made bars transparent for now
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Check if first time launch
        prefManager = new PrefManager(this);
        if(!prefManager.isFirstTimeLaunch()){
            launchHomeScreen();
            finish();
        }

        setContentView(R.layout.activity_welcome);

        //Instantiate
        viewPager = (ViewPager) findViewById(R.id.welcomeViewPager);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);


        //array of all layouts
        layouts = new int[]{
                R.layout.slide_welcome,
                R.layout.slide_list,
                R.layout.slide_home,
                R.layout.slide_map,
                R.layout.slide_clock,
                R.layout.slide_rotten};

        addBottomDots(0);

        changeStatusBarColor();

        mWelcomeViewPagerAdapter = new WelcomeViewPagerAdapter();

        viewPager.setAdapter(mWelcomeViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check for last page, if last page it will launch
                int current = getItem(+1);
                if(current<layouts.length){
                    viewPager.setCurrentItem(current); // current,true <-for smooth scroll
                }else{
                    launchHomeScreen();
                }
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchHomeScreen();
            }
        });
    }

    private void addBottomDots(int currentPage) {
        dots = new TextView[layouts.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
//            if (Build.VERSION.SDK_INT >= 24) {
//                dots[i].setText(Html.fromHtml("&#8226;", FROM_HTML_MODE_LEGACY));//maybe 24?
//            } else {
                dots[i].setText(Html.fromHtml("&#8226;"));
//            }
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0){
            dots[currentPage].setTextColor(colorsActive[currentPage]);
         }

    }
    private int getItem(int i){
        return viewPager.getCurrentItem()+i;
    }

    private void launchHomeScreen(){
        prefManager.setFirstTimeLaunch(false);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            addBottomDots(position);

            //Change next button
//            if(position==layouts.length-1){
//                //last page
//                btnNext.setVisibility(View.GONE);
//                btnSkip.setVisibility(View.GONE);
//            }else {
                // still pages are left
                btnNext.setText(getString(R.string.next));
                btnSkip.setVisibility(View.VISIBLE);
//            }

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    //VIEW PAGER ADAPTER
    public class WelcomeViewPagerAdapter extends PagerAdapter {
        private LayoutInflater mLayoutInflater;

        public WelcomeViewPagerAdapter(){
        }


        @Override
        public Object instantiateItem(ViewGroup container, int position){
            mLayoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = mLayoutInflater.inflate(layouts[position],container,false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }



}
