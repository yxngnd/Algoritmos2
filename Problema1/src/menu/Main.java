package menu;
import java.util.Scanner;

public class Main {
	
	public static int login() {
		
		int opcao = 0;
		Scanner input = new Scanner(System.in);
		while(opcao != 3) {	
			System.out.println("Logar como:\n[1] - Gerente\n[2] - Funcionário\n[3] - Sair");
			opcao = input.nextInt();
			switch (opcao) {
				case 1: {
					MenuUsuario.menuDoGerente();
					break;
				}
				case 2: {
					MenuUsuario.menuDoFuncionario();
					break;
				}
				case 3: {
					System.out.println("Tchau");
					break;
				}
				default: {
					System.out.println("Ta errado tenta de novo.");
					break;
				}
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) { 
		login();
		
	}

}
