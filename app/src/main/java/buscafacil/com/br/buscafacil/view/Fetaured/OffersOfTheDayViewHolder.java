package buscafacil.com.br.buscafacil.view.Fetaured;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import buscafacil.com.br.buscafacil.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class OffersOfTheDayViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.featured_item_text)
    TextView textViewFeaturedItemText;

    @BindView(R.id.featured_item_value)
    TextView textViewFeaturedItemValue;

    @BindView(R.id.featured_item_image)
    ImageView imageViewFeaturedItemImage;

    public OffersOfTheDayViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
