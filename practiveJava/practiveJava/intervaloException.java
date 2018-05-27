package practiveJava;
import java.util.*;

public class intervaloException implements r {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Integer vetor[] = {2, 3, 4, 5};
		int ad;
		System.out.println("Endereco do vetor: ");
		ad = in.nextInt();
		try {
			somaVet(vetor, ad);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Endereco invalido");
		}catch(EmptyStackException e) {
			System.out.println("Vetor vazio");
		}
	}
	public static void somaVet(Integer vetor[], int ad) throws ArrayIndexOutOfBoundsException, EmptyStackException{
		if(vetor.length < ad) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int i = 0;
		while(i <= vetor.length) {
			if(vetor[i] == 0) i++;
			else throw new EmptyStackException();
		}
		for(i = 0; i <= vetor.length; i++){
			int soma = 0;
			if(vetor[i] != 0) {
				System.out.println(vetor[i]);
				soma += vetor[i];
				System.out.println(soma);
			}
		}
	}
}
