import java.util.*;

public class Publicacao{
	private String nome;
	private Double precoExemplar;
	protected Double valorAnuidade;
	public Editora realEditora = new Editora();

	public Publicacao(String nome,
					 Double precoExemplar){
		this.nome = nome;
		this.precoExemplar = precoExemplar;
	}
	protected String setEditora(String nome, int cnpj){
		Editora realEditora = new Editora(nome, cnpj);
		return "Editora definida com sucesso";
	}
	protected String setNome(String nome){
		this.nome = nome;
		return "Nome alterado com sucesso";
	}
	public String getNome(){
		return this.nome;
	}
	protected String setPrecoExemplar(Double precoExemplar){
		this.precoExemplar = precoExemplar;
		return "Preco exemplar alterado com sucesso";
	}
	public Double getPrecoExemplar(){
		return this.precoExemplar;
	}
	protected String calcularAnuidade(){
		this.valorAnuidade = this.precoExemplar*12;
		return "Anuidade calculada com sucesso";
	}
	public String getAnuidade(){
		calcularAnuidade();
		return "Valor Anuidade:"+this.valorAnuidade;
	}
	protected String getDados(){
		return "Nome: "+this.nome+"\nPreco Exemplar: "+this.precoExemplar+"\nValor Anuidade: "+this.valorAnuidade+"\n"+realEditora.getDados()+"\n";
	}

}