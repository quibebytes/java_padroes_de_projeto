// 1, 3, 4 e 5 padroes
// 1 codigo limpo
package decorator;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
public class EmissorDecoratorComCompressao extends EmissorDecorator {
    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    public void envia(String mensagem) {
        System.out.println(this.comprime(mensagem));
    }

    private String comprime(String mensagem) {
        byte[] mensagemBytes = mensagem.getBytes();
        ByteArrayOutputStream saidaStream = new ByteArrayOutputStream();
        DeflaterOutputStream saidaComprimida = new DeflaterOutputStream(saidaStream);
        try {
            saidaComprimida.write(mensagemBytes, 0, mensagemBytes.length);
            saidaComprimida.finish();
        } catch (Exception e) {
            System.out.println("FALHA AO TENTAR COMPRIMIR MENSAGEM:");
            System.out.println(mensagem);
        }

        return saidaStream.toString();
    }
}