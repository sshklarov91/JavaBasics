package JavaClass06;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job?");
			answer = scan.next();
		
		} while(!answer.equals("yes"));
		
}
}