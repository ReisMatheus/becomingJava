package trabalhoFinal;

public class Tarefa extends User{
	//Declaracao de Variaveis
	private String id;
	private int prioridade;
	private float tempoGasto;
	public Descanso descanso;
	//Fim de Variaveis
	public Tarefa(String nome, float workTime, String id, int prioridade){//CONSTRUCTOR
		super(nome, workTime);
		this.id = id;
		this.prioridade = prioridade;
		descanso = new Descanso();
	}
	public Tarefa(){}//CONSTRUCTOR
	public String getId(){
		return this.id;
	}
	public int getPrioridade(){
		return this.prioridade;
	}
	public String gettempoGasto(){
		String rtr = "Tempo Gasto: "+this.tempoGasto;
		return rtr;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setPrioridade(int prioridade){
		this.prioridade = prioridade;
	}
	public void descanso(){
		descanso.startDescanso();
	}
	public String descansoSugerido(){
		String rtr;
		if(this.tempoGasto >= this.workTime/2){
			rtr = "Tente descansar por 15 minutos\nPressione o botao DESCANSO para iniciar o mesmo\n";
			return rtr;
		}
		if(this.tempoGasto >= this.workTime/1.2){
			rtr = "Tente descansar por 25 minutos\nPressione o botao DESCANSO para iniciar o mesmo\n";
			return rtr;
		}
		if(this.tempoGasto <= this.workTime/2){
			rtr = "Tente descansar por 10 minutos\nPressione o botao DESCANSO para iniciar o mesmo\n";
			return rtr;	
		}
		return "Sem descanso\n";
	}
	public String totalDescanso(){
		String rtr = "Total: "+descanso.getTotalDescanso();
		return rtr;
	}
	public void stopDescanso() {
		descanso.stopDescanso();
	}
}
