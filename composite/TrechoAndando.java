package composite;
public class TrechoAndando implements Trecho{
    private String direcao;
    private double distancia;
    public TrechoAndando(String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }
    @Override
    public void imprime(){
        System.out.println("Andando: "+ direcao + " por " + distancia + " metros.");
    }
}
// TrechoAndando trecho1 = new TrechoAndando("Siga em frente", 500);