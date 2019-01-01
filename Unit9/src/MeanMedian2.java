import java.util.*;
public class MeanMedian2 {

	public static void main(String[] args) {
		ArrayList<Integer> someNums = new ArrayList<Integer>(20);
		Scanner keyboard = new Scanner(System.in);
		int a=1, tempIn;
		System.out.println("Enter up to 20 numbers (999 to exit) >> ");
		
		while(a <= 20 && a != 999)
		{
			System.out.print("Enter number " + (a) + " >> ");
			tempIn = keyboard.nextInt();
			if(tempIn != 999) {
				someNums.add(tempIn);
				++a;
			}
			else
				a = 999;			
		}
		display(someNums);  //display numnbers in regular order
		System.out.println("The mean is: " + mean(someNums));
		System.out.println("The median is: " + median(someNums));
	}
	
	public static float mean(ArrayList<Integer> numbers) {
		//total all values and divide by number of values to get mean
		float total = 0;
		for(int i = 0; i < numbers.size(); ++i) {
			total = total + numbers.get(i);
		}
		return total / numbers.size();
	}
	public static float median(ArrayList<Integer> numbers) {
		//Sort the numbers with insertion
		int a, b, temp;
		a = 1;
		while(a < numbers.size()){
			temp = numbers.get(a);
			b = a-1;
			while(b >= 0 && numbers.get(b) > temp) {
				numbers.set(b+1, numbers.get(b));
				--b;
			}
			numbers.set(b+1, temp);
			++a;
		}
		//get the median for both even and odd numbered lists
		if (numbers.size() % 2 == 0) {
			float num1 = numbers.get(numbers.size()/2);
			float num2 = numbers.get((numbers.size()/2)-1);
			return (num1 + num2)/2;
		}
		else
			return numbers.get((numbers.size() - 1)/2);
		
	}
	public static void display(ArrayList<Integer> someNums)
	{
		System.out.print("Numbers " + someNums.size() + ": ");
		for(int x = 0; x < someNums.size(); ++x)
			System.out.print(someNums.get(x) + " ");
		System.out.println();
	}
}
