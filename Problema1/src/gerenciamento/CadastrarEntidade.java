package gerenciamento;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;

public class CadastrarEntidade {
	
	
	
	public static Usuario entradaDadosUsuario() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do novo Usuário:");
		String nome = input.nextLine();
		System.out.println("CPF do novo Usuário:");
		String cpf = input.nextLine();
		System.out.println("Cargo do novo Usuário:");
		String cargo = input.nextLine();
		int codigo = 1;
		Usuario user = new Usuario(nome, cpf, cargo, codigo);
		return user;
	}
	
	public static Fornecedor entradaDadosFornecedor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome do novo Fornecedor:");
		String nome = input.nextLine();
		System.out.println("CNPJ do novo Fornecedor:");
		String cnpj = input.nextLine();
		System.out.println("Endereço do novo Fornecedor:");
		String endereco = input.nextLine();
		int codigo = 2;
		Fornecedor forn = new Fornecedor(cnpj, nome, endereco, codigo);
		return forn;
	}
	
	public static Produto entradaDadosProduto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome do novo Produto:");
		String nome = input.nextLine();
		System.out.println("Validade do novo Produto:");
		String validade = input.nextLine();
		System.out.println("Preço do novo Produto:");
		float preco = input.nextFloat();
		int codigo = 1;
		Produto prod = new Produto(nome, preco, validade, codigo);
		return prod;
	}
	
	public static Item entradaDadosItem() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do novo Item:");
		String nome = input.nextLine();
		System.out.println("Preço do novo Item:");
		float preco = input.nextFloat();
		input.nextLine();
		System.out.println("Descrição do novo Item:");
		String descricao = input.nextLine();
		System.out.println("Categoria do novo Item:");
		String categoria = input.nextLine();
		
		ArrayList<Produto> ingredientes = pegarIngredientes();
		int codigo = 1;
		Item coisa = new Item(nome, descricao, preco, categoria, ingredientes, codigo);
		return coisa;
	}
	
	public static Venda entradaDadosVenda() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dia da Venda:");
		String dia = input.nextLine();
		System.out.println("Horario da Venda:");
		String horario = input.nextLine();
		System.out.println("Preço total da Venda:");
		float precoTotal = input.nextFloat();
		System.out.println("Metodo de Pagamento:");
		String modoPagamento = input.nextLine();
		
		ArrayList<Item> itens = pegarItensDaVenda();
		int codigo = 1;
		Venda vend = new Venda(dia, horario, precoTotal, modoPagamento, itens, codigo);
		return vend;
	}
	
	public static ArrayList<Produto> pegarIngredientes(){
		ArrayList<Produto> ingredientes = new ArrayList<>();
		int quant;
		int codig;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos ingredientes tem nesse item? ");
		quant = input.nextInt();
		
		ListarEntidade.listarProdutos();
		System.out.println("Quais produtos?");
		for(int i = 0; i < quant; i++) {
			codig = input.nextInt();
			for (Produto prod : Dados.produtos) {
				if(codig == prod.getCodigo()) {
					ingredientes.add(prod);
				}
			}
		}
		return ingredientes;
	}
	
	public static ArrayList<Item> pegarItensDaVenda(){
		ArrayList<Item> vendidos = new ArrayList<>();
		int quant;
		int codig;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos itens foram vendidos? ");
		quant = input.nextInt();
		
		ListarEntidade.listarItens();
		System.out.println("Quais Itens?");
		for(int i = 0; i < quant; i++) {
			codig = input.nextInt();
			for (Item item : Dados.cardapio) {
				if(codig == item.getCodigo()) {
					vendidos.add(item);
				}
			}
		}
		return vendidos;
	}
	
	public static <T> void adicionarEntidadeALista(T entid, ArrayList<T> listaEntidade) {
		listaEntidade.add(entid);
	}
}
