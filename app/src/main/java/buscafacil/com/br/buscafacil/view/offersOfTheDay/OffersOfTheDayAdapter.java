package buscafacil.com.br.buscafacil.view.offersOfTheDay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import buscafacil.com.br.buscafacil.R;
import buscafacil.com.br.buscafacil.presenter.OfferOfTheDayPresenterLayer;
import buscafacil.com.br.buscafacil.presenter.po.offersPO.ProductDetailsPLObject;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class OffersOfTheDayAdapter extends RecyclerView.Adapter<OffersOfTheDayViewHolder> {

    private Observer<List<ProductDetailsPLObject>> productDetailsPLObjectObserver;

    private OfferOfTheDayPresenterLayer offerOfTheDayPresenterLayer;
    private List<ProductDetailsPLObject> productDetailsPLObjectList;
    Context context;

    public OffersOfTheDayAdapter(Context context){
        this.context = context;
        callOffersOfTheDayService();
    }


    @Override
    public OffersOfTheDayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OffersOfTheDayViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.featured_item, parent, false));
    }

    @Override
    public void onBindViewHolder(OffersOfTheDayViewHolder holder, int position) {

        Picasso.with(context).load(productDetailsPLObjectList.get(position).getMediumImage()).fit().centerCrop()
                .into(holder.imageViewFeaturedItemImage);
        holder.textViewFeaturedItemText.setText(productDetailsPLObjectList.get(position).getName());
        holder.textViewFeaturedItemValue.setText("R$" + productDetailsPLObjectList.get(position).getSalesPrice());
    }

    @Override
    public int getItemCount() {
        return productDetailsPLObjectList != null ? productDetailsPLObjectList.size() : 0;
    }

    private void callOffersOfTheDayService(){

        productDetailsPLObjectObserver = new Observer<List<ProductDetailsPLObject>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<ProductDetailsPLObject> productDetailsPLObjects) {
                productDetailsPLObjectList = productDetailsPLObjects;
                notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        offerOfTheDayPresenterLayer = new OfferOfTheDayPresenterLayer(productDetailsPLObjectObserver);
        offerOfTheDayPresenterLayer.callOffersOfTheDayService();
    }
}
