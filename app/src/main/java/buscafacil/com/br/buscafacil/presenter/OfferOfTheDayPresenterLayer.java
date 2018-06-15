package buscafacil.com.br.buscafacil.presenter;

import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.model.RO.ChildrenOffer;
import buscafacil.com.br.buscafacil.model.RO.OffersRO;
import buscafacil.com.br.buscafacil.model.RO.ProductOfferRO;
import buscafacil.com.br.buscafacil.model.Service.RequestAPI;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class OfferOfTheDayPresenterLayer {

    private List<ProductOfferOfTheDayPLObject> productOfferOfTheDayPLObjectList;
    private List<ProductDetailsPLObject> productDetailsPLObjectList = new ArrayList<>();
    private Observer<OffersRO> offersROObserver;
    private Observer<ProductOfferRO> productOfferROObserver;

    private Observer<List<ProductDetailsPLObject>> productDetailsPLObjectObserver;
    private Observable<List<ProductDetailsPLObject>> productDetailsPLObjectObservable;

    private RequestAPI requestAPI;

    private static int productOfferOfTheDayCount = 0;

    public OfferOfTheDayPresenterLayer(Observer<List<ProductDetailsPLObject>> productDetailsPLObjectObserver){
        this.productDetailsPLObjectObserver = productDetailsPLObjectObserver;
    }

    public void callOffersOfTheDayService() {

        offersROObserver = new Observer<OffersRO>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(OffersRO offersRO) {
                buildObject(offersRO);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        requestAPI = new RequestAPI(null, offersROObserver, null);
        requestAPI.requestGetOffersOfTheDay(Utils.getSpaceyApiDomain());
    }

    public void callProductOfferDetails(List<ProductOfferOfTheDayPLObject> productOfferOfTheDayPLObjectList){

        productOfferROObserver = new Observer<ProductOfferRO>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(ProductOfferRO productOfferRO) {
                buildProductObject(productOfferRO);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        for(ProductOfferOfTheDayPLObject productOfferOfTheDayPLObject : productOfferOfTheDayPLObjectList){
            requestAPI = new RequestAPI(null, null, productOfferROObserver);
            requestAPI.requestGetProductOfferDetails(Utils.getRestqlServerDomain(), productOfferOfTheDayPLObject.getProductOfferId());
        }

    }

    private void buildObject(OffersRO offersRO){
        productOfferOfTheDayPLObjectList = new ArrayList<>();

        for(ChildrenOffer childreOffer : offersRO.getComponentOfferResponse().getChildrenOffers()){
            ProductOfferOfTheDayPLObject productOfferOfTheDayPLObject = new ProductOfferOfTheDayPLObject();
            productOfferOfTheDayPLObject.setOfferid(childreOffer.getOfferid());
            productOfferOfTheDayPLObject.setProductOfferId(childreOffer.getProductOfferId());
            productOfferOfTheDayPLObject.setTitle(childreOffer.getTitle());
            productOfferOfTheDayPLObjectList.add(productOfferOfTheDayPLObject);
        }
        productOfferOfTheDayCount = productOfferOfTheDayPLObjectList.size();
        callProductOfferDetails(productOfferOfTheDayPLObjectList);
    }

    private void buildProductObject(ProductOfferRO productOfferRO){
        ProductDetailsPLObject productDetailsPLObject = new ProductDetailsPLObject();
        productDetailsPLObject.setName(productOfferRO.getProductResponse().getProductOfferResult().getProductOfferName());
        productDetailsPLObject.setListPrice(productOfferRO.getProductOfferResponse()
                .getProductOfferResponseResult().getProductOfferList().get(0).getListPrice());
        productDetailsPLObject.setSalesPrice(productOfferRO.getProductOfferResponse()
                .getProductOfferResponseResult().getProductOfferList().get(0).getSalesPrice());
        productDetailsPLObject.setSmallImage(productOfferRO.getProductResponse()
                .getProductOfferResult().getProductOfferResultImageList().get(0).getSmallImage());
        productDetailsPLObject.setMediumImage(productOfferRO.getProductResponse()
                .getProductOfferResult().getProductOfferResultImageList().get(0).getMediumImage());
        productDetailsPLObject.setBigImage(productOfferRO.getProductResponse()
                .getProductOfferResult().getProductOfferResultImageList().get(0).getBigImage());

        productDetailsPLObjectList.add(productDetailsPLObject);

        if(productDetailsPLObjectList.size() == productOfferOfTheDayCount){
            productDetailsPLObjectObservable = Observable.just(productDetailsPLObjectList);
            productDetailsPLObjectObservable.subscribe(productDetailsPLObjectObserver);
        }
    }

}
