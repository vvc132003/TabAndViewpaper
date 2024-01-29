package org.chinh.tabandviewpaperr;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class ViewPagerAdapter extends FragmentStateAdapter {
    private static final int CARD_ITEM_SIZE = 3;
    static final int TAB_HOME = 1;
    static final int TAB_ABOUT = 2;
    static final int TAB_SETTING = 3;
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull @Override public Fragment createFragment(int position) {
        Fragment fragment = new HomeFragment();
        switch (position){
            case TAB_HOME:
                fragment = new HomeFragment();
                break;
            case TAB_ABOUT:
                fragment = new AboutFragment();
                break;
            case TAB_SETTING:
                fragment = new SettingFragment();
                break;
        }
        return fragment;
    }
    @Override public int getItemCount() {
        return CARD_ITEM_SIZE;
    }
}
