package buscafacil.com.br.buscafacil.view.department;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import buscafacil.com.br.buscafacil.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SubcategoryViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.subcategory_item_text)
    TextView textViewSubcategoryText;

    @BindView(R.id.show_subcategories_products)
    ImageView imageViewshowSubcategoriesProducts;


    public SubcategoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
