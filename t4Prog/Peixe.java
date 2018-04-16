import java.util.*;

public class Peixe extends Animal{

	private String caracteristica;

	public Peixe(String nome, String cor, String ambiente,
		 int comprimento, double velocidade, String caracteristica){

		super(nome, cor, ambiente, comprimento, velocidade);

		this.caracteristica = caracteristica;
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

	private void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
		System.out.println("Caracteristica alterado com sucesso");
	}

	//Retorna as características de um determinado peixe;
	private void getCaracteristica(){
		System.out.printf("%s\n", this.caracteristica);
	}
	//@Override
	public String getDados(){
		String foo = "Nome: "+this.nome+"\nCor: "+this.cor+"\nAmbiente: "+this.ambiente+"\nComprimento: "+this.comprimento+"\nVelocidade: "+this.velocidade+"m/s\nCaracteristica: "+this.caracteristica+"\n";
		return foo;
	}
}