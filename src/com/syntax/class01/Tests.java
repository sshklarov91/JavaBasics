package com.syntax.class01;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter 3 Distinct Numbers");
		
		
		System.out.println("Number 1");
		int num1=scanner.nextInt();
		
		System.out.println("Number 2");
		int num2=scanner.nextInt();
		
		System.out.println("Number 3");
		int num3=scanner.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
			System.out.println("Largest number is " + num1);
		} else {
			System.out.println("Largest number is " + num3);
		}
		} else {
			if (num2>num3) {
				System.out.println("Largest number is " + num2);
				}else {
					System.out.println("Largest number is " + num3);
				}
	
	
	}
	}
    }
		
		
