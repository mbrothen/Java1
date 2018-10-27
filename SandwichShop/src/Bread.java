
public class Bread {
	private String bread;
	private double caloriesSlice;
	public final static String MOTTO = "The staff of life";
	public Bread() {  //constructors added extra ones for future proofing
		this.bread = "";
		this.caloriesSlice = 0;
	}
	public Bread(String type) {
		this.bread = type;
	}
	public Bread(double cals) {
		this.caloriesSlice = cals;
	}
	public Bread(String type, double cals) {
		this.bread = type;
		this.caloriesSlice = cals;
	}
	//get and set
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public double getCaloriesSlice() {
		return caloriesSlice;
	}
	public void setCaloriesSlice(double caloriesSlice) {
		this.caloriesSlice = caloriesSlice;
	}
	public String getMotto() {
		return MOTTO;
	}
}



