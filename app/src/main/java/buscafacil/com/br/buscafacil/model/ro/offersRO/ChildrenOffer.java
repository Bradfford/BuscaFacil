package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class ChildrenOffer {

    @SerializedName("_id")
    private String offerid;

    @SerializedName("productId")
    private String productOfferId;

    @SerializedName("title")
    private String title;


    public String getOfferid() {
        return offerid;
    }

    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public String getProductOfferId() {
        return productOfferId;
    }

    public void setProductOfferId(String productOfferId) {
        this.productOfferId = productOfferId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
