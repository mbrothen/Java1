import java.util.Scanner;
public class CondoSales {
	public static void main(String[] args) {
	int condoChoice;
	int price;
	String condoType;
	final int PARKVIEW = 1;
	final int GOLFVIEW = 2;
	final int LAKEVIEW = 3;
	final int PARKPRICE = 150000;
	final int GOLFPRICE = 170000;
	final int LAKEPRICE = 210000;
	Scanner input = new Scanner(System.in);
	System.out.println("What type of condo?");
	System.out.println("Choose 1 for park view, 2 for golf course view, 3 for lake view");
	condoChoice = input.nextInt();
	switch (condoChoice) {
		case 1:
			condoType = "Park View Condo";
			price = PARKPRICE;
			break;
		case 2:
			condoType = "Golf Course View Condo";
			price = GOLFPRICE;
			break;
		case 3:
			condoType = "Lake View Condo";
			price = LAKEPRICE;
			break;
		default:
			condoType = "PLEASE ENTER VALID CONDO TYPE";
			price = 0;
	}
	System.out.println(condoType + " cost $" + price);
}
}
