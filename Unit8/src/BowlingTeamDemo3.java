import java.util.*;
public class BowlingTeamDemo3 {
	public static void main(String[] args) {
		// Get Bowling Team Rosters
		String name;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		//Get team Names
		for(y = 0; y < NUM_TEAMS; ++y) {
			teams[y] = new BowlingTeam();
			System.out.print("Enter a team name >> ");;
			name = input.nextLine();
			teams[y].setTeamName(name);
			//Get team members, set to array
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team members's name >> ");
				name = input.nextLine();
				teams[y].setMember(x,  name);
			}
		}
		//Print team members
		for(y = 0; y < NUM_TEAMS; ++y) {
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				System.out.print(teams[y].getMembers(x) + " ");
			System.out.println(x);
			}
		System.out.print("\n\nEnter a team name to see its roster >> ");
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y)
			if(name.equals(teams[y].getTeamName()))
				for(x=0; x < NUM_TEAM_MEMBERS; ++x)
					System.out.print(teams[y].getMembers(x) + " ");
		System.out.println();
				
		}

}
