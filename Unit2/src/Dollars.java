import java.util.Scanner;

public class Dollars {
	public static void main(String[] args) 
	{
		int totals;
		Scanner input = new Scanner(System.in); //input object
		System.out.print("Please enter a dollar value >> ");
		totals = input.nextInt();  //get dollar value as an int
		//calculate bills
		int counter = totals;  //working number and keeping the change the same
		int twenties = counter / 20;
		counter = counter % 20;  //get the remainder after subtracting the 20s...
		int tens = counter / 10;
		counter = counter % 10;
		int fives = counter / 5;
		counter = counter % 5;
		int ones = counter;
		//display results
		System.out.println("$" + totals + " is " + twenties + " twenties, " + tens + " tens, " + fives + " fives, " + ones + " ones.");
		input.close();
	}
}	
