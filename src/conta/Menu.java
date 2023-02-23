package conta;

import java.io.IOException;
import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;
import conta.model.ContaCorrente;
public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Conta c3 = new ContaCorrente(3, 123, 1, "Vitoria", 30000.0f, 1000.0f);
		c3.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(2,123,2, "Lucas Silva",40000.0f,19);
		cp1.visualizar();
		
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		float saldo, limite, valor;
		String titular;
		
		

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DOS DEV'S                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco dos Dev's - Tech e Inovação a um click de você!"
						+ "!!!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					System.out.println("Número da Agencia: ");
					agencia = leia.nextInt();
					
					System.out.println("Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					
					do {
					System.out.println("Tipo da Conta (1-CC / 2-CP): ");
					tipo = leia.nextInt();
					}while(tipo < 1 && tipo >2);
					
					System.out.println("Saldo da Conta: ");
					saldo = leia.nextFloat();
					
					switch(tipo) {
					case 1 ->{
						System.out.println("Limite da Conta: ");
						limite = leia.nextFloat();		
						ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
					}
					
					case 2 ->{
						System.out.println("Aniversário da Conta Poupança: ");
						aniversario = leia.nextInt();
						ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
					}
				}
					keyPress();
					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
					keyPress();
					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");
					
					System.out.println("Número da Conta: ");
					numero = leia.nextInt();
					
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");
					
					System.out.println("Número da Agencia: ");
					agencia = leia.nextInt();
					
					System.out.println("Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					tipo = 0;
					
					System.out.println("Saldo da Conta: ");
					saldo = leia.nextFloat();
					
					switch(tipo) {
					case 1 ->{
						System.out.println("Limite da Conta: ");
						limite = leia.nextFloat();		
						ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
					}
					
					case 2 ->{
						System.out.println("Aniversário da Conta Poupança: ");
						aniversario = leia.nextInt();
						ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
					}
				}
					
					
					keyPress();
					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");
					
					System.out.println("Número da Conta: ");
					numero = leia.nextInt();
					
					keyPress();
					break;
				case 6:
					System.out.println("Saque\n\n");
					
					System.out.println("Número da Conta: ");
					numero = leia.nextInt();
					
					System.out.println("Valor do Saque: ");
					valor = leia.nextFloat();
					
					
					keyPress();
					break;
				case 7:
					System.out.println("Depósito\n\n");
					
					System.out.println("Número da Conta: ");
					numero = leia.nextInt();
					
					System.out.println("Valor do Depósito: ");
					valor = leia.nextFloat();
					
					keyPress();
					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");
					
					System.out.println("Número da Conta - Origem: ");
					numero = leia.nextInt();
					
					System.out.println("Número da Conta - Destino: ");
					numeroDestino = leia.nextInt();
					
					System.out.println("Valor da Transferência: ");
					valor = leia.nextFloat();
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
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