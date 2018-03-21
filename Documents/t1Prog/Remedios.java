public class Remedios{
	String nome;
	Double precoVenda;
	String dataValidade;
	String laboratorio;
	Boolean receitaObrigatoria;
	int qtdEstoque;

	public Remedios(
					String nome, 
					Double precoVenda, 
					String dataValidade, 
					String laboratorio, 
					Boolean receitaObrigatoria,
					int qtdEstoque){
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.laboratorio = laboratorio;
		this.receitaObrigatoria = receitaObrigatoria;
		this.qtdEstoque = qtdEstoque;
	}
	void reajustaPrecoVenda(Double percentual){

	}
	void vender(int quantidade){
		System.out.println(this.nome);
		if (this.receitaObrigatoria==true){
			System.out.println("Esse medicamento só é vendido sob prescrição médica\n");
		}
		else if(this.qtdEstoque>0){
			Double valorTotal = quantidade * this.precoVenda;
			this.qtdEstoque -= quantidade;
			System.out.printf("Medicamento: "+this.nome+"\nQuantidade: %s\nValor Unidade: %.2f\nValor Total: %.2f", quantidade, this.precoVenda, valorTotal);
		}

	}
	void comprar(int quantidade){
		
	}
}