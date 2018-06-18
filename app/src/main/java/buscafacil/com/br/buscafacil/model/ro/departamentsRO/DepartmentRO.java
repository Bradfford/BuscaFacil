package buscafacil.com.br.buscafacil.model.ro.departamentsRO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DepartmentRO {

    @SerializedName("aggregations")
    private List<Aggregations> aggregations;


    public List<Aggregations> getAggregations() {
        return aggregations;
    }

    public void setAggregations(List<Aggregations> aggregations) {
        this.aggregations = aggregations;
    }
}
