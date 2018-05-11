public class ProductReview extends Post implements Evaluable{
	private String brand;
	private int stars;
	public ProductReview(String brand, String title, String content){
		super(title, content);
		this.brand = brand;
		this.stars = 0;
	}
	public String evaluate(int value){
		String rtr;
		if(value > 10 || value < 0){
			rtr = "Digite uma nota valida\n";
		}
		else{
			this.stars = value;
			rtr = "Nota atribuida com sucesso\n";
		}
		return rtr;
	}
	public String show(){
		String rtr = super.show()+"Brand: "+this.brand+"\nEstrelas: "+this.stars+"\n";
		return rtr;
	}
}