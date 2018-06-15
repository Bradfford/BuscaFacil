package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComponentOfferResponse {

    @SerializedName("children")
    private List<ChildrenOffer> childrenOffers;


    public List<ChildrenOffer> getChildrenOffers() {
        return childrenOffers;
    }

    public void setChildrenOfferList(List<ChildrenOffer> childrenOffers) {
        this.childrenOffers = childrenOffers;
    }
}
