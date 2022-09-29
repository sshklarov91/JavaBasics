package com.syntax.homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		/*double mortgageRate = 4.5;
		double mortgagePrice = 210000.0;*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("What is the mortgage rate");
		double mortgageRate = scan.nextDouble();
		
		if (mortgageRate<4.5) {
			System.out.println("You will consider buying, what is the price of the house?");
			int price = scan.nextInt();
			if (price > 200000) 
		  System.out.println("You should take a loan");
			else {
				System.out.println("You can pay cash");
			}
		}
		
		
		
		else {
			System.out.println("You will not buy a house");
		}
			
		
	}

}
