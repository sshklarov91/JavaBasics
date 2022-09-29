package com.syntax.homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		
		boolean GotCard=scanner.nextBoolean();
		
		
		if (GotCard) {
			System.out.println("What is your balance");
			int balance = scanner.nextInt();
			if (balance>1000) {
				System.out.println("Pay off immediately");
			}
			else {
				System.out.println("You can spend more");
			}
		}
		
		
		else {
			System.out.println("Do you want a credit card");
			
		}
		
	}}

