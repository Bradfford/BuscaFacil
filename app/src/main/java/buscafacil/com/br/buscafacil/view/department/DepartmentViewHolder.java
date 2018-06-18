package buscafacil.com.br.buscafacil.view.department;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import buscafacil.com.br.buscafacil.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DepartmentViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.category_item_text)
    TextView textViewCategoryText;

    @BindView(R.id.show_subcategories)
    LinearLayout linearLayoutshowSubcategories;

    public DepartmentViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
