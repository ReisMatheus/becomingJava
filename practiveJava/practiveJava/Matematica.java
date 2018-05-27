package practiveJava;
import java.io.*;

public class Matematica{
	private float num1;
	private float num2;
	public Matematica() {};
	public void setnum1(float num1) throws ArithmeticException{	
		if(num1 == 0) throw new ArithmeticException();
		this.num1 = num1;
	}
	public void setnum2(float num2) throws ArithmeticException{
		if(num2 == 0) throw new ArithmeticException();
		this.num2 = num2;
	}
	public String getMult() throws IOException{
		String rtr = "Multilplicacao: " + this.num1*this.num2;
		if(this.num1*this.num2 == 0) throw new IOException();
		return rtr;
	}
	public String getDiv() throws IOException{
		String rtr = "Divisao: " + this.num1/this.num2;
		if(this.num1/this.num2 == 0) throw new IOException();
		return rtr;
	}
	public String getSum() throws IOException{
		String rtr = "Soma: " + (this.num1+this.num2);
		if(this.num1+this.num2 == 0) throw new IOException();
		return rtr;
	}
	public String getSub() throws IOException{
		String rtr = "Subtracao: " + (this.num1-this.num2);
		if(this.num1-this.num2 == 0) throw new IOException();
		return rtr;
	}
}