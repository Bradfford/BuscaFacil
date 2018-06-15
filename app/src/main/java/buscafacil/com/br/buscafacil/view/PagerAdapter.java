package buscafacil.com.br.buscafacil.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import buscafacil.com.br.buscafacil.view.Category.CategoriesFragment;
import buscafacil.com.br.buscafacil.view.Fetaured.FeaturedFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                CategoriesFragment categoriesFragment = new CategoriesFragment();
                return categoriesFragment;
            case 1:
                FeaturedFragment featuredFragment = new FeaturedFragment();
                return featuredFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
