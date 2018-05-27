package practiveJava;
import java.util.*;
import java.io.*;

public class excecao1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Matematica obj1 = new Matematica();
		System.out.println("Digite o primeiro numero");
		float num1 = in.nextFloat();
		System.out.println("Digite o segundo numero");
		float num2 = in.nextFloat();
		try {
			obj1.setnum1(num1);
			obj1.setnum2(num2);
		} catch(ArithmeticException e) {
			System.out.println("Nao digite 0");
			System.exit(0);
		}
		try {
			System.out.print(obj1.getSub()+"\n");
		}catch(IOException e) {
			System.out.println("Excecao subtracao: Resultado 0");
		}
		try {
			System.out.println(obj1.getSum()+"\n");
		}catch(IOException e) {
			System.out.println("Excecao soma: Resultado 0");
		}
		System.out.println("Fim do programa");
	}
}
