package buscafacil.com.br.buscafacil.view.Category;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.presenter.DepartmentPLObject;
import buscafacil.com.br.buscafacil.presenter.DepartmentPresenterLayer;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder>{

    private Observer<List<DepartmentPLObject>> departmentsPLObjectObserver;

    private DepartmentPresenterLayer departmentPresenterLayer;
    private List<DepartmentPLObject> departmentsList;
    Context context;

    public CategoryAdapter(Context context){
        this.context = context;
        callDepartmentService();
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.textViewCategoryText.setText(departmentsList.get(position).getTitle());
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


}
