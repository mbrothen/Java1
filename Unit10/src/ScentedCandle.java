
public class ScentedCandle extends Candle {
	private String scent;
	public String getScent() {
		return this.scent;
	}
	
	public void setScent(String scent) {
		this.scent = scent;
	}
	
	@Override
	public void setHeight(double height) {
		super.height = height;
		super.price = height * 3.00;
	}
}