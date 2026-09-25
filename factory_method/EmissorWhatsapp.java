package factory_method;

public class EmissorWhatsapp implements Emissor {
    public void envia(String mensagem) {
        System.out.println("[Juca]: "+mensagem);
    }
}
