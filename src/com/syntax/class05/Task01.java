package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Height In Inches");
		double height=scan.nextDouble();
		
		if (height<=60) {
			System.out.println("short");
		} else if (height>=60 && height <=72) {
				System.out.println("Medium"); 
		} if (height>=72) {
			System.out.println("Tall");
		}
				
			

		}	
	}

