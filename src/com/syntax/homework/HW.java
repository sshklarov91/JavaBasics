package com.syntax.homework;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Your Gender: M or F");
		String gender=scanner.next();
		
		if (gender.equalsIgnoreCase("M")){
			
			System.out.println("What is your age?");
			
			int age = scanner.nextInt();
			
			if(age<25) {
			System.out.println("Boy");
			}
			else if (age>25) {
				System.out.println("Man");
			}	
		} 
		else if (gender.equalsIgnoreCase("F")){
			
			System.out.println("What is your age?");
			
			int age = scanner.nextInt();
			
			if (age<25) {
			System.out.println("Girl");
			} else if (age>25) {
			System.out.println("Woman");
			}
		}
		
	}

}

/*
 * Scanner scanner=new Scanner(System.in);
 * System.out.println("Please Enter Your Gender: M Or F?"); String
 * gender=scanner.next();
 * 
 * if (gender) { System.out.println("Congratulations! What's your GPA");
 * 
 * int GPA=scanner.nextInt(); if (GPA >= 3.5)
 * System.out.println("You are eligible for a scholarship"); else
 * System.out.println("You should have studied harder"); }
 * 
 * 
 * else { System.out.println("Get Degree"); }
 */
