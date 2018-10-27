import java.util.Scanner;

public class InchesToFeetInteractive {
	public static void main(String[] args) 
	{
		int inches;
		Scanner input = new Scanner(System.in); //input object
		System.out.print("Please enter a length in inches >> ");
		inches = input.nextInt();
		int feet = inches / 12;
		int remainder = inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches.");
		input.close();
	}
}	
