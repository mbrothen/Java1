import java.util.Random;
import java.util.*;
public class raceTable2 {
	
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

}
