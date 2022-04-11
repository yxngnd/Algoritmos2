package menu;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;
import gerenciamento.*;

public class MenuGerencia {

	public static int menuFornecedor() {
		int indice = 0;
		Scanner inputGerencia = new Scanner(System.in);
		
		while(indice != 5) {
			System.out.println("Gerenciar Fornecedores:\n[1] - Cadastrar Fornecedor\n[2] - Editar Fornecedor\n[3] - Listar Fornecedores\n[4] - Excluir Fornecedor\n[5] - Voltar");
			
			indice = inputGerencia.nextInt();
			switch (indice) {
				case 1: {
					System.out.println("\nCadastro de Fornecedores");
					Fornecedor forn = CadastrarEntidade.entradaDadosFornecedor();
					CadastrarEntidade.adicionarEntidadeALista(forn, Dados.fornecedores);
					System.out.println("\n");
					break;
				}
				case 2: {
					System.out.println("Editar Fornecedor");
					EditarEntidade.editarFornecedor(Dados.fornecedores);
					System.out.println("Qual Fornecedor você quer editar? (codigo)");
					ListarEntidade.listarFornecedores();
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("Listar Fornecedores");
					ListarEntidade.listarFornecedores();
					System.out.println("\n");
					break;
				}
				case 4: {
					System.out.println("Remover Fornecedor");
					ListarEntidade.listarFornecedores();
					System.out.println("Qual Fornecedor você quer remover? (codigo)");
					Dados.fornecedores = RemoverEntidade.removerDaListaFornecedor(Dados.fornecedores);
					System.out.println("\n");
					break;
				}
				case 5: {
					System.out.println("Tchau\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
	public static int menuProduto() {
		int indice = 0;
		Scanner inputGerencia = new Scanner(System.in);
		
		while(indice != 5) {
			System.out.println("Gerenciar Produtos:\n[1] - Cadastrar Produto\n[2] - Editar Produto\n[3] - Listar Produto\n[4] - Excluir Produto\n[5] - Voltar");
			indice = inputGerencia.nextInt();
			
			switch (indice) {
				case 1: {
					System.out.println("Cadastro de Produto");
					Produto prod = CadastrarEntidade.entradaDadosProduto();
					CadastrarEntidade.adicionarEntidadeALista(prod, Dados.produtos);
					System.out.println("\n");
					break;
				}
				case 2: {
					System.out.println("Editar Produto");
					ListarEntidade.listarProdutos();
					System.out.println("Qual Fornecedor você quer editar? (codigo)");
					EditarEntidade.editarProduto(Dados.produtos);
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("Listar Produtos");
					ListarEntidade.listarProdutos();
					System.out.println("\n");
					break;
				}
				case 4: {
					System.out.println("Remover Produto");
					ListarEntidade.listarProdutos();
					System.out.println("Qual produto você quer remover? (codigo)");
					RemoverEntidade.removerDaListaProduto(Dados.produtos);
					System.out.println("\n");
					break;
				}
				case 5: {
					System.out.println("Tchau\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
	public static int menuVenda() {
		int indice = 0;
		Scanner inputGerencia = new Scanner(System.in);
		
		while(indice != 5) {
			System.out.println("Gerenciar Vendas:\n[1] - Cadastrar Venda\n[2] - Editar Venda\n[3] - Listar Venda\n[4] - Excluir Venda\n[5] - Voltar");
			indice = inputGerencia.nextInt();
			
			switch (indice) {
				case 1: {
					System.out.println("Cadastro de Venda");
					Venda vend = CadastrarEntidade.entradaDadosVenda();
					CadastrarEntidade.adicionarEntidadeALista(vend, Dados.vendas);
					System.out.println("\n");
					break;
				}
				case 2: {
					System.out.println("Editar Venda");
					ListarEntidade.listarVendas();
					System.out.println("Qual Fornecedor você quer editar? (codigo)");
					EditarEntidade.editarVenda(Dados.vendas);
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("Listar Vendas");
					ListarEntidade.listarVendas();
					System.out.println("\n");
					break;
				}
				case 4: {
					System.out.println("Remover Venda");
					ListarEntidade.listarVendas();
					System.out.println("Qual Venda você quer remover? (codigo)");
					RemoverEntidade.removerDaListaVenda(Dados.vendas);
					System.out.println("\n");
					break;
				}
				case 5: {
					System.out.println("Tchau\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
	public static int menuCardapio() {
		int indice = 0;
		Scanner inputGerencia = new Scanner(System.in);
		
		while(indice != 5) {
			System.out.println("Gerenciar Cardapio:\n[1] - Adicionar Item no Cardapio\n[2] - Editar Item do Cardapio\n[3] - Listar Itens do Cardapio\n[4] - Excluir Item do Cardapio\n[5] - Voltar");
			indice = inputGerencia.nextInt();
			
			switch (indice) {
				case 1: {
					System.out.println("Cadastro de Item");
					Item card = CadastrarEntidade.entradaDadosItem();
					CadastrarEntidade.adicionarEntidadeALista(card, Dados.cardapio);
					System.out.println("\n");
					break;
				}
				case 2: {
					System.out.println("Editar Item");
					ListarEntidade.listarItens();
					System.out.println("Qual Fornecedor você quer editar? (codigo)");
					EditarEntidade.editarItem(Dados.cardapio);
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("Listar Item");
					ListarEntidade.listarItens();
					System.out.println("\n");
					break;
				}
				case 4: {
					System.out.println("Remover Item");
					ListarEntidade.listarItens();
					System.out.println("Qual Item você quer remover? (codigo)");
					RemoverEntidade.removerDaListaItem(Dados.cardapio);
					System.out.println("\n");
					break;
				}
				case 5: {
					System.out.println("Tchau\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
	public static int menuUsuario() {
		int indice = 0;
		Scanner inputGerencia = new Scanner(System.in);
		
		while(indice != 5) {
			System.out.println("Gerenciar Usuarios:\n[1] - Cadastrar Usuario\n[2] - Editar Usuario\n[3] - Listar Usuarios\n[4] - Excluir Usuario\n[5] - Voltar");
			indice = inputGerencia.nextInt();
			
			switch (indice) {
				case 1: {
					System.out.println("Cadastro de Usuarios");
					Usuario user = CadastrarEntidade.entradaDadosUsuario();
					CadastrarEntidade.adicionarEntidadeALista(user, Dados.usuarios);
					System.out.println("\n");
					break;
				}
				case 2: {
					System.out.println("Editar Usuario");
					ListarEntidade.listarUsuarios();
					System.out.println("Qual Fornecedor você quer editar? (codigo)");
					EditarEntidade.editarUsuario(Dados.usuarios);
					System.out.println("\n");
					break;
				}
				case 3: {
					System.out.println("Listar Usuarios");
					ListarEntidade.listarUsuarios();
					System.out.println("\n");
					break;
				}
				case 4: {
					System.out.println("Remover Usuario");
					ListarEntidade.listarUsuarios();
					System.out.println("Qual Usuario você quer remover? (codigo)");
					RemoverEntidade.removerDaListaUsuario(Dados.usuarios);
					System.out.println("\n");
					break;
				}
				case 5: {
					System.out.println("Tchau\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
}
