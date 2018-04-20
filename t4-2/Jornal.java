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
		int cnpj = Integer.parseInt(cnpjEditora);
		PublicacaoSemanal pbs1 = new PublicacaoSemanal(nomeJornal, dbPrecoExemplar);
		pbs1.setEditora(nomeEditora, cnpj);
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
								JOptionPane.showMessageDialog(null, itrPbSemanal.next().getDadosPbSemanal(), "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
							}
						}
						break;
					}
					case 2:{
						ListIterator<PublicacaoSemanal> itrPbSemanal = publicacoesSemanais.listIterator();
						String nomeCompare = JOptionPane.showInputDialog(null, "Digite o nome do Jornal\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
						if(itrPbSemanal.next().getNome().equals(nomeCompare)){
							String nomeAlterado = JOptionPane.showInputDialog(null, "Digite o NOVO nome do "+nomeCompare+"\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, itrPbSemanal.previous().setNome(nomeAlterado), "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Animal nao encontrado\n", "JORNALEIRO", JOptionPane.PLAIN_MESSAGE);
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
