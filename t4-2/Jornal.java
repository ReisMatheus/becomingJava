import java.util.*;
import javax.swing.*;

public class Jornal{
	public static void main(String[] args){
		List<PublicacaoSemanal> publicacoesSemanais = new ArrayList<PublicacaoSemanal>();

		String nomeJornal = JOptionPane.showInputDialog(null, "Digite o nome do Jornal\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
		String precoExemplar = JOptionPane.showInputDialog(null, "Digite o preco do exemplar\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
		String taxaEntrega = JOptionPane.showInputDialog(null, "Digite a taxa de entrega\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
		String nomeEditora = JOptionPane.showInputDialog(null, "Digite o nome da Editora\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
		String cnpjEditora = JOptionPane.showInputDialog(null, "Digite o CNPJ da Editora\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
		Double dbPrecoExemplar = Double.parseDouble(precoExemplar);
		PublicacaoSemanal pbs1 = new publicacoesSemanais(nomeJornal, dbPrecoExemplar);
		pbs1.setEditora("Times", 4455669977);
		publicacoesSemanais.add(pbs1);

		int control = 1;
		while(control!=0){
			try{
				String n1Str = JOptionPane.showInputDialog(null, "(1) Para ver dados do Periodico Semana\n(2) Para alterar dados da Publicacao\n(0) Para Sair\n",
				 											"JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
				int opt = Integer.parseInt(n1Str);
				switch(opt){
					case 1:{
						Iterator<PublicacaoSemanal> itrPbSemanal = publicacoesSemanais.iterator();
						while(itrPbSemanal.hasNext()){
							if(itrPbSemanal.hasNext()){
								JOptionPane.showMessageDialog(null, itrPbSemanal.next().getDados(), "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
								//System.out.println(itrPeixe.next().getDados());
							}
						}
						break;
					}
					case 2:{
						ListIterator<PublicacaoSemanal> itrPbSemanal = publicacoesSemanais.listIterator();
						String nomeJornal = JOptionPane.showInputDialog(null, "Digite o nome do Jornal\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
						if(itrPbSemanal.next().getNome().equals(nomeJornal)){
							String nomeAlterado = JOptionPane.showInputDialog(null, "Digite o NOVO nome do "+nomeJornal+"\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrPbSemanal.previous().setNome(nomeAlterado), "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Animal nao encontrado\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
						}
						break;
					}/*
					case 3:{
						ListIterator<PublicacaoSemanal> itrPeixe = PublicacaoSemanal.listIterator();
						String nome = JOptionPane.showInputDialog(null, "Digite o nome do animal\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
						if(itrPeixe.next().getNome().equals(nome)){
							String corPeixe = JOptionPane.showInputDialog(null, "Digite a NOVA cor do "+nome+"\n", "ZOO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrPeixe.previous().setCor(corPeixe), "PEIXES", JOptionPane.PLAIN_MESSAGE);					
							break;
						}
						break;
					}*/
					case 0:{
						control = 0;
						break;
					}
				}
				//JOptionPane.showMessageDialog(null, opt, "Bem vindo ao ZOO", JOptionPane.PLAIN_MESSAGE);
			}
			catch(Exception e){
				continue;
			}
		}
	}
}
