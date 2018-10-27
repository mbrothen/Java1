import java.time.LocalDate;
import java.util.Scanner;
public class PastPresentFuture2 {
	public static void main(String[] args) {
	int month;
	int day;
	int year;
	String message = null;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter current month number (1-12)");
	month = input.nextInt();
	System.out.println("Enter current day (1-31)");
	day = input.nextInt();
	System.out.println("Enter current year");
	year = input.nextInt();
	LocalDate inputDate= LocalDate.of(year, month, day);
	LocalDate now = LocalDate.now();
	
	if (inputDate.isBefore(now))
		message = "This date is in the past";
	else if (inputDate.isAfter(now))
		message = "This date is in the future";
	else if (inputDate.isEqual(now))
		message = "This is today";
	
	System.out.println(inputDate + " is: " + message);
}
}
