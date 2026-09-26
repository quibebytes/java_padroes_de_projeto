package decorator;
import java.util.Scanner;
public class TestaEmissorDecorator {
    public static void main(String[] args) {
        EmissorBasico emissor1 = new EmissorBasico();
        EmissorDecoratorComCriptografia emissorCriptogrado = new EmissorDecoratorComCriptografia(emissor1);
        EmissorBasico emissor2 = new EmissorBasico();
        EmissorDecoratorComCompressao emissorComprimido = new EmissorDecoratorComCompressao(emissor2);

        System.out.print("Digite uma mensagem: ");
        Scanner entrada = new Scanner(System.in);
        String mensagem = entrada.nextLine();

        System.out.println("=== MENSAGEM BASICA ===");
        emissor1.envia(mensagem);
        System.out.println("=== MENSAGEM CRIPTOGRAFADA ===");
        emissorCriptogrado.envia(mensagem);
        System.out.println("=== MENSAGEM COMPRIMIDA ===");
        emissorComprimido.envia(mensagem);
    }
}