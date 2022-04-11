package menu;

import java.util.Scanner;
public class MenuUsuario {
	
	public static int menuDoGerente() {
		int indice = 0;
		Scanner inputUsuario = new Scanner(System.in);
		
		while(indice != 6) {
			System.out.println("Menu:\n[1] - Gerenciar Fornecedores\n[2] - Gerenciar Produtos\n[3] - Gerenciar Cardapio\n[4] - Gerenciar Vendas\n[5] - Gerenciar Usuarios\n[6] - Sair");
			indice = inputUsuario.nextInt();
			switch (indice) {
				case 1: {
					MenuGerencia.menuFornecedor();
					break;
				}
				case 2: {
					MenuGerencia.menuProduto();
					break;
				}
				case 3: {
					MenuGerencia.menuCardapio();
					break;
				}
				case 4: {
					MenuGerencia.menuVenda();
					break;
				}
				case 5: {
					MenuGerencia.menuUsuario();
					break;
				}
				case 6: {
					System.out.println("Tchau.\n");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.\n");
					break;
			}
		}
		return 0;
	}
	
	public static int menuDoFuncionario() {
		int indice = 0;
		Scanner inputUsuario = new Scanner(System.in);
		
		while(indice != 4) {
			System.out.println("Menu:\n[1] - Gerenciar Vendas\n[2] - Gerenciar Produtos\n[3] - Gerenciar Cardapio\n[6] - Sair");
			indice = inputUsuario.nextInt();
			
			switch (indice) {
				case 1: {
					MenuGerencia.menuVenda();
					break;
				}
				case 2: {
					MenuGerencia.menuProduto();
					break;
				}
				case 3: {
					MenuGerencia.menuCardapio();
					break;
				}
				case 4: {
					System.out.println("Tchau");
					break;
				}
				default:
					System.out.println("Ta errado tenta de novo.");
					break;
			}
		}
		return 0;
	}
	
}
