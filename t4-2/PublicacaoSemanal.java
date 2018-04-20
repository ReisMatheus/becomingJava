public class PublicacaoSemanal extends Publicacao{
	private double taxaEntrega;

	public PublicacaoSemanal(String nome, double precoExemplar){
		super(nome, precoExemplar);
	}
	public String calcularAnuidade(){
		this.valorAnuidade = getPrecoExemplar()*52;
		return "Anuidade da Publicacao Semanal: "+this.valorAnuidade;
	}
	public String calcularTaxaEntrega(){
		this.taxaEntrega = getPrecoExemplar()*0.5;
		return "Taxa de entrega: "+this.taxaEntrega;
	}
	public String getDadosPbSemanal(){
		return "Nome: "+getNome()+"\n"+"Preco Exemplar: "+getPrecoExemplar()+"\n"+calcularAnuidade()+"\n"+calcularTaxaEntrega()+"\n"+realEditora.getDadosEditora()+"\n";
	}
}