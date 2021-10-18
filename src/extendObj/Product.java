package extendObj;

public class Product {
	private String caption;
	private double price;
	private double dicoundRate;
	private double rating;
	public Product() {
		super();
	}
	public Product(String caption, double price, double dicoundRate) {
		super();
		this.caption = caption;
		this.price = price;
		this.dicoundRate = dicoundRate;
	}
	public Product(String caption, double price, double dicoundRate, double rating) {
		super();
		this.caption = caption;
		this.price = price;
		this.dicoundRate = dicoundRate;
		this.rating = rating;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public double getPrice() {
		return price*(100-this.dicoundRate)/100;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDicoundRate() {
		return dicoundRate;
	}
	public void setDicoundRate(double dicoundRate) {
		this.dicoundRate = dicoundRate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
