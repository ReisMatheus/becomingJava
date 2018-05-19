import java.util.*;
import java.text.*;

public class Post{
	protected String title;
	protected Date date = new Date();
	protected String content;
	protected int likes;
	protected int dislikes;
	public Post(String title, String content){
		this.title = title;
		this.content = content;
		this.likes = 0;
		this.dislikes = 0;
	}
	private String dateFormatter(){
		this.date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String actualDate = formatter.format(date);
		return actualDate;
	}
	public Post(){}

	protected String getTitle(){
		return this.title;
	}

	protected String show(){
		String rtr = "Titulo: "+this.title+"\nData: "+dateFormatter()+"\nConteudo: "+this.content+"\nLikes: "+this.likes+"\n";
		return rtr;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setContent(String content){
		this.content = content;
	}
	protected void setLike(){
		this.likes++;
	}
	protected String setDislike(Boolean dislike){
		this.dislikes--;
		return "Disliked!\n";
	}
}