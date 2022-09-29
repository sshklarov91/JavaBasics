package com.syntax.homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter A Grade");
		String grade = scan.next();
		String explenation;
		
switch(grade) {
		
		case "A":
			explenation="Excellent";
			break;
		case "B":
			explenation="Good";
			break;
		case "C":
			explenation="Average";
			break;
		case "D":
			explenation="Bad";
			break;
		default:
		explenation="Not Acceptable";
		
			
		}
		System.out.println("You entered " + grade + " and your entered grade is " + explenation);
	}

}
