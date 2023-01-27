
public class MonsterOrMouse {
	public void choice() {
		// Print statement
		System.out.println("----------------- \nWelcome to the MonsterOrMouse activity!");
		
		// Makes a random number 
		int num = (int)(Math.random()*101);
		
		// Prints out that number
		System.out.print("Your number was: " + num + "\nso you got: ");
		
		// Num mod 3 to get one of three choices and then exits
		num = num%3;
		
		// If num is 0...
		if(num == 0) {
			// Prints out Monster
			System.out.println("Monster");
			
			// If num is 1...
		} else if(num==1) {
			// Prints out mouse
			System.out.println("mouse");
			
			// If num is anything else...
		} else {
			// Prints out MONSTER MOUSE
			System.out.println("MONSTER MOUSE");
		}
		
		// Exits
		System.exit(0);
		
	}
}
