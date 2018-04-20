public class Editora{
	private String nome;
	private int cnpj;
	public Editora(String nome, int cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}
	protected Editora(){
		this.nome = "Sem nome";
		this.cnpj = 0;
	}
	protected String getNome(){
		return "Nome Editora: "+this.nome;
	}
	protected String setNome(String nome){
		this.nome = nome;
		return "Nome alterado com sucesso";
	}
	protected String getCnpj(){
		return "Editora Cnpj: "+this.cnpj;	
	}
	protected String setCnpj(int cnpj){
		this.cnpj = cnpj;
		return "CNPJ alterado com sucesso";
	}
	protected String getDadosEditora(){
		return "Nome Editora: "+this.nome+"\nCNPJ: "+this.cnpj;
	}
}