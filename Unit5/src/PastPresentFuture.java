import java.util.Scanner;
public class PastPresentFuture {
	public static void main(String[] args) {
	int month;
	int day;
	int year;
	final int CURRENT_MONTH = 10;
	final int CURRENT_DAY = 21;
	final int CURRENT_YEAR = 2018;
	String message;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter current month number (1-12)");
	month = input.nextInt();
	System.out.println("Enter current day (1-31)");
	day = input.nextInt();
	System.out.println("Enter current year");
	year = input.nextInt();
	if (year != CURRENT_YEAR) {
		if (year > CURRENT_YEAR) 
			message = "Is in a future year";
		else
			message = "Is in the past";}
	else if (month!= CURRENT_MONTH) {
		if (month < CURRENT_MONTH) 
			message = "Previous month this year";
		else
			message = "Later month this year";
		}
	else if (day != CURRENT_DAY) {
		if (day < CURRENT_DAY) 
			message = "Previous day this month";
		else
			message = "Later day this month";
	}
	else
		message = "This is today!";

	System.out.println(month+"/"+day+"/"+year + " is: "+message);
}
}
