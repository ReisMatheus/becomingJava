import javax.swing.*;
import java.util.*;

public class Blog{
	List<Post> newPost = new ArrayList<>();
	ListIterator<Post> itrPst = newPost.listIterator();
	/*JOptionPane janela = new JOptionPane();
	ImageIcon likeIcon = new ImageIcon("up.png");
	ImageIcon dislikeIcon = new ImageIcon("down.png");
	JButton likeBt = new JButton("Like", likeIcon);
	JButton dislikeBt = new JButton("Dislike", dislikeIcon);*/

	public void run(){
		int out = 1;
		while(out != 0){
			try{
				String menu = "BLOG: O que voce quer fazer?\n\n1 - Novo Post de noticia\n2 - Nova Resenha de produto\n3 - Novo Post de assuntos diversos\n4 - Listar todas as postagens\n5 - Curtir uma postagem\n6 - Nao curtir uma postagem\n0 - Sair\nEscolha a opcao: ";
				String optStr = JOptionPane.showInputDialog(null, menu, "BLOG", JOptionPane.PLAIN_MESSAGE);
				int opt = Integer.parseInt(optStr);
				switch(opt){
					case 1:{
						Post news = new News();
						readData(news);
						break;
					}
					case 2:{
						Post productRw = new ProductReview();
						readData(productRw);
						break;
					}
					case 3:{
						Post post = new Post();
						readData(post);
						break;
					}
					case 4:{
						showData();
						break;
					}
					case 5:{
						while(itrPst.hasNext()){ 
							Post aux = itrPst.next();
							JOptionPane.showMessageDialog(null, itrPst.nextIndex() + aux.getTitle(), "BLOG", JOptionPane.PLAIN_MESSAGE);
						}
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

	public void readData(Post p){
		if(p instanceof News){
			News news = (News) p; //DOWNCAST
			String title = JOptionPane.showInputDialog(null, "Titulo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String content = JOptionPane.showInputDialog(null, "Conteudo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String source = JOptionPane.showInputDialog(null, "Fonte:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			news.setTitle(title);
			news.setContent(content);
			news.setSource(source);
			newPost.add(p);
			JOptionPane.showMessageDialog(null, "Noticia criada com Sucesso!\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
		}
		if(p instanceof ProductReview){
			ProductReview prvW = (ProductReview) p; //DOWNCAST
			String title = JOptionPane.showInputDialog(null, "Titulo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String content = JOptionPane.showInputDialog(null, "Conteudo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String brand = JOptionPane.showInputDialog(null, "Brand:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String stars = JOptionPane.showInputDialog(null, "Stars:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			int starsInt = Integer.parseInt(stars);
			while(starsInt > 10 || starsInt < 0){
				JOptionPane.showMessageDialog(null, "Digite uma nota valida\n ", "BLOG", JOptionPane.PLAIN_MESSAGE);
				stars = JOptionPane.showInputDialog(null, "Stars:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
				starsInt = Integer.parseInt(stars);
			}
			prvW.setTitle(title);
			prvW.setContent(content);
			prvW.setBrand(brand);
			prvW.evaluate(starsInt);
			newPost.add(prvW);
			JOptionPane.showMessageDialog(null, "Avaliacao de Produto criada com Sucesso!\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
		}
		if(!(p instanceof ProductReview) && !(p instanceof News)){
			String title = JOptionPane.showInputDialog(null, "Titulo:\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			String content = JOptionPane.showInputDialog(null, "Conteudo\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
			p.setTitle(title);
			p.setContent(content);
			newPost.add(p);
			JOptionPane.showMessageDialog(null, "Post criado com Sucesso!\n", "BLOG", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public void showData(){
		while(itrPst.hasNext()){
			Post aux = itrPst.next();
			if(aux instanceof News){
				JOptionPane.showMessageDialog(null, aux.show(), "NEWS", JOptionPane.PLAIN_MESSAGE);
			}
			if(aux instanceof ProductReview){
				JOptionPane.showMessageDialog(null, aux.show(), "PRODUCT-REVIEW", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
}