import java.util.*;
public class StringSort2 {

	public static void main(String[] args) {
		String[] people = new String[20];
		getPeople(people);
		Arrays.sort(people);		
		display(people);
	}
	public static void display(String[] people)
	{
		int i;
		System.out.println("Your coworkers in alphabetical order: ");
		for(i = 0; i < people.length; ++i) {
			System.out.println("Person #" + (i+1) + " " + people[i]);
		}
	}
	public static void getPeople(String[] people) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 20 people at work >> ");
		while(i<people.length) {
			System.out.print("Person #" + (i+1) + ":  ");
			people[i] = input.nextLine();
			++i;
		}
	}
}
