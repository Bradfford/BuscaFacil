package buscafacil.com.br.buscafacil.model.ro.departamentsRO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {

    @SerializedName("title")
    private String title;

    @SerializedName("options")
    private List<Subcategory> subcategories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
