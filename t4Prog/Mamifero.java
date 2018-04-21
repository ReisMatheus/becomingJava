public class Mamifero extends Animal{
	private String alimento;

	public Mamifero (String nome, String cor, 
		String ambiente, int comprimento, 
		double velocidade, String alimento, int patas){

		super(nome, cor, ambiente, comprimento, velocidade, patas);
		this.alimento = alimento;
	}

	public String setAlimento(String alimento){
		this.alimento = alimento;
		String str = "Alimento alterado com sucesso\n";
		return str;
	}

	public String getAlimento(){
		String str = "%s\n"+this.alimento;
		return str;
	}
	@Override
	public String getDados(){
		return super.getDados();
	}
}