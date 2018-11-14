/*********************************************
 * 
 * @author Matt
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
public class horseRace {
	

	public static void main(String[] args) {
		int horseChoice = 0;
		int[][] currentRace = raceTable.generateTable();  // call the generate table method to create the horse race table array
		
		raceTable.displayRace(currentRace);  // Display the results of the array with the displayRace method
		
		horseChoice = raceTable.displayMenu();  // Display the menu to and get user input
		
		raceTable.getResults(horseChoice, currentRace);  //  Get the results based on user menu selection 
	}


}
