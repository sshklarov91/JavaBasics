package com.syntax.homework;

public class Homework11 {

	public static void main(String[] args) {

		boolean allergy = true;
		String allergyType = "Pollen";

		if (allergy) {
			System.out.println("Lets check what allergy you have");

			if (allergyType.equalsIgnoreCase("pollen")) {
				System.out.println("Try to stay indoors");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("You are lucky");
		}
	}
}
