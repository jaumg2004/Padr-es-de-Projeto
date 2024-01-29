package subsistema1;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String CEP, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(CEP);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
