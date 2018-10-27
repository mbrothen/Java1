
public class SandwichFilling {
	private String fillingType;
	private double calPerServing;
	public SandwichFilling() {  //constructors
		this.fillingType = "";
		this.calPerServing = 0;
	}
	public SandwichFilling(String fill) {
		this.fillingType = fill;
	}
	public SandwichFilling(double cals) {
		this.calPerServing = cals;
	}
	public SandwichFilling(String fill, double cals) {
		this.fillingType = fill;
		this.calPerServing = cals;
	}
	public String getFillingType() {  //getters and setters
		return fillingType;
	}
	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}
	public double getCalPerServing() {
		return calPerServing;
	}
	public void setCalPerServing(double calPerServing) {
		this.calPerServing = calPerServing;
	}
	
}
