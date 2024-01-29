package org.chinh.tabandviewpaperr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);

        viewPager.setAdapter(createCardAdapter());
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText("Tab " + (position + 1))).attach();
        viewPager.setCurrentItem(1, false);
    }
    private ViewPagerAdapter createCardAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        return adapter;
    }
}