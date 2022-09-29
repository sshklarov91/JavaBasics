package com.syntax.class01;

import java.util.Scanner;

public class crack {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter A Number");
		int num=scanner.nextInt();
		
		if (num%2==0) {
			System.out.println("Value Is Even");
		}
		if ( num%2  !=0) {
			System.out.println("Number is odd");
		}
		if (num>1000) {
			System.out.println("Value Is Large");
		}
		if (num<1000){
			System.out.println("Value is just right");
		
		
		}
	}

}
