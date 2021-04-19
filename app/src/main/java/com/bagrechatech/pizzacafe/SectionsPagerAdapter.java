package com.bagrechatech.pizzacafe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Pizza";
            case 2:
                return "Pasta";
            case 3:
                return "Stores";
        }
        return null;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new TopFragment();
            case 1:
                return new PizzaFragment();
            case 2:
                return new PastaFragment();
            case 3:
                return new StoresFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
