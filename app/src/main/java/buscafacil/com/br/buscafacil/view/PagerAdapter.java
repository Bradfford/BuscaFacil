package buscafacil.com.br.buscafacil.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import buscafacil.com.br.buscafacil.view.department.DepartmentFragment;
import buscafacil.com.br.buscafacil.view.offersOfTheDay.OffersOfTheDayFragment;

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
                DepartmentFragment categoriesFragment = new DepartmentFragment();
                return categoriesFragment;
            case 1:
                OffersOfTheDayFragment offersOfTheDayFragment = new OffersOfTheDayFragment();
                return offersOfTheDayFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
