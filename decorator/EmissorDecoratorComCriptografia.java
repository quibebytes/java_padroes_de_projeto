package decorator;
import java.security.MessageDigest;
public class EmissorDecoratorComCriptografia extends EmissorDecorator {
    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    public void envia(String mensagem) {
        System.out.println(this.criptografar(mensagem));
    }

    // TODO: TESTAR
    private String criptografar(String mensagem) {
        String mensagemCriptografada = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(mensagem.getBytes());
            byte[] bytesCriptografados = md.digest();
            mensagemCriptografada += new String(bytesCriptografados);
        } catch (Exception e) {
            System.out.println("FALHA AO TENTAR CRIPTOGRAFAR MENSAGEM:");
            System.out.println(mensagem);
        }
        return mensagemCriptografada;
    }
}