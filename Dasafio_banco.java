import java.util.Scanner;

public class Dasafio_banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, menuinicial, opcao , quantidadeDeposito;
		double valorDeposito , saldo =0, valorsaque;
		
		System.out.println("DESEJA INICIAR OM PROGRAMA? \n1 - SIM \n2 - NAO");
		menuinicial = sc.nextInt();
		
		while(menuinicial == 1) {
			
			System.out.println("SEJA BEM VINDO AO BANCO UMC !!! ");
			System.out.println("OPÇAO \n1 - DEPOSITO OPÇAO \n2 - SAQUE OPÇAO \n3 - SALDO");
			opcao = sc.nextInt();
			
			
			while((opcao != 1) && (opcao != 2) && (opcao != 3)) {
				System.out.println("OPÇAO INVALIDA DIGITE NOVAMNETE");
				System.out.println("OPÇAO \n1 - DEPOSITO OPÇAO \n2 - SAQUE OPÇAO \n3 SALDO");
                opcao = sc.nextInt();				
			}
			
			switch(opcao) {
			case 1:
				System.out.println("QUANTOS DEPOSITOS VOCE DESEJA FAZER ");
				quantidadeDeposito = sc.nextInt();
				for(i =1;i<=quantidadeDeposito;i++) {
					System.out.println("DIGITE O VALOR DESEJADO ");
					valorDeposito =sc.nextDouble();
					saldo = saldo + valorDeposito;
				}
				System.out.println("O SEU SALDO E: " + saldo);
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? \n1 - SIM \n2 - NAO");
				menuinicial = sc.nextInt();
				break;
			case 2:
				System.out.println("QUANTOS DESEJA SACAR?");
				valorsaque = sc.nextDouble();
				if(saldo >= 0 && valorsaque <= saldo) {
					saldo = saldo - valorsaque;
					System.out.println("O valor sacado foi R$ " + valorsaque + " O seu saldo é de R$: " + saldo);
				}
				else {
					System.out.println("SALDO INSUFICIENTE !!!!\n\nFAÇA UM DEPÓSITO PARA QUE VOCÊ POSSA SACAR OU DIGITE UM VALOR IGUAL OU MENOR QUE O SEU SALDO!!!");
				
				}
				System.out.println("DESEJA VOLTAR AO MENU PRINCIPAL \n1 - SIM OU \n2 - NAO");
				menuinicial = sc.nextInt();
				break;
				
			case 3:
				System.out.println("MENU SALDO !!!!");
				System.out.println("O SEU SALDO E DE R$ " + saldo);
				System.out.println("DESEJA VOLTAR AO MENU PRINCIPAL \n1 - SIM OU \n2 - NAO");
				menuinicial = sc.nextInt();
                break;
			}
			
		}		
		System.out.println("OBRIGADO POR ULTILIZAR O BANCO !!!");		
	}
}
