package GoF.facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String CEP){

        String cidade = CepApi.getInstancia().recuperarCidade(CEP);
        String estado = CepApi.getInstancia().recuperarEstado(CEP);

        CrmService.gravarCliente(nome, CEP, cidade, estado);

    }

}
