package buscafacil.com.br.buscafacil.model.service;

import buscafacil.com.br.buscafacil.model.ro.departamentsRO.DepartmentRO;
import buscafacil.com.br.buscafacil.model.ro.offersRO.OffersRO;
import buscafacil.com.br.buscafacil.model.ro.offersRO.ProductOfferRO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIClientInterface {

//    @GET("/v2/spacey-api/publications/desktop/feather?segment=RC%3DT0%2CMU%3DIN%2CMU%3DTC%2CMU%3DET")
    @GET("search?content=todos+os+departamentos&sortBy=relevance&source=nanook&suggestion=false")
    Call<DepartmentRO> getAllDepartaments();

    @GET("/spacey-api/publication/desktop/contenttop1/americanas/offer?segment=VE%3DSVQC%2CRC%3DT0%2CMU%3DMM%2CMU%3DIN%2CVE%3DAUQ%2CVA%3DAUEP")
    Call<OffersRO> getOffersofTheDay();

    @GET("/run-query/catalogo/product-with-boleto-and-acom-brand-card/7")
    Call<ProductOfferRO> getOfferProductDetail(@Query("id") String id);

}
