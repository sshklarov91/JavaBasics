package JavaClass06;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		System.out.println("Did you get a job?");
		answer =scan.nextLine();
		
		while (!answer.equals("yes")) {
			System.out.println("Did you get a job?");
			answer=scan.nextLine();
		}

	}

}
