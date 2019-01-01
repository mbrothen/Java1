/******************************
 * The Team Object
 * Builds Team for use in game
 ******************************/
import java.util.ArrayList;
public class Team {
	String teamName, side, owner, headCoach;
	int gamesPlayed;
	int[] results = new int[3];
	Player teamMembers[] = new Player[6];
	ArrayList<Integer> allJerseyNumbers = new ArrayList<Integer>();
	final String[] OFFENSIVE_POSITIONS = {"Quarterback", "Wide Receiver", "Wide Receiver", "Offensive Guard", "Offensive Guard", "Center"};
	final String[] DEFFENSIVE_POSITIONS = {"Safety", "Cornerback", "Cornerback", "Defensive Tackle", "Defensive Tackle", "Middle Lineback"};


	public Team(String side, String teamName, String owner, String headCoach) {
		//create team object
		this.teamName = teamName;
		this.side = side;
		this.owner = owner;
		this.headCoach = headCoach;
		//call function to setup players depending on side
		if (side == "Offense") {
			setPlayers(1);
		} else {
			setPlayers(2);
		}
	}
	public void setPlayers(int side){
		//builds the players based on the side chosen, 1 for offense, 2 for defense
		//
		System.out.println("--Enter the information for each of your players--");
		String[] positions = {};
		if (side == 1) {
			positions = OFFENSIVE_POSITIONS;
		} else if (side == 2) {
			positions = DEFFENSIVE_POSITIONS;
		}
		//adding positions changes the team size
		for(int i = 0; i < positions.length; i++) {
			// Send the position to the player class to create new player
				System.out.println("--Create your " + positions[i] + " --");
				teamMembers[i] = new Player(positions[i]);
		while(!testJerseyNumber(teamMembers[i].getJerseyNumber(), i)) {
			//if jersey number is not valid get new jersey number until valid
			teamMembers[i].setJerseyNumber();
		}
		}
		
	}
	public boolean testJerseyNumber(int jerseyNumber, int currentPosition) {
		//validates if jersey number of the current player is valid.  Valid numbers are stored in an ArrayList which is checked for the new number, if valid the new number is added.  
		if (allJerseyNumbers.contains(jerseyNumber)) {
			return false;
		} else {			
			//add the jersey number to the list if it is not already in use
			allJerseyNumbers.add(jerseyNumber);
			return true;
		}
	}
	public Team(){
		//Creates the default team 
		this.teamName = "Guys Moving a Ball for 4 Hours";
		this.owner = "Panhandler on 6th Ave";
		this.headCoach = "Vince Lombardi";
		for(int i=0; i < OFFENSIVE_POSITIONS.length; i++) {
			teamMembers[i] = new Player(OFFENSIVE_POSITIONS[i], i);
			while(!testJerseyNumber(teamMembers[i].getJerseyNumber(), i)) {
				teamMembers[i].setJerseyNumber();
			}
		}		
		
	}
	public void removeJerseyNumber(int jerseyNumber) {
		//Deletes jersey number from list once player is changed
		allJerseyNumbers.remove(new Integer(jerseyNumber));

	}
	//*********************
	// Getters and Setters
	//*********************
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public int[] getResults() {
		return results;
	}
	public void setResults(int results) {
		this.results[results] = this.results[results]+1;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public Player[] getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMember(int rosterNumber, String position) {
		//used to update team members in an already created team.  Gets passed the array position of the team member to change and the position and gets new info for that posistion
		teamMembers[rosterNumber] = new Player(position);
		while(!testJerseyNumber(teamMembers[rosterNumber].getJerseyNumber(), rosterNumber)) {
			//if jersey number is not valid get new jersey number until valid
			teamMembers[rosterNumber].setJerseyNumber();
		}
	}
}
