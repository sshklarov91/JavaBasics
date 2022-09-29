package com.syntax.homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the loan amount needed?");
		double loanAmount= scanner.nextDouble();
		
		if (loanAmount <= 200000) {
			System.out.println("Approved");
			}
		else
			System.out.println("Denied");
		    
	}

}
