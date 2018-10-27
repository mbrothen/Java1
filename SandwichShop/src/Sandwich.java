
public class Sandwich {
	private Bread sandBread;
	private SandwichFilling filling;
	//construct sandwich
	public Sandwich(String bread, double breadCal, String fillingName, double fillingCal) {
		sandBread = new Bread(bread, breadCal);  //create Bread and SandwichFilling objects
		filling = new SandwichFilling(fillingName, fillingCal);
	}
	//getters and setters
	public Bread getSandBread() {
		return sandBread;
	}

	public void setSandBread(Bread sandBread) {
		this.sandBread = sandBread;
	}

	public SandwichFilling getFilling() {
		return filling;
	}

	public void setFilling(SandwichFilling filling) {
		this.filling = filling;
	}
	
	public double getTotCals() {  //calculate total calories in a sandwich. Could have been one line
		double tot = (sandBread.getCaloriesSlice()*2) + filling.getCalPerServing();
		return tot;
	}
	public void display() {  //display bread info 
		String name = sandBread.getBread() + " and " + filling.getFillingType();
		System.out.println("MOTTO:  " + sandBread.getMotto());
		System.out.println("******* " + name + " *******");
		System.out.println("Bread Type:              "+sandBread.getBread());
		System.out.println("Calories per slice:      "+ sandBread.getCaloriesSlice());
		System.out.println("Filling Type:            "+filling.getFillingType());
		System.out.println("Calories per serving:    "+filling.getCalPerServing());
		System.out.println("Total Calories:          "+ this.getTotCals());
		System.out.println("");
		
		
	}
}
