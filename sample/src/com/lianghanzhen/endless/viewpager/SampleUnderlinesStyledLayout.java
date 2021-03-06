package com.lianghanzhen.endless.viewpager;

import android.support.v4.view.ViewPager;
import com.viewpagerindicator.UnderlinePageIndicator;

public class SampleUnderlinesStyledLayout extends BaseSampleActivity {

    @Override
    protected void configureViews() {
        setContentView(R.layout.themed_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }

}