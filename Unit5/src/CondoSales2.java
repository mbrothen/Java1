import java.util.Scanner;
public class CondoSales2 {
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
			price = PARKPRICE + getParking();
			break;
		case 2:
			condoType = "Golf Course View Condo";
			price = GOLFPRICE + getParking();
			break;
		case 3:
			condoType = "Lake View Condo";
			price = LAKEPRICE + getParking();
			break;
		default:
			condoType = "PLEASE ENTER VALID CONDO TYPE";
			price = 0;
	}
	System.out.println(condoType + " cost $" + price);
}
	public static int getParking(){
		int parking;
		Scanner input2 = new Scanner(System.in);

		System.out.println("Do you want a garage or parking space?");
		System.out.println("Enter 1 for Garage 2 for parking space...");
		parking = input2.nextInt();
		switch (parking) {
			case 1:
				return(5000);
			case 2:
				return(0);
			default:
				System.out.println("Invalid parking type, parking not added to the cost.  Please restart to add garage price");
				return(0);
		}
	}
}
