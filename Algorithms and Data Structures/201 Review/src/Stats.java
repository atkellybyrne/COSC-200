
// Import statements
import java.util.*;

public class Stats {

	public void main() {
		// Stats object to call methods
		Stats s = new Stats();
		
		// Scanner object
		Scanner sc = new Scanner(System.in);
		int num = 5;
		
		// While loop to constantly pick a new option
		while(num >=5) {
			System.out.println("----------------- \nWelcome to the Stats Activity! " 
					+ "\nChoose one of the 4 options: " + "\n1: Mean" 
					+ "\n2: Median\n" + "3: Mode" + "\n" + "4: Quit");
			
			num = sc.nextInt();
		}
		
		// Makes an array and an ArrayList
		int[] a1 = new int[15];
		ArrayList a2 = new ArrayList();
		
		// Loops through to randomly assign numbers to them
		for(int i = 0; i < a1.length; i++) {
			a1[i] = (int) (Math.random() * 100);
			a2.add((int)(Math.random()*100));
		}
		
		// Switch statements to determine methods or quitting
		if(num ==1) {
			System.out.println(s.Mean(a1));
		}
		else if (num == 2){
			System.out.println(s.Median(a1));
		}
		else if(num == 3) {
			System.out.println(s.Mode(a2));
		}
		else if(num ==4){
			System.out.println("Have a good day!");
			System.exit(0);
		}
	}

	// Returns the mean of the array
	public double Mean(int[] a1) {
		// Num is 0
		int num  = 0;
		
		// Loops through
		for(int i = 0; i < a1.length; i++) {
			// Adds them all together
			num += a1[i];
		}
		
		// Returns that number divided by the length
		return num/a1.length;
	}
	
	// Returns the median of the array
	public double Median(int[] a1) {
		
		// Sets a max integer
		int min = Integer.MAX_VALUE;
		// Counter
		int count = 0;
		// Gets a new array that is the same length
		int[] a2 = new int[a1.length];
		
		// Loops through
		for(int i = 0; i < a1.length; i++) {
			
			// If any spot at i in a1 is less than the min
			if(a1[i] < min) {
				
				// a1[i] is now the min
				min = a1[i];
			}
			
			// At the length count of a[2] is the new min
			a2[count] = min;
			
			// Count increases
			count++;
			
			// Min is back to the max integer
			min = Integer.MAX_VALUE;
		}
		
		// Returns a1.length divided by 2
		return a1.length / 2;
	}
	
	public int Mode(ArrayList a1) {
		int maxValue = 0;
		int maxCount = 0;

	      for (int i=0; i < a1.size(); ++i) {
	         int count = 0;
	         for (int j = 0; j < a1.size(); ++j) {
	            if (a1.get(i) == a1.get(j))
	            ++count;
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = (int) a1.get(i);
	         }
	      }
	      return maxValue;
	}
}
