package composite;
import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho {

    private List<Trecho> trechos;

    public Caminho() {
        trechos = new ArrayList<>();
    }

    public void adiciona(Trecho trecho) {
        trechos.add(trecho);
    }

    public void remove(Trecho trecho) {
        trechos.remove(trecho);
    }

    @Override
    public void imprime() {
        for (Trecho trecho : trechos) {
            trecho.imprime();
        }
    }
}