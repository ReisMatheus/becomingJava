public class Mamifero extends Animal{
	private int patas;
	private String alimento;

	public Mamifero (String nome, String cor, 
		String ambiente, int comprimento, 
		double velocidade, String alimento, int patas){

		super(nome, cor, ambiente, comprimento, velocidade);

		this.alimento = alimento;
		this.patas = patas;
	}

	public void setNome(String nome){
		super.setNome(nome);
	}

	public void setComprimento(int comprimento){
		super.setComprimento(comprimento);
	}

	public void setCor(String cor){
		super.setCor(cor);
	}
	
	public void setAmbiente(String ambiente){
		super.setAmbiente(ambiente);
	}

	public void setVelocidade(float velocidade){
		super.setVelocidade(velocidade);
	}

	private void setPatas(int patas){
		this.patas = patas;
		System.out.println("Patas alteradas com sucesso");
	}

	private void setAlimento(String alimento){
		this.alimento = alimento;
		System.out.println("Alimento alterado com sucesso");
	}

	public String getAlimento(){
		return String.format ("%s\n", this.alimento);

	}
	public String getDados(){
		String	foo = "Nome: "+this.nome+"\nCor: "+this.cor+"\nAmbiente: "+this.ambiente+"\nComprimento: "+this.comprimento+"\nVelocidade: "+this.velocidade+"m/s\nAlimento: "+this.alimento+"\nPatas: "+this.patas+"\n";
		return foo;
	}
}