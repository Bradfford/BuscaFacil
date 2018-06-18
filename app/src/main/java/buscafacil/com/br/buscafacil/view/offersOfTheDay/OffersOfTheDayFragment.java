package buscafacil.com.br.buscafacil.view.offersOfTheDay;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.view.MainActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class OffersOfTheDayFragment extends Fragment {

    @BindView(R.id.offers_recycle)
    RecyclerView recyclerView;

    private OffersOfTheDayAdapter offersOfTheDayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.featured_fragment, container, false);
        ButterKnife.bind(this, view);
  //      showBackButton();
        setupOffersOfTheDays();
        return view;
    }

    public void setupOffersOfTheDays(){
        GridLayoutManager layoutManager = new GridLayoutManager(this.getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        offersOfTheDayAdapter = new OffersOfTheDayAdapter(this.getContext());
        recyclerView.setAdapter(offersOfTheDayAdapter);
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getContext(), DividerItemDecoration.HORIZONTAL));
    }

//    public void showBackButton() {
//        ((MainActivity)getContext()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//    }

}
