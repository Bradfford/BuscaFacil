package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

public class AllDepartmentsResponse {

    @SerializedName("_id")
    private String id;

    @SerializedName("link")
    private String link;

    @SerializedName("title")
    private String title;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
