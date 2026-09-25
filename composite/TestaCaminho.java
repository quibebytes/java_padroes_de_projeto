package composite;
public class TestaCaminho {

    public static void main(String[] args) {

        TrechoAndando trecho1 = new TrechoAndando("Siga em frente",500);

        TrechoAndando trecho2 = new TrechoAndando("Vire à direita",200);

        TrechoDeCarro trecho3 = new TrechoDeCarro("Siga pela avenida",100);

        TrechoDeCarro trecho4 = new TrechoDeCarro("Vire à esquerda",300);

        Caminho caminho1 = new Caminho();

        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);
        caminho1.adiciona(trecho3);

        System.out.println("____________CAMINHO 1_____________");
        caminho1.imprime();

        Caminho caminho2 = new Caminho();

        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho4);

        System.out.println("\n___________CAMINHO 2 ____________");
        caminho2.imprime();
    }
}