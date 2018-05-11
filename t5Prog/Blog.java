import javax.swing.*;
import java.util.*;

public class Blog{
	public static void main(String[] args){
		List<Post> newPost = new ArrayList<Post>();
		int out = 1;
		while(out != 0){
			try{
				String menu = "BLOG: O que voce quer fazer?\n\n1 - Novo Post de noticia\n2 - Nova Resenha de produto\n3 - Novo Post de assuntos diversos\n4 - Listar todas as postagens\n5 - Curtir uma postagem\n6 - Nao curtir uma postagem\n0 - Sair\nEscolha a opcao: ";
				String optStr = JOptionPane.showInputDialog(null, menu, "BLOG", JOptionPane.PLAIN_MESSAGE);
				int opt = Integer.parseInt(optStr);
				switch(opt){
					case 1:{
						String title = JOptionPane.showInputDialog(null, "Titulo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
						String content =JOptionPane.showInputDialog(null, "Conteudo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
						String source =JOptionPane.showInputDialog(null, "Fonte:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
						Post pst = new News(title, content, source);
						readData(pst, newPost);
						break;
					}
					case 4:{
						showData(newPost);
						break;
					}
					case 0:{
						out = 0;
						break;
					}
					default:{
						JOptionPane.showMessageDialog(null, "Opcao invalida\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
						break;
					}
				}
			}
			catch(Exception e){
				continue;
			}
		}
	}
	public static void readData(Post p, List<Post> newPost){
		newPost.add(p);
		if(p instanceof News)
			JOptionPane.showMessageDialog(null, "Noticia criada com Sucesso:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
		if(p instanceof ProductReview)
			JOptionPane.showMessageDialog(null, "Avaliacao de Produto criada com Sucesso:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
	}
	public static void showData(List<Post> newPost){
		ListIterator<Post> itrPst = newPost.listIterator();
		while(itrPst.hasNext() && itrPst.next() instanceof News){
			JOptionPane.showMessageDialog(null, itrPst.previous().show(), "NEWS", JOptionPane.PLAIN_MESSAGE);
			itrPst.next();
		}
		while(itrPst.hasNext() && itrPst.next() instanceof ProductReview){
			JOptionPane.showMessageDialog(null, itrPst.previous().show(), "PRODUCT-REVIEW", JOptionPane.PLAIN_MESSAGE);
			itrPst.next();
		}
	}
}