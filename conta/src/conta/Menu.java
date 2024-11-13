package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// TESTE DE CONTA CORRENTE
		ContaCorrente cc1 = new ContaCorrente(3, 234, 5, "VIVIAN", 0.0f, 10000.0f);
		cc1.visualizar();
		cc1.sacar(10000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// TESTE DE CONTA POUPANÇA
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Olivia santos ", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner scanner = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_UNDERLINED + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************************");
			System.out.println("                                                  ");
			System.out.println("                BANCO DO BRAzIL                   ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("            1 - Criar Conta                       ");
			System.out.println("            2 - Listar todas as Contas            ");
			System.out.println("            3 - Buscar Conta por Número           ");
			System.out.println("            4 - Atualizar Dados da Conta          ");
			System.out.println("            5 - Apagar conta                      ");
			System.out.println("            6 - Sacar                             ");
			System.out.println("            7 - Depositar                         ");
			System.out.println("            8 - Transferir valores entre Contas   ");
			System.out.println("            9 - Sair                              ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("Entre com a opção desejada:                       ");
			System.out.println("                                                  " + Cores.TEXT_RESET);

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\n Digite valores  inteiros: ");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Banco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
				
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
				
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vivian Cuentas");
		System.out.println("Generation Brasil Turma 78 - generation@generation.org");
		System.out.println("github.com/vivianrcc");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}

	}
}
