package factory_method;

public class EmissorSMS implements Emissor {
    public void envia(String mensagem) {
        System.out.println("Juca: "+mensagem);
    }
}
