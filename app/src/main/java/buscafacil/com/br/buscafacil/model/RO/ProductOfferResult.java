package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductOfferResult {

    @SerializedName("images")
    private List<ProductOfferResultImage> productOfferResultImageList;

    @SerializedName("name")
    private String productOfferName;

    public List<ProductOfferResultImage> getProductOfferResultImageList() {
        return productOfferResultImageList;
    }

    public void setProductOfferResultImageList(List<ProductOfferResultImage> productOfferResultImageList) {
        this.productOfferResultImageList = productOfferResultImageList;
    }

    public String getProductOfferName() {
        return productOfferName;
    }

    public void setProductOfferName(String productOfferName) {
        this.productOfferName = productOfferName;
    }
}
