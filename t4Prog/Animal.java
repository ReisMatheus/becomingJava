public class Animal{

	protected String nome;
	protected int comprimento;
	protected String cor;
	protected String ambiente;
	protected double velocidade;

	Animal(String nome, String cor, 
		String ambiente, int comprimento, 
		double velocidade){

		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}

	//Muda Nome
	public void setNome(String nome){
		this.nome = nome;

	}

	//Muda Comprimento
	public void setComprimento(int comprimento){
		this.comprimento = comprimento;
	}

	//Muda Cor
	public void setCor(String cor){
		this.cor = cor;
	}

	//Muda Ambiente
	public void setAmbiente(String ambiente){
		this.ambiente = ambiente;
	}

	//Muda Velocidade
	public void setVelocidade(float velocidade){
		this.velocidade = velocidade;
	}

	public String getDados(){
		return "super";
	}
}