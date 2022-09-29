package com.syntax.homework;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the number of your worked years");
		
		double years=scanner.nextDouble();
		
		
		if (years >=5) {
			System.out.println("You are eligible for a bonus, what is your annual salary?");
		int salary = scanner.nextInt();
		
		if (salary>50000)
			System.out.println("Your bonus is 5000");
		else {
			System.out.println("Your bonus is 3000");
		}
		}
		
		else {
			System.out.println("You are not eligible for a bonus");
			
		}
	}
}
	


