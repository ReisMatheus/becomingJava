import java.util.Scanner;

public class Farmacia {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastro e compra de medicamentos");
		int cadastro = 0;
		System.out.println("Digite o nome do medicamento:\n");
		String nome = entrada.nextLine();
		System.out.println("Digite o preco do medicamento:\n");
		Double precoVenda = entrada.nextDouble();
		System.out.println("Digite a data de validade do medicamento:\n");
		String dataValidade = entrada.nextLine();
		System.out.println("Digite o laboratoria do medicamento:\n");
		String laboratorio = entrada.nextLine();
		Boolean receitaObrigatoria;
		while(true){
			System.out.println("O medicamento necessita de receita?:\n(1) Sim\n(0) Nao");
			receitaObrigatoria = entrada.nextBoolean();
			if((receitaObrigatoria==true) || (receitaObrigatoria==false)){
				break;	
			}
		}
		System.out.println("Digite a quantidade do medicamento no estoque:\n");
		int qtdEstoque = entrada.nextInt();
		Remedios popular = new Remedios(nome, precoVenda, dataValidade, laboratorio, receitaObrigatoria, qtdEstoque);

		while(cadastro==1){
			int i=1;
			System.out.println("\nPara reajustar preco de venda digite (2)\nPara vender digite (3)\nPara comprar digite (4)\n");
			int opcao = entrada.nextInt();
			switch(opcao){
				case 1:{
					break;
				}
				case 2:{
					System.out.println("Para reajustar");
					break;
				}
				case 3:{
					System.out.println("Qual medicamento você deseja?\n");
					int quantidade = entrada.nextInt();
					popular.vender(quantidade);
					break;
				}
				case 4:{
					System.out.println("Deseja comprar qual medicamento?\n");
					break;
				}
				default:{
					System.out.println("Essa opção não é válida\n");
				}

			}
			System.out.println("Para sair digite (0)\nPara continuar digite (1)\n");
			cadastro = entrada.nextInt();
		}

	}
}