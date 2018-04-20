public class Animal{

	private String nome;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidade;
	private int patas;


	Animal(String nome, String cor, 
		String ambiente, int comprimento, 
		double velocidade, int patas){

		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}
	protected String setNome(String nome){
		this.nome = nome;
		return "Nome alterado com sucesso\n";
	}
	public String getNome(){
		return this.nome;
	}
	protected String setComprimento(int comprimento){
		this.comprimento = comprimento;
		return "Comprimento alterado com sucesso\n";
	}
	public int getComprimento(){
		return this.comprimento;
	}
	protected String setCor(String cor){
		this.cor = cor;
		return "Cor alterada com sucesso\n";
	}
	public String getCor(){
		return this.cor;
	}
	protected String setAmbiente(String ambiente){
		this.ambiente = ambiente;
		return "Ambiente alterado com sucesso\n";
	}
	public String getAmbiente(){
		return this.ambiente;
	}
	protected String setVelocidade(float velocidade){
		this.velocidade = velocidade;
		return "Velocidade alterada com sucesso\n";
	}
	public Double getVelocidade(){
		return this.velocidade;
	}
	protected String getDados(){
		String	foo = "Nome: "+this.nome+"\nCor: "+this.cor+"\nAmbiente: "+this.ambiente+"\nComprimento: "+this.comprimento+"\nVelocidade: "+this.velocidade+"\nPatas: "+this.patas+"\n";
		return foo;
	}
}