package factory_method;

public class EmissorEmail implements Emissor {
    public void envia(String mensagem) {
        System.out.println("from Juca: \""+mensagem+"\"");
    }
}
