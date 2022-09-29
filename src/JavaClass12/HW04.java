package JavaClass12;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the Fathers first name?");
		String name = scan.next();
		System.out.println("What is the Mothers first name?");
		String name2 = scan.next();
		System.out.println("Are you expecting a boy or a girl");
		String gender = scan.next();
		
		if (gender.equals("girl")) {
			System.out.println(name2.substring(0,name2.length()/2)+(name.substring(name.length()/2)));
		} else if (gender.equals("boy")) {
			System.out.println(name.substring(0,name.length()/2)+(name2.substring(name2.length()/2)));
		}

	}

}
