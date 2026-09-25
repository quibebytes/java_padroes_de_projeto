package facade;
import java.time.LocalDate;

public class PedidoFacade {
    Estoque estoque;
    Financeiro financeiro;
    PosVenda posVenda;

    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posVenda;
    }

    public void registraPedido(Pedido p) {
        LocalDate data = LocalDate.now().plusDays(14);
        
        this.estoque.cadastrarProduto(p.getProduto(), p.getEnderecoDeEntrega(), data);
        this.estoque.cadastrarEndereco(p.getCliente(), p.getEnderecoDeEntrega());
        this.estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega());
        this.financeiro.fatura(p.getCliente(), p.getProduto());
        this.posVenda.agendaContato(p.getCliente(), p.getProduto());
        this.posVenda.exibirPrazoAgendamento(p.getCliente(), p.getProduto());
    }
}