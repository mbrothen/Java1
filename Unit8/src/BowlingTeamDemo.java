import java.util.*;
public class BowlingTeamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		//Get team Name
		System.out.print("Enter a team name >> ");;
		name = input.nextLine();
		bowlTeam.setTeamName(name);
		//Get team members, set to array
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print("Enter team members's name >> ");
			name = input.nextLine();
			bowlTeam.setMember(x,  name);
		}
		//Print team members
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			System.out.print(bowlTeam.getMembers(x) + " ");
		System.out.println(x);
	}

}
