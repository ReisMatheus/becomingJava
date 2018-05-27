package trabalhoFinal;
import java.util.*;

public class Main{

	public static void main(String[] args){
		ArrayList<Tarefa> tasks = new ArrayList<Tarefa>();
		tasks.add(new Tarefa("Matheus", 40, "leitura", 2));
		tasks.get(0).descanso();
		do {
			System.out.println(tasks.get(0).totalDescanso());
		}while(tasks.get(0).descanso.getTotalDescanso() != 10);
	}

}
