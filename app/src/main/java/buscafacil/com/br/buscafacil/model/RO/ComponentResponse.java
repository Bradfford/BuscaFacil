package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComponentResponse {


    @SerializedName("title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("children")
    private List<ChildrenResponse> childrensResponse;

    public List<ChildrenResponse> getChildrensResponse() {
        return childrensResponse;
    }

    public void setChildrensResponse(List<ChildrenResponse> childrensResponse) {
        this.childrensResponse = childrensResponse;
    }
}
