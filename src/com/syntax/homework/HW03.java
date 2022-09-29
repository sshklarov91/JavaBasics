package com.syntax.homework;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name=null;
		
		for (int i=1;i<=3;i++) {
			System.out.println("What i your name?");
			name = scan.nextLine();
		
		} System.out.println("Good Afternoon " + name);

	}

}
