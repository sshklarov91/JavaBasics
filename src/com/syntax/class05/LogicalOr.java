package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="saturday";
		
		if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("I have Java class at Syntax");
		} 
		
		if (day.equals("saturday") && day.equals("sunday")) {
				System.out.println("I have Java class at Syntax");
		}
		
		
		
		
		double money=40000;
		String title="Automation Tester";
		
		if (title.equals("Automation Tester") || money ==120000) {
			System.out.println("Happy");
		}
	}

}
