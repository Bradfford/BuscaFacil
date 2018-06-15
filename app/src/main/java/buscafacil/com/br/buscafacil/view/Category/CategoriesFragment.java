package buscafacil.com.br.buscafacil.view.Category;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.model.Service.RequestAPI;
import buscafacil.com.br.buscafacil.presenter.DepartmentPLObject;
import buscafacil.com.br.buscafacil.presenter.DepartmentPresenterLayer;
import buscafacil.com.br.buscafacil.view.Category.CategoryAdapter;
import buscafacil.com.br.buscafacil.presenter.Utils;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoriesFragment extends Fragment {

    @BindView(R.id.categories_recycle)
    RecyclerView recyclerView;

    private CategoryAdapter categoryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categories_fragment, container, false);
        ButterKnife.bind(this, view);
        setupCategories(mockList());
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void setupCategories(List<DepartmentPLObject> categories){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        categoryAdapter = new CategoryAdapter(this.getContext());
        recyclerView.setAdapter(categoryAdapter);
    }

    private List<DepartmentPLObject> mockList(){
        List<DepartmentPLObject> categoryPLList = new ArrayList<>();
        DepartmentPLObject categoryPL = new DepartmentPLObject();
        DepartmentPLObject categoryPL2 = new DepartmentPLObject();
        DepartmentPLObject categoryPL3 = new DepartmentPLObject();
        DepartmentPLObject categoryPL4 = new DepartmentPLObject();
        DepartmentPLObject categoryPL5 = new DepartmentPLObject();
        DepartmentPLObject categoryPL6 = new DepartmentPLObject();
        DepartmentPLObject categoryPL7 = new DepartmentPLObject();
        DepartmentPLObject categoryPL8 = new DepartmentPLObject();
        DepartmentPLObject categoryPL9 = new DepartmentPLObject();


        categoryPL.setId("1");
        categoryPL.setTitle("Eletrodomésticos e Split");
        categoryPL2.setId("2");
        categoryPL2.setTitle("Celulares e Telefonia Fixa");
        categoryPL3.setId("3");
        categoryPL3.setTitle("Games e PC Gaming");
        categoryPL4.setId("4");
        categoryPL4.setTitle("Informática e Tablets");
        categoryPL5.setId("5");
        categoryPL5.setTitle("TV, Áudio e Home Theater");
        categoryPL6.setId("6");
        categoryPL6.setTitle("Filmes, Séries e música");
        categoryPL7.setId("7");
        categoryPL7.setTitle("Moda, Beleza e Perfumaria");
        categoryPL8.setId("8");
        categoryPL8.setTitle("Móveis e Decoração");
        categoryPL9.setId("9");
        categoryPL9.setTitle("Viagens");

        categoryPLList.add(categoryPL);
        categoryPLList.add(categoryPL2);
        categoryPLList.add(categoryPL3);
        categoryPLList.add(categoryPL4);
        categoryPLList.add(categoryPL5);
        categoryPLList.add(categoryPL6);
        categoryPLList.add(categoryPL7);
        categoryPLList.add(categoryPL8);
        categoryPLList.add(categoryPL9);

        return categoryPLList;
    }
}
