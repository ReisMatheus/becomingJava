package practiveJava;
import java.util.*;

public class Excecao2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Deque<Integer> vetor = new ArrayDeque<Integer>();
		vetor.push(0);
		vetor.push(1);
		vetor.push(3);
		int i = in.nextInt();
		try{
			calc(vetor, i);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bounds");
		}catch(EmptyStackException e){
			System.out.println("Empty stack");
		}finally{
			Iterator<Integer> itr = vetor.iterator();
			while(itr.hasNext()){
				int aux = itr.next();
				System.out.println(aux);
			}
		}
	}
	public static void calc(Deque<Integer> vetor, int i) throws ArrayIndexOutOfBoundsException, EmptyStackException{
		if(i > vetor.size()) throw new ArrayIndexOutOfBoundsException();
		if(vetor.contains(0)) throw new EmptyStackException();
	}
}