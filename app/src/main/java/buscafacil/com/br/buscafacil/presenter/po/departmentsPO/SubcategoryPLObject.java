package buscafacil.com.br.buscafacil.presenter.po.departmentsPO;

import java.io.Serializable;

public class SubcategoryPLObject implements Serializable{

    private String title;
    private String searchLink;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSearchLink() {
        return searchLink;
    }

    public void setSearchLink(String searchLink) {
        this.searchLink = searchLink;
    }
}
