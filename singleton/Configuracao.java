package singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private Map<String, String> propriedades;
    private static Configuracao instancia;

    private Configuracao() {
        this.propriedades = new HashMap<String, String>();

        propriedades.put("time-zone", "America/Bahia");
        propriedades.put("currency-code", "BRL");
        
    }

    public static Configuracao getInstancia() {
        if (Configuracao.instancia == null) {
            Configuracao.instancia = new Configuracao();
        }
        return Configuracao.instancia;
    }

    public String getPropriedade(String nome) {
        return Configuracao.instancia.propriedades.get(nome);
    }
}
