import java.util.Scanner;

public class Farmacia{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastro e compra de medicamentos");
		int cadastro = 1;
		System.out.println("Digite o nome do medicamento:");
		String nome = entrada.nextLine();
		System.out.println("Digite o preco do medicamento:");
		Double precoVenda = entrada.nextDouble();
		System.out.println("Digite a data de validade do medicamento:");
		String dataValidade = entrada.next();
		System.out.println("Digite o laboratoria do medicamento:");
		String laboratorio = entrada.next();
		Boolean receitaObrigatoria;
		while(true){
			System.out.println("O medicamento necessita de receita?:\n(true) Sim\n(false) Nao");
			receitaObrigatoria = entrada.nextBoolean();
			if((receitaObrigatoria==true) || (receitaObrigatoria==false)){
				break;	
			}
		}
		System.out.println("Digite a quantidade do medicamento no estoque:");
		int qtdEstoque = entrada.nextInt();
		Remedios popular = new Remedios(nome, precoVenda, dataValidade, laboratorio, receitaObrigatoria, qtdEstoque);

		while(cadastro==1){
			System.out.println("\nPara mostrar dados do medicamento digite (1)\nPara reajustar preco de venda digite (2)\nPara vender digite (3)\nPara comprar digite (4)\n");
			int opcao = entrada.nextInt();
			switch(opcao){
				case 1:{
					popular.mostra();
					break;
				}
				case 2:{
					System.out.println("Para reajustar");
					break;
				}
				case 3:{
					System.out.println("Quantas unidade de "+popular.nome+" voce deseja?");
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
			System.out.println("\nPara sair digite (0)\nPara continuar digite (1)\n");
			cadastro = entrada.nextInt();
		}

	}
}