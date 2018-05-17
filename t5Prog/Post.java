import java.util.*;
public class Post{
	protected String title;
	protected Date date;
	protected String content;
	protected int likes;
	protected int dislikes;
	public Post(String title, String content){
		date = new Date();
		this.title = title;
		this.content = content;
		this.likes = 0;
		this.dislikes = 0;
	}
	public Post(){}

	protected String getTitle(){
		return this.title;
	}

	protected String show(){
		String rtr = "Titulo: "+this.title+"\nData: "+this.date+"\nConteudo: "+this.content+"\nLikes: "+this.likes+"\n";
		return rtr;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setContent(String content){
		this.content = content;
	}
	protected String setLike(Boolean like){
		this.likes++;
		return "Liked!\n";
	}
	protected String setDislike(Boolean dislike){
		this.dislikes--;
		return "Disliked!\n";
	}
}