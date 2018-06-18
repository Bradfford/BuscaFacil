package buscafacil.com.br.buscafacil.view.department;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.SubcategoryPLObject;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubcategoryViewHolder> {

    private List<SubcategoryPLObject> subcategoryPLObjectList;
    Context context;

    public SubCategoryAdapter(Context context, List<SubcategoryPLObject> subcategoryPLObjectList){
        this.context = context;
        this.subcategoryPLObjectList = subcategoryPLObjectList;
    }


    @Override
    public SubcategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SubcategoryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.subcategory_item, parent, false));
    }

    @Override
    public void onBindViewHolder(SubcategoryViewHolder holder, int position) {
        holder.textViewSubcategoryText.setText(subcategoryPLObjectList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return subcategoryPLObjectList != null ? subcategoryPLObjectList.size() : 0;
    }
}
