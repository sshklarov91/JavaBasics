package com.syntax.homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scanner.nextInt();
		
		if (age>18) {
			System.out.println("Drivers Licence Approved");
			}
		else
			System.out.println("Get a learners permit");
		
	}
}
