package com.syntax.class01;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num=scanner.nextInt();
		
		if (num%2==0) {
			System.out.println(" number is even ");
		}
		else if ( num%2 !=0 ) {
			System.out.println("number is odd");
		
		}

	}

}
