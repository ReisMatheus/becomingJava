import java.util.Scanner;

class Programa{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Conta pessoa = new Conta();
		//System.out.println("Digite o nome do titular da conta: ");
		//pessoa.nome = entrada.nextLine();

		//System.out.println("Digite o saldo inicial dessa conta: ");
		//pessoa.saldo = entrada.nextDouble();

		//Manipulacao da conta do usuario (Saque, Deposito, Saldo)
		int sair = 0;
		while (sair == 0){
			System.out.println("Digite (1) para sacar;\nDigite (2) para depositar; \nDigite (3) para consultar saldo; \nDigite (4) para Bhaskara;");
			int opcao = entrada.nextInt();
			switch (opcao){
				case 1:{
					System.out.println("Quanto voce deseja sacar: ");
					int valor = entrada.nextInt();
					pessoa.saca(valor);
					break;
				}
				case 2:{
					System.out.println("Qual valor deseja depositar: ");
					int valor = entrada.nextInt();
					pessoa.depositar(valor);
					break;
				}
				case 3:{
					System.out.println("saldo atual: "+pessoa.saldo);
					break;
				}
				case 4:{
					double a = entrada.nextDouble();
					double b = entrada.nextDouble();
					double c = entrada.nextDouble();
					Bhaskara bhaskara = new Bhaskara(a, b, c);
					bhaskara.CalcBhaskara();
				}
			}
			System.out.println("Para sair digite (4); Para continuar digite (0)");
			sair = entrada.nextInt();
			if (sair == 4){
				break;
			}
		}
	}
}