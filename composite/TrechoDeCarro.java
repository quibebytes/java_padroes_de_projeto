package composite;
public class TrechoDeCarro implements Trecho {

    private String direcao;
    private double distancia;

    public TrechoDeCarro(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("De carro: " + direcao + " por " + distancia + " metros.");
    }
}