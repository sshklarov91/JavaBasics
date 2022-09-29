package com.syntax.class05;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Birth Month");
		String month=scan.next();
		
		String season = null;
		
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
	  } if (month.equals("June") || month.equals("July") || month.equals("August")) { 
			season="Summer";
	  } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
	  } else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
	  }
	  System.out.println(season);
}
}