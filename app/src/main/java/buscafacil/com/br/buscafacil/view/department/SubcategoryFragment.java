package buscafacil.com.br.buscafacil.view.department;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.SubcategoryPLObject;
import buscafacil.com.br.buscafacil.view.MainActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubcategoryFragment extends Fragment implements FragmentManager.OnBackStackChangedListener {

    @BindView(R.id.subcategories_recycle)
    RecyclerView recyclerView;

    String categoryName =  "";

    private SubCategoryAdapter subCategoryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subcategory, container, false);
        ButterKnife.bind(this, view);
//        showBackButton();
        Bundle param = getArguments();
        categoryName = param.getString("categoryName");
        setupCategories((List<SubcategoryPLObject>) param.get("subcategoryPLObjectList"));
        return view;
    }

    private void setupCategories(List<SubcategoryPLObject> subcategoryPLObjectList){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        subCategoryAdapter = new SubCategoryAdapter(this.getContext(), subcategoryPLObjectList);
        recyclerView.setAdapter(subCategoryAdapter);
    }

//    public void showBackButton() {
//        ((MainActivity)getContext()).getSupportFragmentManager().addOnBackStackChangedListener(this);
//        ((MainActivity)getContext()).getSupportActionBar().setTitle(categoryName);
//        ((MainActivity)getContext()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//    }

    @Override
    public void onBackStackChanged() {
//        if(getActivity().getSupportFragmentManager().getBackStackEntryCount() < 1) {
//            ((MainActivity)getContext()).getSupportActionBar().setTitle("Busca Fácil");
//            ((MainActivity) getContext()).showBackButton();
//        }
    }
}
