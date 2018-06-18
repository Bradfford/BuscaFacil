package buscafacil.com.br.buscafacil.view.department;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.model.ro.departamentsRO.Category;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.DepartmentPLObject;
import buscafacil.com.br.buscafacil.presenter.DepartmentPresenterLayer;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.SubcategoryPLObject;
import buscafacil.com.br.buscafacil.view.MainActivity;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentViewHolder>{

    private Observer<List<DepartmentPLObject>> departmentsPLObjectObserver;

    private DepartmentPresenterLayer departmentPresenterLayer;
    private List<DepartmentPLObject> departmentsList;
    Context context;

    public DepartmentAdapter(Context context){
        this.context = context;
        callDepartmentService();
    }

    @Override
    public DepartmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DepartmentViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false));
    }

    @Override
    public void onBindViewHolder(DepartmentViewHolder holder, final int position) {
        holder.textViewCategoryText.setText(departmentsList.get(position).getTitle());
        holder.linearLayoutshowSubcategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSubcategories(departmentsList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return departmentsList != null ? departmentsList.size() : 0;
    }


    private void callDepartmentService() {
        departmentsPLObjectObserver = new Observer<List<DepartmentPLObject>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<DepartmentPLObject> departmentPLObjects) {
                departmentsList = departmentPLObjects;
                notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        departmentPresenterLayer =  new DepartmentPresenterLayer(departmentsPLObjectObserver);
        departmentPresenterLayer.callDepartments();
    }

    private void showSubcategories(DepartmentPLObject departmentPLObject){
        List<SubcategoryPLObject> subcategoryPLObjectList = departmentPLObject.getSubcategoryPLObjectList();
        FragmentManager manager = ((MainActivity)context).getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        SubcategoryFragment subcategoryFragment = new SubcategoryFragment();
        Bundle param = new Bundle();
        param.putSerializable("subcategoryPLObjectList", (Serializable) subcategoryPLObjectList);
        param.putSerializable("categoryName", departmentPLObject.getTitle());
        subcategoryFragment.setArguments(param);
        transaction.replace(R.id.categories_fragment , subcategoryFragment).addToBackStack(null).commit();
    }

}
