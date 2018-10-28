
public class Perfect {

	public static void main(String[] args) {
		final int LIMIT = 1000;
		int var;
		int number;
		int temp;
		for(number = 1; number <= LIMIT; ++number)
		{
			temp = 0; //reset counter for each number
			for(var = 1; var < number; ++var) { //check all numbers less than current number
				if(number % var == 0)
					temp = temp + var;	//if divisible add total to counter
			}
			if (temp == number) //if counter equals number
				System.out.println(number + " is a perfect number");			
		}
		System.out.println();
	}

}
