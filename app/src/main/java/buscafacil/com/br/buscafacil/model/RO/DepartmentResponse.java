package buscafacil.com.br.buscafacil.model.RO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DepartmentResponse {
    @SerializedName("children")
    private List<AllDepartmentsResponse> allDepartments;

    public List<AllDepartmentsResponse> getAllDepartments() {
        return allDepartments;
    }

    public void setAllDepartments(List<AllDepartmentsResponse> allDepartments) {
        this.allDepartments = allDepartments;
    }
}
