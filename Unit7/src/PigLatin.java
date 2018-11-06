import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// Convert entered text into pig latin
		Scanner input = new Scanner(System.in);
		char letter;
		final String VOWELS = "AEIOUYaeiouy";  //String of vowels to compare against
		System.out.print("Enter a word to convert to pig latin>>  ");
		StringBuilder original = new StringBuilder(input.nextLine());
		String copy = original.toString();  //save the entered string for printing later
		if("Yy".indexOf(original.charAt(0)) == 1) { //check for Y as first letters, handles this as a special case
			letter = original.charAt(0);
			original.deleteCharAt(0);
			original.append(letter);
		}
			while(VOWELS.indexOf(original.charAt(0)) == -1) //make sure first letter isn't a vowel
			{
				//this is removing the first letter of the string as it goes and moving it to the end, we don't need a counter since we're only worried about string index 0.  I think this saved a bit of code
				letter = original.charAt(0); //temporary save first letter
				original.deleteCharAt(0); //remove first letter
				original.append(letter); //add first letter to the end
			}
		original.append("ay"); //add ay to end
		System.out.println(copy + " is " + original + " in pig latin");	
	}
}
