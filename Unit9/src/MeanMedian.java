import java.util.*;
public class MeanMedian {

	public static void main(String[] args) {
		int[] someNums = new int[5];
		Scanner keyboard = new Scanner(System.in);
		int a;
		for(a = 0; a < someNums.length; ++a)
		{
			System.out.print("Enter number " + (a+1) + " >> ");
			someNums[a] = keyboard.nextInt();
		}
		display(someNums, a);
		System.out.println("The mean is: " + mean(someNums));
		System.out.println("The median is: " + median(someNums));
	}
	
	public static int mean(int[] numbers) {
		//total all values and divide by number of values to get mean
		int total = 0;
		for(int i = 0; i < numbers.length; ++i) {
			total = total + numbers[i];
		}
		return total / numbers.length;
	}
	public static int median(int[] numbers) {
		//Sort the numbers with insertion
		int a, b, temp;
		a = 1;
		while(a < numbers.length){
			temp = numbers[a];
			b = a-1;
			while(b >= 0 && numbers[b] > temp) {
				numbers[b+1] = numbers[b];
				--b;
			}
			numbers[b+1] = temp;
			++a;
		}
		return numbers[((numbers.length -1)/2)];  //return value in the median position
		
	}
	public static void display(int[] someNums, int a)
	{
		System.out.print("Numbers: " + a + ": ");
		for(int x = 0; x < someNums.length; ++x)
			System.out.print(someNums[x] + " ");
		System.out.println();
	}
}
