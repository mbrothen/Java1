/*********************************************
 * 
 * @author Matt Brothen
 *
 *Java Programming 1
 *
 *Date 11/10/18
 *
 *Calculates the total wins for a horse race
 *
 *Asks user for number of horses and number of races
 *
 *Displays results for individual horses or all horses based on user input
 *
 *********************************************/
public class HorseRace {
	

	public static void main(String[] args) {
		int horseChoice = 0;
		int[][] currentRace = RaceTable.generateTable();  // call the generate table method to create the horse race table array
		
		RaceTable.displayRace(currentRace);  // Display the results of the array with the displayRace method
		
		horseChoice = RaceTable.displayMenu();  // Display the menu to and get user input
		
		RaceTable.getResults(horseChoice, currentRace);  //  Get the results based on user menu selection 
	}


}
