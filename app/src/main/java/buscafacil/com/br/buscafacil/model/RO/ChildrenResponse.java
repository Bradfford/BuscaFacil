package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildrenResponse {

    @SerializedName("title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("children")
    private List<DepartmentResponse> departmentsResponse;

    public List<DepartmentResponse> getDepartmentsResponse() {
        return departmentsResponse;
    }

    public void setDepartmentsResponse(List<DepartmentResponse> departmentsResponse) {
        this.departmentsResponse = departmentsResponse;
    }
}
