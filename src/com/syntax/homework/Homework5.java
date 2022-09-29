package com.syntax.homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your city");
		String city=scanner.next();
		System.out.println("What is the temperature");
		double temp =scanner.nextDouble();
		double temp1=(temp-32)*0.6;
		System.out.println("The temperature in the city is " + temp1);

	}

}
