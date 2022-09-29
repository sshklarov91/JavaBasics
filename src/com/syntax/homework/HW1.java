package com.syntax.homework;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double money;
		double coffee=5.99;
		
		do {
		System.out.println("Pay For Coffee");
		money=scan.nextDouble();
		if (money>coffee) {
			System.out.println("please give less");
		}else if (money<coffee) {
			System.out.println("Please give less");
			
		}
		}while(money!=coffee);
		System.out.println("please enjoy yout coffee");
	}	
	
}	

	


