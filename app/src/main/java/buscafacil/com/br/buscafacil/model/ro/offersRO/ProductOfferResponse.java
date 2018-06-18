package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public  class ProductOfferResponse {

    @SerializedName("result")
    private ProductOfferResponseResult productOfferResponseResult;


    public ProductOfferResponseResult getProductOfferResponseResult() {
        return productOfferResponseResult;
    }

    public void setProductOfferResponseResult(ProductOfferResponseResult productOfferResponseResult) {
        this.productOfferResponseResult = productOfferResponseResult;
    }
}
