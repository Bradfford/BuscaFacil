package buscafacil.com.br.buscafacil.view.Category;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import buscafacil.com.br.buscafacil.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.category_item_text)
    TextView textViewCategoryText;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
