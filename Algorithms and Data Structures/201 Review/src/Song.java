
// Import statements
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Song {
	public void main() throws IOException {
		
		// Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Print statements
		System.out.println("----------------- \nWelcome to Song \nWhat verse"
				+ "from 'There Was an Old Lady Who Swallowed a Fly' would you like"
				+ "to hear?");
		System.out.println("Choose one of the 7 verses or Quit: \n1: Verse 1 \n2: Verse 2"
				+ "\n3: Verse 3 \n4: Verse 4 \n5: Verse 5 \n6: Verse 6"
				+ "\n7: Verse 7 \n8: Quit");
		
		// Gets the choice of the verse or to quit
		int choice = scan.nextInt();
		
		// If the choice is 1...
		if(choice == 1) {
			// Gets the path from fly.txt and then Prints out the first stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(1));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(2));
		}
		
		// If the choice is 2...
		else if(choice == 2) {
			// Gets the path from fly.txt and then Prints out the second stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(4));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(5));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(6));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(7));
		}
		
		// If the choice is 3...
		else if(choice == 3) {
			// Gets the path from fly.txt and then Prints out the third stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(9));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(10));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(11));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(12));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(13));
		}
		
		// If the choice is 4...
		else if(choice == 4) {
			// Gets the path from fly.txt and then Prints out the 4th stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(15));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(16));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(17));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(18));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(19));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(20));
		}
		
		// If the choice is 5...
		else if(choice == 5) {
			// Gets the path from fly.txt and then Prints out the 5th stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(22));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(23));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(24));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(25));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(26));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(27));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(28));
		}
		
		// If the choice is 6...
		else if(choice == 6) {
			// Gets the path from fly.txt and then Prints out the 6th stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(30));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(31));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(32));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(33));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(34));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(35));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(36));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(37));
		}
		
		// If the choice is 7...
		else if(choice == 7) {
			// Gets the path from fly.txt and then Prints out the 7th stanza
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(39));
			System.out.println(Files.readAllLines(Paths.get("fly.txt")).get(40));
		}
		
		// If the choice is 8...
		else if(choice == 8) {
			// Terminates the code
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
	  
}
