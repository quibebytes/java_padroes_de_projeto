package facade;
import java.time.LocalDate;
public class TestePedidoFacade {
	public static void main(String[] args) {
		Pedido p = new Pedido("Mouse", "Juquinha", "Rua Jose Joao, s\\n, Vale do Sol, cep 2100-983");
		
		PosVenda posVenda = new PosVenda();
		Estoque estoque = new Estoque(posVenda);
		Financeiro financeiro = new Financeiro();
		
		LocalDate data_prevista = LocalDate.now().plusDays(15);
		estoque.cadastrarProduto(p.getProduto(), p.getEnderecoDeEntrega(), data_prevista);
		estoque.cadastrarEndereco(p.getCliente(), p.getEnderecoDeEntrega());
		financeiro.cadastrarProduto(p.getProduto(), 30.0f);
		PedidoFacade fachada = new PedidoFacade(estoque, financeiro, posVenda);
		fachada.registraPedido(p);	
	}
}