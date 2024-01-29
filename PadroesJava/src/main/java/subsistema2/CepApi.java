package subsistema2;

import GoF.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Santa Rita do Sapucai";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }

}
