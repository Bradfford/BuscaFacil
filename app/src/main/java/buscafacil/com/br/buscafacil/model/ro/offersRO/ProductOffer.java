package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class ProductOffer {

    @SerializedName("salesPrice")
    private String salesPrice;

    @SerializedName("listPrice")
    private String listPrice;


    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }
}
