package buscafacil.com.br.buscafacil.model.ro.departamentsRO;

import com.google.gson.annotations.SerializedName;

public class Subcategory {

    @SerializedName("_links")
    private SearchValueLink searchValueLink;

    @SerializedName("title")
    private String title;

    public SearchValueLink getSearchValueLink() {
        return searchValueLink;
    }

    public void setSearchValueLink(SearchValueLink searchValueLink) {
        this.searchValueLink = searchValueLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
