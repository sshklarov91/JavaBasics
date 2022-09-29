package com.syntax.class05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Current Time");
		double hours=scan.nextDouble();
		
		if (hours>=1 && hours <=11) {
			System.out.println("Morning");
		
		} else if (hours>=12 && hours <=15) { 
				System.out.println("Afternoon"); 
		
		} else if  (hours>=16 && hours <=20) {
			System.out.println("Evening");
		
		} else if (hours>=21 && hours <=24) {
			System.out.println("Night");

	}

}
}