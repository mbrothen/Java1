import java.util.*;
public class PlayFootball {
	/**************************************************************
	 * Created by: Matt Brothen
	 * Java Programming 1
	 * Fal1 2018
	 * Gateway Technical College
	 * 
	 *                      Football Team Creator
	 * User creates a team>Selects Side> Sets Name, Owner, Coach then Players
	 * Plays round of 5 games at a time.  Wins Loss Tie are determined by random number
	 * Team information can be changed; Name, Owner, Coach
	 * Player information can be changed per position
	 *
	 */
	final static String MENU_HEADER = "      --FOOTBALL SIMULATOR--";
	final static String DIVIDER =     "----------------------------------";
	//******* Error messages ********
	final static String MENU_ERROR = "Invalid Menu Selection, choose 1-6";
	final static String SIDE_ERROR = "Invalid side selection";
	final static String STRING_ERROR = "Invalid entry ";
	//*******************************
	static Scanner keyboard = new Scanner(System.in);
	private static Team currentTeam;
	static Player[] currentRoster;
	public static void main(String[] args) {
		//Main Game loop, calls display menu and gets menu choice
		int menuSelection = 0;
			do{;
				showMenu();
				try {
					menuSelection = keyboard.nextInt();
					clearScreen();
				}
				catch(Exception e) {
					errorProcess(MENU_ERROR);
					keyboard.nextLine();
					pauseScreen();
				}
			}while (processMenuChoice(menuSelection));
	}
	public static boolean processMenuChoice(int menuChoice) {
		//Get main menu selection, call appropriate functions
		switch (menuChoice) {
		case 1:
			playGame();
			break;
		case 2:
			createTeam();
			break;
		case 3:
			updateTeam();
			break;
		case 4:
			updatePlayers();
			break;
		case 5:
			displayStats();
			break;
		case 6:
			processExit();
			break;			
		}
		return true;
	}
	private static void updatePlayers() {
		// Allows user to select a position to update the player info
		if(checkTeamCreated()) {
			int playerInput = 0;
			displayPlayers();
			while(playerInput <= 0 || playerInput > currentRoster.length) {
				System.out.println("Select a player to update (1-" + currentRoster.length + "): ");
				playerInput = keyboard.nextInt();
			}
			currentTeam.removeJerseyNumber(currentRoster[playerInput-1].getJerseyNumber());
			currentTeam.setTeamMember((playerInput-1), currentRoster[playerInput-1].getPlayerPosition());
			
		}
	}
	public static void playGame() {
		//Runs a round of games NUMBER_GAMES times
		final int NUMBER_GAMES = 5;
		System.out.println("---Kick off time---");
		if (checkTeamCreated()) {
			int results;
			for(int i = 1; i<=NUMBER_GAMES; i++) {
				System.out.println("Game " + i + " of " + NUMBER_GAMES);
				results = getRandom();
				processGameResults(results);
			}
		}
	}
	public static void processGameResults(int results) {
		//Get the results of each game, display message and standings for current round
		switch(results) {
		case 0:
			System.out.println("An unlikely tie");
			break;
		case 1:
			System.out.println("Decisive victory on the gridiron!!");
			break;
		case 2:
			System.out.println("You were soundly defeated.  Better luck next time");
			break;
		}
		currentTeam.setResults(results);
		int[] currentStanding = currentTeam.getResults();
		System.out.println(currentStanding[1] + " Wins " + currentStanding[2] + " Loses " + currentStanding[0] + " Ties ");
		pauseScreen();
	}
	private static void pauseScreen() {
		//Holds the program until enter is pressed
		System.out.println("Press enter to continue....");
		keyboard.nextLine();
	}
	public static void createTeam() {
		//Allows user to create an offensive or defensive team, also gives option for a default team with filled in data
		int side = 0;
		String teamName, owner, headCoach;
		boolean valid = true;
		System.out.println("----Choose your side----");
		System.out.println("1: for Offense");
		System.out.println("2: for Defense");
		System.out.println("3: for the default team");
		System.out.println(" >>  ");
		while(side != 1 && side != 2 && side !=3) {
			try {
				side = keyboard.nextInt();
				clearScreen();
			}
			catch(Exception e) {
				errorProcess(SIDE_ERROR);
			}
		}
		if (side == 3) {
			currentTeam = new Team();
			if(checkTeamCreated()) {
				keyboard.nextLine();
				System.out.println("Default team created!!!");
				pauseScreen();
			}
		} else{
			do {
				try {
					System.out.println("Enter your Team Name: ");
					teamName = keyboard.next();
					System.out.println("Enter the name of the owner: ");
					owner = keyboard.next();
					System.out.println("Enter the name of your head coach: ");
					headCoach = keyboard.next();
					clearScreen();
					currentTeam = new Team(side(1), teamName, owner, headCoach);
					valid = true;
				}
				catch(Exception e){
					errorProcess(STRING_ERROR);
					valid = false;
				}
			}while(!valid);
		}
		
	}
	public static String side(int side) {
		//Returns string of team side to use in team constructor 
		if (side == 1) {
			return "Offense";			
		} else {
			return "Defense";
		} 
	}
	public static void updateTeam() {
		if(checkTeamCreated()) {
			//Allows the user to update Team name, Owner and Coach
			System.out.println("Enter a new team name: ");
			currentTeam.setTeamName(keyboard.nextLine());
			System.out.println("Enter a new owner for your team: ");
			currentTeam.setOwner(keyboard.nextLine());
			System.out.println("Enter a new head coach: ");
			currentTeam.setHeadCoach(keyboard.nextLine());
			System.out.println("Your team has been updated: \n Play Ball!");
		}
	}
	public static void displayStats() {
		//Displays information from the team object
		if(checkTeamCreated()) {
			int[] results = currentTeam.getResults();
			System.out.println("------------------------------------------------------------");
			System.out.println("                       TEAM STANDING                        ");
			System.out.println("                       "+currentTeam.getTeamName());
			System.out.println("Owner: " + currentTeam.getOwner() + "       Coach: " + currentTeam.getHeadCoach());
			System.out.println("------------------------------------------------------------");
			System.out.println("                          RECORD");
			System.out.println("                Wins: " + results[1] + " Losses: " + results[2] + " Ties: " + results[0] + "\n");
			displayPlayers();
			pauseScreen();
		}
	}
	public static void displayPlayers() {
		//Displays all the players on the team and their info in a table
		currentRoster = currentTeam.getTeamMembers();
		final int MAX_NAME_LENGTH = 28;
		String currentPosition, currentPlayerName;
		int numberOfPlayers = currentRoster.length;
		for(int i = 0; i < numberOfPlayers; i++) {
			currentPosition = currentRoster[i].getPlayerPosition();
			currentPlayerName = currentRoster[i].getPlayerName();
			System.out.print((i+1) + ": " + currentPosition + ": " + currentPlayerName);
			for (int j = 0; j < (MAX_NAME_LENGTH - (currentPosition.length() + currentPlayerName.length())); j++){
					System.out.print(" ");
			}
			System.out.print("\tNumber: " + currentRoster[i].getJerseyNumber() + "\tAge: " + currentRoster[i].getPlayerAge() + " \tHeight: " + currentRoster[i].getPlayerHeight() + "inches\tWeight: " + currentRoster[i].getPlayerWeight() + "lbs\n");	
		}
	}
	public static void processExit() {
		//verify user wants to exit if N returns to main menu, if Y terminates program
		char yn = ' ';
		String temp;
		while(yn != 'y' && yn != 'n') {
			System.out.println("Do you want to exit \"Y/N\"");
			temp = keyboard.nextLine();
			yn = temp.toLowerCase().charAt(0);
		}	
		if (yn == 'y') {
			System.out.println("Thanks for playing!");
			keyboard.close();
			System.exit(0);
		}

	}
	static void errorProcess(String errorCode) {
		//Display error message
		System.out.println(errorCode);
	}
	public static void showMenu() {
		//Display the main menu
		clearScreen();
		System.out.println(MENU_HEADER);
		System.out.println(DIVIDER);
		System.out.println("--------------MENU----------------");
		System.out.println("        1: Play a Game");
		System.out.println("        2: Create a team");
		System.out.println("        3: Update team");
		System.out.println("        4: Update players");
		System.out.println("        5: Display team stats");
		System.out.println("        6: Quit");
		System.out.println("        Choose 1 - 6: ");
	}
	static void clearScreen() {
		//Draws blank lines to clear screen.  Keeps new output at the bottom of the screen to remain consistant 
		for(int i = 1; i < 50; i++) {
			System.out.println("\r\n");

		}	    
	}
	public static boolean checkTeamCreated() {
		//verifies if the team object was created to stop calling functions that require a team to be created first
		if (currentTeam == null){
			System.out.println("Please Create Your Team First");
			pauseScreen();
			clearScreen();
			return false;
			
		} else {
			return true;
		}
	}
	public static int getRandom() {
		//generates a random number 0-2 used in determining game results
		   return new Random().nextInt(3);
		}
}
