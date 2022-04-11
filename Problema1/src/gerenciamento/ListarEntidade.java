package gerenciamento;

import entidades.*;
public class ListarEntidade {

	public static void listarFornecedores() {
		System.out.println("CODIGO        NOME        CNPJ       ENDERECO");
		for (Fornecedor forn : Dados.fornecedores) {
			String nome = forn.getNome();
			String cnpj = forn.getCnpj();
			String ende = forn.getEndereco();
			int cod = forn.getCodigo();
			System.out.println(cod + "       " + nome + "      " + cnpj + "      " + ende);
		}
			
	}
	
	public static void listarUsuarios() {
		System.out.println("CODIGO        NOME       CPF       CARGO");
		for (Usuario user : Dados.usuarios) {
			String nome = user.getNome();
			String cpf = user.getCpf();
			String cargo = user.getCargo();
			int cod = user.getCodigo();
			System.out.println(cod + "       " + nome + "      " + cpf + "      " + cargo);
		}
			
	}
	
	public static void listarProdutos() {
		System.out.println("CODIGO        NOME         PRECO        VALIDADE");
		for (Produto prod : Dados.produtos) {
			String nome = prod.getNome();
			float preco = prod.getPreco();
			String valid = prod.getValidade();
			int cod = prod.getCodigo();
			System.out.println(cod + "       " + nome + "      " + preco + "      " + valid);
		}
			
	}
	
	public static void listarItens() {
		System.out.println("CODIGO        NOME        DESCRICAO         PRECO         CATEGORIA");
		for (Item item : Dados.cardapio) {
			String nome = item.getNome();
			String descricao = item.getDescricao();
			float preco = item.getPreco();
			String categoria = item.getCategoria();
			int cod = item.getCodigo();
			String ingredientes = "";
			
			for (Produto prod : item.getIngredientes()) {
				ingredientes += (prod + " ") ;
				}
			System.out.println(cod + "       " + nome + "      " + descricao + "      " + preco + "       " + categoria + "       " + ingredientes);
		}
			
	}
	
	public static void listarVendas() {
		System.out.println("CODIGO        DIA        HORARIO        PRECO TOTAL        MODO DE PAGAMENTO        ITENS VENDIDOS");
		for (Venda venda : Dados.vendas) {
			String dia = venda.getDia();
			String horario = venda.getHorario();
			float precoTotal = venda.getPrecoTotal();
			String modo = venda.getModoPagamento();
			int cod = venda.getCodigo();
			String vendidos = "";
			
			for (Item item : venda.getItens()) {
				vendidos += (item + " ") ;
				}
			System.out.println(cod + "       " + dia + "      " + horario + "      " + precoTotal + "       " + modo + "       " + vendidos);
		}
			
	}
}
