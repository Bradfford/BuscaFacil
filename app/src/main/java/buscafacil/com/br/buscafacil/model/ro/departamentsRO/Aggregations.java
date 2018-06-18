package buscafacil.com.br.buscafacil.model.ro.departamentsRO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Aggregations {

    @SerializedName("options")
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
