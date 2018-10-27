import java.util.Scanner;
public class ArithmeticDemo2 {
	public static void main(String[] args)
	{
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextDouble();
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextDouble();
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
	}
}
