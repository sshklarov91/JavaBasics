package com.syntax.homework;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Quiz Grade");
		double quiz=scan.nextDouble();
		System.out.println("Please Enter Midterm Grade");
		double midterm=scan.nextDouble();
		System.out.println("Please Enter Final Grade");
		double finalscore=scan.nextDouble();
		
		double avg = 0;
		String grade="null";
		 
		avg=(quiz+midterm+finalscore)/3;
		
		if(avg>=90 && avg<=100) {
	            grade = "A";
	        }else if(avg>=70 && avg<90) {
	            grade = "B";
	        }else if(avg>=50 && avg<70) {
	            grade = "C";
	        }else if(avg<50 && avg>0) {
	            grade = "F";
	        }else {
	            System.out.println("Please enter valid score!");
	            grade ="None";
	        }
	        System.out.println("Grade: "+grade);

		
		
		
		
		

	}

}
