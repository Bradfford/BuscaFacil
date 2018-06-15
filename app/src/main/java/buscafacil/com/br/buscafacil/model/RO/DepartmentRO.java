package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

public class DepartmentRO {

    @SerializedName("menu")
    private MenuResponse menuResponse;

    public MenuResponse getMenuResponse() {
        return menuResponse;
    }

    public void setMenuResponse(MenuResponse menuResponse) {
        this.menuResponse = menuResponse;
    }
}
