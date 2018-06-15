package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

public class MenuResponse {

    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("component")
    private ComponentResponse componentResponse;


    public ComponentResponse getComponentResponse() {
        return componentResponse;
    }

    public void setComponentResponse(ComponentResponse componentResponse) {
        this.componentResponse = componentResponse;
    }
}


