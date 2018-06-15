package buscafacil.com.br.buscafacil.model.Service;

import java.util.List;

import buscafacil.com.br.buscafacil.model.RO.DepartmentRO;
import buscafacil.com.br.buscafacil.model.RO.OffersRO;
import buscafacil.com.br.buscafacil.model.RO.ProductOfferRO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIClientInterface {

    @GET("/v2/spacey-api/publications/desktop/feather?segment=RC%3DT0%2CMU%3DIN%2CMU%3DTC%2CMU%3DET")
    Call<DepartmentRO> getCategories();

    @GET("/spacey-api/publication/desktop/contenttop1/americanas/offer?segment=VE%3DSVQC%2CRC%3DT0%2CMU%3DMM%2CMU%3DIN%2CVE%3DAUQ%2CVA%3DAUEP")
    Call<OffersRO> getOffersofTheDay();

    @GET("/run-query/catalogo/product-with-boleto-and-acom-brand-card/7")
    Call<ProductOfferRO> getOfferProductDetail(@Query("id") String id);

}
