public class News extends Post{
	private String source;
	public News(String title, String content, String source){
		super(title, content);
		this.source = source;
	}
	protected String show(){
		String rtr = super.show()+"\nFonte: "+this.source+"\n";
		return rtr;
	}
}