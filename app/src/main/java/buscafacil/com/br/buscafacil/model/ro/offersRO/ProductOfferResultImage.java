package buscafacil.com.br.buscafacil.model.ro.offersRO;

import com.google.gson.annotations.SerializedName;

public class ProductOfferResultImage {

    @SerializedName("small")
    private String smallImage;

    @SerializedName("medium")
    private String mediumImage;

    @SerializedName("big")
    private String bigImage;

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }
}
