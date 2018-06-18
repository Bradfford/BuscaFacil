package buscafacil.com.br.buscafacil.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.view.department.DepartmentAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.categories_indication_selector)
    View viewCategoriesIndicationSelector;

    @BindView(R.id.featured_indication_selector)
    View viewFeaturedIndicationSelector;

    @BindView(R.id.categories_recycle)
    RecyclerView recyclerView;

    private DepartmentAdapter departmentAdapter;

    private boolean hasCategoriesItemSelected = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hasCategoriesItemSelected = true;
        viewCategoriesIndicationSelector.setVisibility(View.VISIBLE);
        //setupCategories(mockList());
    }

//    public void setupCategories(List<CategoryPL> categories){
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        departmentAdapter = new DepartmentAdapter(this.getContext(), categories);
//        recyclerView.setAdapter(departmentAdapter);
//        recyclerView.addItemDecoration(
//                new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL));
//    }

    @OnClick(R.id.categories_item_button)
    public void selectCategorieItemButton(){
        if(hasCategoriesItemSelected){
            viewCategoriesIndicationSelector.setVisibility(View.VISIBLE);
            viewFeaturedIndicationSelector.setVisibility(View.INVISIBLE);
        }
    }

    @OnClick(R.id.featured_item_button)
    public void selectFeaturedItemButton(){
        if(hasCategoriesItemSelected){
            viewCategoriesIndicationSelector.setVisibility(View.INVISIBLE);
            viewFeaturedIndicationSelector.setVisibility(View.VISIBLE);
        }
    }

//    private List<CategoryPL> mockList(){
//        List<CategoryPL> categoryPLList = new ArrayList<>();
//        CategoryPL categoryPL = new CategoryPL();
//        CategoryPL categoryPL2 = new CategoryPL();
//        CategoryPL categoryPL3 = new CategoryPL();
//        CategoryPL categoryPL4 = new CategoryPL();
//        CategoryPL categoryPL5 = new CategoryPL();
//        CategoryPL categoryPL6 = new CategoryPL();
//        CategoryPL categoryPL7 = new CategoryPL();
//        CategoryPL categoryPL8 = new CategoryPL();
//        CategoryPL categoryPL9 = new CategoryPL();
//
//
//        categoryPL.setId(1);
//        categoryPL.setNome("Eletrodomésticos e Split");
//        categoryPL2.setId(2);
//        categoryPL2.setNome("Celulares e Telefonia Fixa");
//        categoryPL3.setId(3);
//        categoryPL3.setNome("Games e PC Gaming");
//        categoryPL4.setId(4);
//        categoryPL4.setNome("Informática e Tablets");
//        categoryPL5.setId(5);
//        categoryPL5.setNome("TV, Áudio e Home Theater");
//        categoryPL6.setId(6);
//        categoryPL6.setNome("Filmes, Séries e música");
//        categoryPL7.setId(7);
//        categoryPL7.setNome("Moda, Beleza e Perfumaria");
//        categoryPL8.setId(8);
//        categoryPL8.setNome("Móveis e Decoração");
//        categoryPL9.setId(9);
//        categoryPL9.setNome("Viagens");
//
//        categoryPLList.add(categoryPL);
//        categoryPLList.add(categoryPL2);
//        categoryPLList.add(categoryPL3);
//        categoryPLList.add(categoryPL4);
//        categoryPLList.add(categoryPL5);
//        categoryPLList.add(categoryPL6);
//        categoryPLList.add(categoryPL7);
//        categoryPLList.add(categoryPL8);
//        categoryPLList.add(categoryPL9);
//
//        return categoryPLList;
//    }

}
