import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int art, bob, cal, dan, eli, i;
		//this would be much shorter with lists....still a few chapters away
		System.out.print("Enter Points Scored by Art:  ");
		art = input.nextInt();
		System.out.print("Enter Points Scored by Bob:  ");
		bob = input.nextInt();
		System.out.print("Enter Points Scored by Cal:  ");
		cal = input.nextInt();
		System.out.print("Enter Points Scored by Dan:  ");
		dan = input.nextInt();
		System.out.print("Enter Points Scored by Eli:  ");
		eli = input.nextInt();
		System.out.print("Points for game");
		System.out.print("\nArt:");
		  for (i = 1; i <= art; i++)
		      {
		          System.out.print("*");
		      }
		System.out.print("\nBob:");
		  for (i = 1; i <= bob; i++)
		      {
		          System.out.print("*");
		      }
		System.out.print("\nCal:");
		  for (i = 1; i <= cal; i++)
		      {
		          System.out.print("*");
		      }
		System.out.print("\nDan:");
		  for (i = 1; i <= dan; i++)
		      {
		          System.out.print("*");
		      }
		System.out.print("\nEli:");
		  for (i = 1; i <= eli; i++)
		      {
		          System.out.print("*");
		      }
	}

}
