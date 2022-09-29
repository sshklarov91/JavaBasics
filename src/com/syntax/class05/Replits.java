package com.syntax.class05;

import java.util.Scanner;

public class Replits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		System.out.println("Please enter two numbers");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if ((word1.equals(word2)) && num1==num2) {
			System.out.println("AND");
			}
		else if ((word1.equals(word2)) || (num1==num2)) {
			System.out.println("OR");
			}
		if ((!word1.equals(word2)) && (num1!=num2)) {
			System.out.println("NONE");
	
	}
}	
}		


