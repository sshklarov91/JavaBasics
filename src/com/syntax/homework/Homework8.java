package com.syntax.homework;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("How many years have you worked");
		double year=scan.nextDouble();
	
		if (year>=5) {
			System.out.println("You are eligible for a bonus");
			System.out.println("What is your salary");
		double salary=scan.nextDouble();
		
		if (salary<50000)
			System.out.println("You are get 3000 bonus");
		else {
			System.out.println("You get 5000 bonus");
		
		}
		}
		else {
			System.out.println("You are not eligible for a bonus");
		}}}
		



