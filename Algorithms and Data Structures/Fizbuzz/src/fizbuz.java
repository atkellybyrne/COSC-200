import java.util.Scanner;

public class fizbuz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Input a positive integer");
			int num = sc.nextInt();
			for(int i=1; i<=num; i++) {
				System.out.println();
				if(i%3==0) {
					System.out.print("Fizz ");	
				}
				if(i%5==0) {
					System.out.print("Buzz ");
				}
				if(i%7==0) {
					System.out.print("Fuzz ");
				} 
				if(i%3!=0 && i%5!=0 && i%7!=0){
					System.out.print(i);	
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
