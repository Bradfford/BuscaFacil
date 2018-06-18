package buscafacil.com.br.buscafacil.view.department;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.DepartmentPLObject;
import buscafacil.com.br.buscafacil.view.MainActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DepartmentFragment extends Fragment {

    @BindView(R.id.categories_recycle)
    RecyclerView recyclerView;

    private DepartmentAdapter departmentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categories_fragment, container, false);
        ButterKnife.bind(this, view);
//        showBackButton();
        setupCategories();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void setupCategories(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        departmentAdapter = new DepartmentAdapter(this.getContext());
        recyclerView.setAdapter(departmentAdapter);
    }

//    public void showBackButton() {
//        ((MainActivity)getContext()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//    }
}
