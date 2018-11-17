import java.util.Random;
import java.util.*;
public class RaceTable {
	final static String DIVIDER = "-------------------";
	
	static int[][] generateTable() {
		//generates race array table using rand.nextInt number 0-3 to display results
		//1 = first place 2 = second place 3 = third 0 = no place or not compete
	        int [][] table = new int[4][5];
	        Random rand = new Random();
	        int i, j;
	        for(i = 0; i <= 3; ++i) {
	        	for(j = 0; j <= 4; ++j) {
	        		table[i] [j] = rand.nextInt(4-0);
	        	}
	        }	   
	        return table;
}
	static void displayRace(int[][] t){
		//Formats and displays the horse race table
		int i, j;
		final String HEADER =      "Horse Race Results!";
		//final String DIVIDER =     "-------------------";
		final String RACE_NUMBERS = "          1 2 3 4 5";
		final String HORSE =       "HORSE #";
		System.out.println(HEADER);
		System.out.println(DIVIDER);
		System.out.println(RACE_NUMBERS);
		System.out.println(DIVIDER);
		//iterate through array and display rows
		for(i = 1; i< t[0].length; ++i) {
			System.out.print("\n"+HORSE + (i) + "| ");
			for(j = 0; j<=t.length; ++j) {
				System.out.print(t[i-1][j] + " ");
			}
		}
		System.out.println("\n"+DIVIDER);
	}
	static int displayMenu() {
		int horseChoice = 0;
		Scanner input = new Scanner(System.in);
		while (horseChoice <= 0 || horseChoice > 5) {
			System.out.println("Pick a horse # [1, 2, 3, 4] or 5 for all: ");
			horseChoice = input.nextInt();
		}
		return horseChoice;
	}
	static void getResults(int horse, int[][] race) {
		int i, j, first = 0, second = 0, third = 0, none = 0;
		int[] results = new int[4];
		String horseName = "";
		if (horse >= 1 && horse < 5) {  //test if menu was asking for an individual horse
			horseName = " Horse Number " + horse;
			for(i = 0; i<=race.length; ++i) {  //loop through the chosen horse results and total the places
				++results[race[horse-1][i]];  //total results in array, index = result
				}
			} else if (horse == 5) { //calculate the total for all horses by looping through the array, one loop for columns, one for rows
				horseName = " All Horses:";
				for(i = 0; i < race.length; ++i) {
					for(j = 0; j < race[i].length; ++j) {
						++results[race[i][j]];   //total results in array, index = result
					}
				}
		}
		// Display the totals
		System.out.println("Race results for" + horseName);
		System.out.println(DIVIDER);
		System.out.println("First place:      " + results[1]);
		System.out.println("Second place:     " + results[2]);
		System.out.println("Third place:      " + results[3]);
		System.out.println("Did not place:    " + results[0]);
		System.out.println(DIVIDER);
	}
}
