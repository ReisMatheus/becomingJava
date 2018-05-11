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
	protected String show(){
		String rtr = "Titulo: "+this.title+"\nData: "+this.date+"\nConteudo: "+this.content+"\nLikes: "+this.likes+"\n";
		return rtr;
	}
	protected String like(Boolean like){
		if(like){
			this.likes++;
			return "Liked!\n";
		}
		else{
			this.dislikes--;
			return "Disliked!\n";
		}
	}
}