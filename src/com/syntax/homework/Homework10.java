package com.syntax.homework;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please First Number");
		int num1 = scan.nextInt();
		
		System.out.println("Please Second Number");
		int num2 = scan.nextInt();
		
		System.out.println("Please enter operation");
        String operation = scan.next();
        int result=0;
        
        switch (operation) {
        case "+":
        	result=(num1+num2);
        	break;
        case "-":
        	result=(num1-num2);
        	break;
        case "*":
        	result=(num1*num2);
        	break;
        case "/":
        	result=(num1/num2);
        }
        System.out.println("The result is " + result);
        
        
        

	}

}
