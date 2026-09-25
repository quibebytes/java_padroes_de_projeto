package facade;
import java.util.HashMap;

public class Financeiro {
    private HashMap<String, Float> precos;

    public Financeiro() {
        this.precos = new HashMap<String, Float>();
    }

    public void fatura(String cliente, String produto) {
        System.out.printf("=== %10s ===\n", cliente);
        System.out.printf("%s %.2f\n", produto, precos.get(produto));
        System.out.printf("=== %10s ===\n", " ");
    }

    public void cadastrarProduto(String produto, float preco) {
        this.precos.put(produto, preco);
    }
}
