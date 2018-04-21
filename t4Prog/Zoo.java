import java.util.*;
import javax.swing.*;

public class Zoo{
	public void zooRun(){
		ArrayList<Peixe> peixes = new ArrayList<Peixe>();
		ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();

		Peixe tubarao = new Peixe("Tubarao", "Cinzento", "Mar", 300, 1.5, "Barbatanas e Cauda", 0);
		peixes.add(tubarao);
		Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Terra", 150, 2.0, "Vegetais", 4);
		mamiferos.add(camelo);
		Mamifero urso = new Mamifero("Urso-do-Canada", "Vermelha", "Terra", 180, 0.5, "Mel", 4);
		mamiferos.add(urso);

		int control = 1;
		while(control!=0){
			try{
				String n1Str = JOptionPane.showInputDialog(null, "(1) Para ver dados de todos os animais\n(2) Para alterar nome do animal\n(3) Para alterar a cor do animal\n(0) Para Sair\n",
				 											"ZOO", JOptionPane.PLAIN_MESSAGE);
				int opt = Integer.parseInt(n1Str);
				switch(opt){
					case 1:{
						Iterator<Peixe> itrPeixe = peixes.iterator();
						Iterator<Mamifero> itrMamifero = mamiferos.iterator();
						while(itrPeixe.hasNext() || itrMamifero.hasNext()){
							if(itrPeixe.hasNext()){
								JOptionPane.showMessageDialog(null, itrPeixe.next().getDados(), "PEIXES", JOptionPane.PLAIN_MESSAGE);
							}
							if(itrMamifero.hasNext()){
								JOptionPane.showMessageDialog(null, itrMamifero.next().getDados(), "MAMIFERO", JOptionPane.PLAIN_MESSAGE);
							}
						}
						break;
					}
					case 2:{
						ListIterator<Peixe> itrPeixe = peixes.listIterator();
						ListIterator<Mamifero> itrMamifero = mamiferos.listIterator();
						String nome = JOptionPane.showInputDialog(null, "Digite o nome do animal\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
						if(itrPeixe.next().getNome().equals(nome)){
							String nomePeixes = JOptionPane.showInputDialog(null, "Digite o NOVO nome do "+nome+"\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrPeixe.previous().setNome(nomePeixes), "PEIXES", JOptionPane.PLAIN_MESSAGE);
							break;
						}
						if(itrMamifero.next().getNome().equals(nome)){
							String nomeMamiferos = JOptionPane.showInputDialog(null, "Digite o NOVO nome do "+nome+"\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrMamifero.previous().setNome(nomeMamiferos), "MAMIFERO", JOptionPane.PLAIN_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Animal nao encontrado\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
						}
						break;
					}
					case 3:{
						ListIterator<Peixe> itrPeixe = peixes.listIterator();
						ListIterator<Mamifero> itrMamifero = mamiferos.listIterator();
						String nome = JOptionPane.showInputDialog(null, "Digite o nome do animal\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
						if(itrPeixe.next().getNome().equals(nome)){
							String corPeixe = JOptionPane.showInputDialog(null, "Digite a NOVA cor do "+nome+"\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrPeixe.previous().setCor(corPeixe), "PEIXES", JOptionPane.PLAIN_MESSAGE);					
							break;
						}
						if(itrMamifero.next().getNome().equals(nome)){
							String corMamifero = JOptionPane.showInputDialog(null, "Digite a NOVA cor do "+nome+"\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrMamifero.previous().setCor(corMamifero), "MAMIFERO", JOptionPane.PLAIN_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Animal nao encontrado\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
						}
						break;
					}
					case 0:{
						control = 0;
						break;
					}
				}
			}
			catch(Exception e){
				continue;
			}
		}
	}
}