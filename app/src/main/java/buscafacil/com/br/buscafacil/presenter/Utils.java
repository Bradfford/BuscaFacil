package buscafacil.com.br.buscafacil.presenter;

public class Utils {

    private final static String SÁCEY_API_DOMAIN = "https://spacey-api-v2-americanas.b2w.io";
    private final static String RESTQL_SERVER_DOMAIN= "https://restql-server-api-v1-americanas.b2w.io";

    public static String getSpaceyApiDomain(){
        return SÁCEY_API_DOMAIN;
    }

    public static String getRestqlServerDomain(){
        return RESTQL_SERVER_DOMAIN;
    }

}
