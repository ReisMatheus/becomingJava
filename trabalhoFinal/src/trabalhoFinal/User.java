package trabalhoFinal;

import java.util.Date;
import java.util.Calendar;
import java.text.*;

public class User{ //SUPERCLASS
	//Declaracao de Variaveis
	private String nome;
	protected float workTime;
	private Date date = new Date();
	//Fim de Variaveis
	public User(){}//CONSTRUCTOR
	public User(String nome, float workTime){//CONSTRUCTOR
		this.nome = nome;
		this.workTime = workTime;
	}
	protected String getNome(){
		return this.nome;
	}
	protected String getworkTime(){
		String rtr = "Horas de trabalho: "+this.workTime;
		return rtr;
	}
	protected String getDate(){
		this.date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String actualDate = formatter.format(date);
		return actualDate;
	}
	protected void setNome(String nome){
		this.nome = nome;
	}
	protected void setworTime(float time){
		this.workTime = time;
	}
}
