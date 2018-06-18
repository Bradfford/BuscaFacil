package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class ProductOfferRO {

    @SerializedName("product")
    private ProductResponse productResponse;

    @SerializedName("offer")
    private ProductOfferResponse productOfferResponse;


    public ProductResponse getProductResponse() {
        return productResponse;
    }

    public void setProductResponse(ProductResponse productResponse) {
        this.productResponse = productResponse;
    }

    public ProductOfferResponse getProductOfferResponse() {
        return productOfferResponse;
    }

    public void setProductOfferResponse(ProductOfferResponse productOfferResponse) {
        this.productOfferResponse = productOfferResponse;
    }
}
