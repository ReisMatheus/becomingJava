package trabalhoFinal;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.*;

public class Descanso implements Timer{
	StopWatch descanso = new StopWatch();
	TimeUnit descansoConv = TimeUnit.SECONDS;
	long totalDescanso;
	
	public long getTotalDescanso() {
		return this.totalDescanso;
	}
	public void startDescanso(){
		this.descanso.start();
		this.totalDescanso = this.descanso.getTime(descansoConv);
		if(this.descanso.getTime(descansoConv) >= 15) this.descanso.stop(); this.stopDescanso();
	}
	public void stopDescanso(){
		this.descanso.suspend();
		this.totalDescanso = descanso.getTime(this.descansoConv);
	}
	/*public String descansoSugerido(float tempoGasto){
		return "Tempo Sugerido\n"+tempoGasto;
	}*/
	public String parcialDescanso(float tempoGasto){
		return "Parcial Descanso\n"+tempoGasto;
	}
	public String totalDescanso(){
		return "Total Descanso (segundos): \n"+this.totalDescanso;
	}
}