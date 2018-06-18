package buscafacil.com.br.buscafacil.presenter.po.departmentsPO;

import java.util.List;

import buscafacil.com.br.buscafacil.model.ro.departamentsRO.Subcategory;

public class DepartmentPLObject {

    private String id;
    private String title;
    private String link;
    private List<SubcategoryPLObject> subcategoryPLObjectList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public List<SubcategoryPLObject> getSubcategoryPLObjectList() {
        return subcategoryPLObjectList;
    }

    public void setSubcategoryPLObjectList(List<SubcategoryPLObject> subcategoryPLObjectList) {
        this.subcategoryPLObjectList = subcategoryPLObjectList;
    }
}
