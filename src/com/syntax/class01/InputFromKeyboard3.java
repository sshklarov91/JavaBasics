package com.syntax.class01;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age=scanner.nextInt(); //we use nextINt if we want a int type of data from the keyboard
		
		if (age<18) {
			System.out.println(" you should study ");
		}
		
		else {
			System.out.println(" you should start working ");
		
		}
	}

}
