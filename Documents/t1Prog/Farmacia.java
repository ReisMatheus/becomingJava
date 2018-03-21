import java.util.Scanner;

public class Farmacia {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastro e compra de medicamentos");
		int sair = 0;
		while(sair==0){
			int opcao = entrada.nextInt();
			System.out.println("Para cadastrar digite (1)\n
								Para reajustar preco de venda digite (2)\n
								Para vender digite (3)\n
								Para comprar digite (4)\n");
			switch(opcao){
				case 1:{
					System.out.println("Digite o nome do medicamento:\n");
					String nome = entrada.nextLine();
					System.out.println("Digite o preco do medicamento:\n");
					Double precoVenda = entrada.nextDouble();
					System.out.println("Digite a data de validade do medicamento:\n");
					String dataValidade = entrada.nextLine();
					System.out.println("Digite o laboratoria do medicamento:\n");
					String laboratorio = entrada.nextLine();
					while(1){
						System.out.println("O medicamento necessita de receita?:\n(1) Sim\n(0) Nao");
						Boolean receitaObrigatoria = entrada.nextBoolean();
						if(receitaObrigatoria==true or receitaObrigatoria==false){
							break;
						}
					}
					System.out.println("Digite a quantidade do medicamento no estoque:\n");
					int qtdEstoque = entrada.nextInt();
					Remedios popular = new Remedios(
													nome, precoVenda, dataValidade,
													 laboratorio, receitaObrigatoria, 
													 qtdEstoque);
					break;
				}
				case 2:{
					break;
				}
				case 3:{
					break;
				}
				case 4:{

				}
				default:{
					System.out.println("Essa opcao nao e valida\n");
				}

			}
			System.out.prinln("Para sair digite (1)\nPara continuar digite (0)\n");
			opcao = entrada.nextInt();
		}

	}
}