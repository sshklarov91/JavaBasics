package com.syntax.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter A Number");
		double height=scan.nextDouble();
		
		if (height>=1 && height <=10) {
			System.out.println("Small");
		
		} else if (height>=11 && height <=100) { 
				System.out.println("Medium"); 
		
		} if (height>=101 && height <=1000) {
			System.out.println("Large");
		
		}

}
}

