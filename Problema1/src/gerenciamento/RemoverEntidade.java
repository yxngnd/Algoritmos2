package gerenciamento;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;

public class RemoverEntidade {
	
	public static ArrayList<Fornecedor> removerDaListaFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaFornecedores.size(); i++) {
			Fornecedor forn = listaFornecedores.get(i);
			if(codigo == forn.getCodigo()) {
				listaFornecedores.remove(forn);	
			}
		}
		return listaFornecedores;
	}
	
	public static ArrayList<Usuario> removerDaListaUsuario(ArrayList<Usuario> listaUsuarios) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			Usuario user = listaUsuarios.get(i);
			if(codigo == user.getCodigo()) {
				listaUsuarios.remove(user);	
			}
		}
		return listaUsuarios;
	}
	
	public static ArrayList<Produto> removerDaListaProduto(ArrayList<Produto> listaProdutos) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaProdutos.size(); i++) {
			Produto prod = listaProdutos.get(i);
			if(codigo == prod.getCodigo()) {
				listaProdutos.remove(prod);	
			}
		}
		return listaProdutos;
	}
	
	public static ArrayList<Item> removerDaListaItem(ArrayList<Item> listaItens) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaItens.size(); i++) {
			Item item = listaItens.get(i);
			if(codigo == item.getCodigo()) {
				listaItens.remove(item);	
			}
		}
		return listaItens;
	}
	
	public static ArrayList<Venda> removerDaListaVenda(ArrayList<Venda> listaVendas) {
		Scanner input = new Scanner(System.in);
		int codigo;
		codigo = input.nextInt();
		for (int i = 0; i < listaVendas.size(); i++) {
			Venda vend = listaVendas.get(i);
			if(codigo == vend.getCodigo()) {
				listaVendas.remove(vend);	
			}
		}
		return listaVendas;
	}
	
}
