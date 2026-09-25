package singleton;

public class TestaConfiguracao {
    public static void main(String[] args) {
        Configuracao configuracao1 = Configuracao.getInstancia();
        Configuracao configuracao2 = Configuracao.getInstancia();

        if (configuracao1 == configuracao2) {
            System.out.println("Configuracoes sao a mesma");
        } else {
            System.out.println("Configuracoes sao diferentes");
        }

        String time_zone = configuracao1.getPropriedade("time-zone");
        String currency_code = configuracao2.getPropriedade("currency-code");
        System.out.println(time_zone);
        System.out.println(currency_code);

    }
}
