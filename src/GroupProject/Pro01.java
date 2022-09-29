package GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length Of Your Array?");
		int length = input.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter Array Numbers");

		int sum = 0;
		for (int i = 0; i < length; i++) {
			myArray[i] = input.nextInt();
			sum += myArray[i];
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("The Sum of The Array is " + sum);
	}

}
