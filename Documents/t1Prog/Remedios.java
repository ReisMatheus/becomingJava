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

	}
	void comprar(int quantidade){
		
	}
}