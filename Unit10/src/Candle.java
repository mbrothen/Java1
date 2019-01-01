
public class Candle {
	private String color;
	protected double height;
	protected double price;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
		this.price = height * 2.00;
	}
	
	public double getPrice() {
		return this.price;
	}
}