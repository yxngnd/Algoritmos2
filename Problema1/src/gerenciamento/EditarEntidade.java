package gerenciamento;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;

public class EditarEntidade {
	
	public static void editarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaFornecedores.size(); i++) {
			Fornecedor forn = listaFornecedores.get(i);
			if(codigo == forn.getCodigo()) {
				listaFornecedores.set(i, CadastrarEntidade.entradaDadosFornecedor());	
			}
		}
	}	
	
	public static void editarUsuario(ArrayList<Usuario> listaUsuarios) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			Usuario user = listaUsuarios.get(i);
			if(codigo == user.getCodigo()) {
				listaUsuarios.set(i, CadastrarEntidade.entradaDadosUsuario());	
			}
		}
	}	
	
	public static void editarProduto(ArrayList<Produto> listaProdutos) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaProdutos.size(); i++) {
			Produto prod = listaProdutos.get(i);
			if(codigo == prod.getCodigo()) {
				listaProdutos.set(i, CadastrarEntidade.entradaDadosProduto());	
			}
		}
	}	
	
	public static void editarItem(ArrayList<Item> listaItens) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaItens.size(); i++) {
			Item item = listaItens.get(i);
			if(codigo == item.getCodigo()) {
				listaItens.set(i, CadastrarEntidade.entradaDadosItem());	
			}
		}
	}	
	
	public static void editarVenda(ArrayList<Venda> listaVendas) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaVendas.size(); i++) {
			Venda vend = listaVendas.get(i);
			if(codigo == vend.getCodigo()) {
				listaVendas.set(i, CadastrarEntidade.entradaDadosVenda());	
			}
		}
	}	
}
