package buscafacil.com.br.buscafacil.model.Service;

import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.model.RO.DepartmentRO;
import buscafacil.com.br.buscafacil.model.RO.OffersRO;
import buscafacil.com.br.buscafacil.model.RO.ProductOfferRO;
import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestAPI {

    private Observable<DepartmentRO> departmentROObservable;
    private Observer<DepartmentRO> departmentROObserver;
    private Observable<OffersRO> offersROObservable;
    private Observer<OffersRO> offersROObserver;
    private Observable<ProductOfferRO> productOfferROObservable;
    private Observer<ProductOfferRO> productOfferROObserver;

    public RequestAPI(Observer<DepartmentRO> departmentROObserver, Observer<OffersRO> offersROObserver,
                      Observer<ProductOfferRO>  productOfferROObserver ){
        this.departmentROObserver = departmentROObserver;
        this.offersROObserver = offersROObserver;
        this.productOfferROObserver = productOfferROObserver;
    }

    public RequestAPI(Observer<OffersRO> offersROObserver){
        this.offersROObserver = offersROObserver;
    }

    protected APIClientInterface apiInterface;

    public void requestGetCategories(String url){

        apiInterface = APIClient.getClient(url).create(APIClientInterface.class);

        Call<DepartmentRO> call = apiInterface.getCategories();
        call.enqueue(new Callback<DepartmentRO>() {
            @Override
            public void onResponse(Call<DepartmentRO> call, Response<DepartmentRO> response) {
                System.out.print(response.body());
                departmentROObservable = Observable.just(response.body());
                departmentROObservable.subscribe(departmentROObserver);
            }

            @Override
            public void onFailure(Call<DepartmentRO> call, Throwable t) {
            }
        });
    }

    public void requestGetOffersOfTheDay(String url){
        apiInterface = APIClient.getClient(url).create(APIClientInterface.class);

        Call<OffersRO> call = apiInterface.getOffersofTheDay();
        call.enqueue(new Callback<OffersRO>() {
            @Override
            public void onResponse(Call<OffersRO> call, Response<OffersRO> response) {
                System.out.print(response.body());
                offersROObservable = Observable.just(response.body());
                offersROObservable.safeSubscribe(offersROObserver);
            }

            @Override
            public void onFailure(Call<OffersRO> call, Throwable t) {

            }
        });
    }

    public void requestGetProductOfferDetails(String url, String id){
        apiInterface = APIClient.getClient(url).create(APIClientInterface.class);
        Call<ProductOfferRO> call = apiInterface.getOfferProductDetail(id);
        call.enqueue(new Callback<ProductOfferRO>() {
            @Override
            public void onResponse(Call<ProductOfferRO> call, Response<ProductOfferRO> response) {
                System.out.print(response.body());
                productOfferROObservable = Observable.just(response.body());
                productOfferROObservable.safeSubscribe(productOfferROObserver);
            }

            @Override
            public void onFailure(Call<ProductOfferRO> call, Throwable t) {
            }
        });
    }


}
