package com.syntax.homework;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please First Number");
		int num1 = scan.nextInt();
		
		System.out.println("Please Second Number");
		int num2 = scan.nextInt();
		
		System.out.println("Please enter operation");
        String operation = scan.next();
        
        if (operation.equals("+"))  
        
        	System.out.println(num1 + num2);
        
        if (operation.equals("-"))  
        
        	System.out.println(num1 - num2);
        
        if (operation.equals("*")) 
        
        	System.out.println(num1 * num2);
       
        if (operation.equals("/")) 
        
        	System.out.println(num1/num2);
        


}
}