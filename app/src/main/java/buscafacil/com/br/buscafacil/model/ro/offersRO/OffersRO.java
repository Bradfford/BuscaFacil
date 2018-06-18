package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class OffersRO {

    @SerializedName("name")
    private String name;

    @SerializedName("component")
    private ComponentOfferResponse componentOfferResponse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentOfferResponse getComponentOfferResponse() {
        return componentOfferResponse;
    }

    public void setComponentOfferResponse(ComponentOfferResponse componentOfferResponse) {
        this.componentOfferResponse = componentOfferResponse;
    }
}


