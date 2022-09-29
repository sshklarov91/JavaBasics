package com.syntax.class01;

import java.util.Scanner;

public class InputFromKeyBoard5 {

	
			public static void main(String[] args) {
				
				
				Scanner scanner=new Scanner(System.in);
				System.out.println(" Did you solve Repl Assignments ");
				boolean solvedAnyRepls=scanner.nextBoolean();
				
				if(solvedAnyRepls) {
					System.out.println("How many reps did you solve");
					
					int noOfReplsSolved=scanner.nextInt();
					
					if(noOfReplsSolved>=17)
					{
					System.out.println("you are doing great");
					}
					else if(noOfReplsSolved>10) {
					System.out.println("You are doing ok, please complete them as soon as possible");
						
				}	
					else {
					System.out.println("you shoud solve more reps");
					}
			}
				
				else {
					System.out.println("There are very importaint to learn java please solve them");
				}
				

				}
}
	
	
	


