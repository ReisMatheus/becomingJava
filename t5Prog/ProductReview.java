public class ProductReview extends Post implements Evaluable{
	private String brand;
	private int stars;
	public ProductReview(String title, String content, String brand, int stars){
		super(title, content);
		this.brand = brand;
		this.stars = stars;
	}
	public ProductReview(){}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void evaluate(int value){
		this.stars = value;
	}
	public String show(){
		String rtr = super.show()+"Brand: "+this.brand+"\nEstrelas: "+this.stars+"\n";
		return rtr;
	}
}