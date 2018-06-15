package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductOfferResponseResult {

    @SerializedName("offers")
    private List<ProductOffer> productOfferList;


    public List<ProductOffer> getProductOfferList() {
        return productOfferList;
    }

    public void setProductOfferList(List<ProductOffer> productOfferList) {
        this.productOfferList = productOfferList;
    }
}
