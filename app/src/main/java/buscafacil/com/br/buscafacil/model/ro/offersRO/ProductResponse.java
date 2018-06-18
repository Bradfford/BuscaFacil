package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class ProductResponse {

    @SerializedName("result")
    private ProductOfferResult productOfferResult;


    public ProductOfferResult getProductOfferResult() {
        return productOfferResult;
    }

    public void setProductOfferResult(ProductOfferResult productOfferResult) {
        this.productOfferResult = productOfferResult;
    }
}
