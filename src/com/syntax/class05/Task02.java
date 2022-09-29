package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Day Number");
		double day=scan.nextDouble();
		
		if (day>=1 && day<=5) {
			System.out.println("Weekday");
		} else if (day>=6 && day<=7) {
				System.out.println("Weekend"); 
		} if (day>=7) {
			System.out.println("Invalid Day");
		}

	}

}
