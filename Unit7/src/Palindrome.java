import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a phrase to check for palindrome>>  ");
		StringBuilder original = new StringBuilder(input.nextLine());
		StringBuilder clean = new StringBuilder("");
		StringBuilder backwards = new StringBuilder(""); 
		char ch;
		for(i = 0; i<original.length(); i++) { 
			ch = original.charAt(i);
			if (Character.isLetter(ch)) {
				clean.append(ch); //builds a stringbuilder of only letters in the input
			}
		}
		for(i=0; i<clean.length(); i++) { //reverse string
			ch = clean.charAt(i);
			backwards.insert(0, ch);
		}
		if((backwards.toString().toLowerCase()).equals((clean.toString().toLowerCase()))) 
			System.out.println(original + " is a palindrome!");				
		else 
			System.out.println(original + " is not a palindrome :(");		

	}
}
