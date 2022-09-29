package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner arr = new Scanner(System.in);
		String[] days = new String[8];
		for (int i = 1; i < 8; i++) {
		System.out.println("Please Enter Day " + i+ " of the week");
		days[i]=arr.next();
		}
		
		System.out.println("Please Enter Day " + days+ " of the week");	
		for (int i = 1; i < 8; i++) {
			System.out.println("Please Enter Day " + i + " of the week");
			System.out.println(days[i]);
}		
}
}