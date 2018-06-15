package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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
