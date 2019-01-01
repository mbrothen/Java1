import java.util.*;
public class StringSort {

	public static void main(String[] args) {
		String[] catFacts = CatFacts.facts();
		Arrays.sort(catFacts);		
		display(catFacts);
	}
	public static void display(String[] catFacts)
	{
		int i;
		for(i = 0; i < catFacts.length; ++i) {
			System.out.println(catFacts[i]);
		}
	}
}
