package com.syntax.class05;

import java.util.Scanner;

public class Replits2 {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter name of child");
			int age = scan.nextInt();
			String output;
			
	switch(age) {
			
			case 1:
				output="You can Crawl";
				break;
			case 2:
				output="You can Talk";
				break;
			case 3:
				output="You can Dance";
				break;
			case 4:
				output="You can get Trouble";
				break;
			default:
				output="I don't know how old you are";
				break;
				
			}
			System.out.println(output);

}
}



