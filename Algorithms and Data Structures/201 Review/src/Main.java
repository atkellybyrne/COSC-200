/*
 * Kelly Byrne
 * 
 * 201 Review
 * 01/18/2022
 */

// Import Statements
import java.io.IOException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Sets choice to four
		int choice = 4;
		
		// While choice isn't for to keep looping...
		while(choice>=4) {
			System.out.println("----------------- \nWelcome to Main \nChoose one of"
					+ " the four options: \n1: Monster or Mouse" + 
					"\n2: Stats" + "\n3: Song");
			// Selects the choice
			choice = sc.nextInt();
		}
		
		// Switch Statements to determine which class to use or to 
		// exit
		if(choice == 1) {
			MonsterOrMouse m = new MonsterOrMouse();
			m.choice();
		}
		else if(choice == 2) {
			Stats s = new Stats();
			s.main();
		}
		else if(choice == 3) {
			Song s = new Song();
			s.main();
		}
		else if(choice == 4) {
			System.out.println("Have a good day!");
			System.exit(0);
		}
	}

}
