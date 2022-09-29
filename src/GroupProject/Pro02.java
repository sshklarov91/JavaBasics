package GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Pro02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Countries?");
		int size = scanner.nextInt();
		String[] countries = new String[size];
		String[] capitals = new String[size];
		scanner.nextLine();
	
		for (int i = 0; i < size; i++) {
			System.out.println("Please Enter Country Name");
			countries[i]=scanner.nextLine();
			
			System.out.println("Please Enter The Capital for " + countries[i]);
			capitals[i]=scanner.nextLine();
			
		}
			System.out.print(Arrays.toString(countries));
			System.out.print(Arrays.toString(capitals));
		
	}

}


