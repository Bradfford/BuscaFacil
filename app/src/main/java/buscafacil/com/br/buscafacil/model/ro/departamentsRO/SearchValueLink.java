package buscafacil.com.br.buscafacil.model.ro.departamentsRO;

import com.google.gson.annotations.SerializedName;

public class SearchValueLink {

    @SerializedName("self")
    private Self self;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }
}
