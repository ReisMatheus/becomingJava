import java.util.*;

public class Peixe extends Animal{
	private String caracteristica;

	public Peixe(String nome, String cor, String ambiente,
		 int comprimento, double velocidade, String caracteristica, int patas){

		super(nome, cor, ambiente, comprimento, velocidade, patas);

		this.caracteristica = caracteristica;
	}
	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
		System.out.println("Caracteristica alterado com sucesso");
	}

	//Retorna as características de um determinado peixe;
	public String getCaracteristica(){
		return "Caracteristicas: "+this.caracteristica;
	}
	@Override
	public String getDados(){
		return super.getDados()+getCaracteristica();
		//String foo = "Nome: "+this.nome+"\nCor: "+this.cor+"\nAmbiente: "+this.ambiente+"\nComprimento: "+this.comprimento+"\nVelocidade: "+this.velocidade+"m/s\nCaracteristica: "+this.caracteristica+"\n";
		//return foo;
	}
}