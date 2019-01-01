import java.util.Scanner;

/*******************
 * 
1.	Let the user select a player to update
2.	Change player’s name
3.	Change player’s jersey number - must be unique. Two or more players can’t have the same jersey in the same team
4.	Change player’s position - must meet the requirements (check the table above)
5.	Change player’s age
6.	Change player’s weight
7.	Change player’s height

 *
 *******************/

public class Player {
	Scanner keyboard = new Scanner(System.in);
	boolean validPlayerName = false, validJerseyNumber = false, validPlayerAge = false, validPlayerHeight = false, validPlayerWeight = false;;
	boolean validInput = false;
	String playerPosition, playerName;
	int playerJerseyNumber, playerAge, playerHeight, playerWeight;
	
	final static String PLAYER_INFO_ERROR = "Invalid entry: ";
	
	String[] defaultPlayers = {"Brett Favre", "Tom Tomerson", "Steve Irwin", "Jeffery Dahmer", "Abraham Lincoln", "God"};
	int[] defaultJersey = {4, 5, 99, 3, 0, 666};
	int[] defaultAge = {29, 56, 50, 36, 209, 999};
	int[] defaultHeight = {72, 71, 69, 69, 74, 999};
	int[] defaultWeight = {190, 250, 210, 170, 165, 999};
	
	
	Player(String position){
		//Sets position for current player then calls info input to get rest of information
		this.playerPosition = position;
		playerInformationInput();
	}
	
public void playerInformationInput() { 
	//On creating team, pass positions to get each players information from the user.
	String name="";
	int jerseyNumber = 0, age = 0, height = 0, weight = 0;
	while(!validPlayerName) {
		try {
			System.out.println("Enter the " + this.playerPosition + "'s name: ");
			name = keyboard.nextLine();
			validPlayerName= true;
			}
		catch (Exception e){
			PlayFootball.errorProcess(PLAYER_INFO_ERROR + " Player Name");
		}
	}
	while(!validJerseyNumber) {
		try {
			System.out.println("Enter the " + this.playerPosition + "'s jersey number: ");
			jerseyNumber = keyboard.nextInt();
			validJerseyNumber = true;
		}
		catch (Exception e){
			PlayFootball.errorProcess(PLAYER_INFO_ERROR + " jersey number");
			keyboard.nextLine();
		}	
	}
	while(!validPlayerAge) {
		try {
			System.out.println("Enter the " + this.playerPosition + "'s age: ");
			age = keyboard.nextInt();
			validPlayerAge = true;
		}
		catch (Exception e){
			PlayFootball.errorProcess(PLAYER_INFO_ERROR + " Player Age");
			keyboard.nextLine();
		}
	}
	while(!validPlayerHeight) {
		try {
			System.out.println("Enter the " + this.playerPosition + "'s height: ");
			height = keyboard.nextInt();
			validPlayerHeight = true;
			}
		catch (Exception e){
			PlayFootball.errorProcess(PLAYER_INFO_ERROR + " Player height");
			keyboard.nextLine();
		}
	}
	while(!validPlayerWeight) {
		try {
			System.out.println("Enter the " + this.playerPosition + "'s weight: ");
			weight = keyboard.nextInt();
			validPlayerWeight = true;
			}
		catch (Exception e){
			PlayFootball.errorProcess(PLAYER_INFO_ERROR + " Player weight");
			keyboard.nextLine();
		}
	}
	setPlayerInfo(name, jerseyNumber, age, height, weight);
}

	public void setPlayerInfo(String name, int jerseyNumber, int age, int height, int weight) {
		//sets the player info based on user input
		this.playerName = name;
		this.playerJerseyNumber = jerseyNumber;
		this.playerAge = age;
		this.playerHeight = height;
		this.playerWeight = weight;

	}
	Player(String position, int currentPlayerNumber) {
		//used to set the default players to team.
		//Default values are stored in defaultValue arrays in the player class
		this.playerPosition = position;
		this.playerName = defaultPlayers[currentPlayerNumber];
		this.playerJerseyNumber = defaultJersey[currentPlayerNumber];
		this.playerAge = defaultAge[currentPlayerNumber];
		this.playerHeight = defaultHeight[currentPlayerNumber];
		this.playerWeight = defaultWeight[currentPlayerNumber];
	}
	public void setJerseyNumber() {
		//Sets jersey number after verifying it is not the same as another team members
		validInput = false;
		while(!validInput) {
			try {
				System.out.println("Enter a valid jersey number, numbers can only be used once: ");
				this.playerJerseyNumber = keyboard.nextInt();
				validInput = true;
			}
			catch(Exception e) {
				PlayFootball.errorProcess(PLAYER_INFO_ERROR);
			}
		}
			
	}
	//**********Getters*********
	public String getPlayerPosition() {
		return playerPosition;
	}
	public String getPlayerName() {
		return playerName;
	}
	public int getJerseyNumber() {
		return playerJerseyNumber;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public int getPlayerHeight() {
		return playerHeight;
	}
	public int getPlayerWeight() {
		return playerWeight;
	}
}
