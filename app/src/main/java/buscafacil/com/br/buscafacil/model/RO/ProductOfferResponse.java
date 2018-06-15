package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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
