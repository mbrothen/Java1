import java.util.Scanner;
public class EvenEntryLoop {
	public static void main(String[] args) {
	int num = 0;
	final int EXIT = 999;
	String even = "Good Job!";
	String odd = "Error: number not even.";
	
	Scanner input = new Scanner(System.in);
	while(num != EXIT)
	{
		System.out.println("Enter an even number (999 to exit) .... ");
		num = input.nextInt();
		if(num%2 == 0)
			System.out.println(even);
		else if (num == 999)
		{}//grab 999 to not display the odd error message
		else
			System.out.println(odd);
	}
	System.out.println("You entered 999, goodbye");
}
}
