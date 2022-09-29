package com.syntax.class01;

public class NestedIFConditions {

	public static void main(String[] args) {

		int time = 5;
		String day = "Monday";
		

		if (day.equals("Monday")) { // outer IF Condition if it is true then only inner
			// conditions will be checked. if it is false nothing from the inner conditions
			// will be executed
			// it is like a main door, if the door is closed we cannot enter building.
			// as string is a non primitive we can't use == sign we have to use .equals

			// inner if conditions
			if (time >= 7) {
				System.out.println("Lets go to office");
			}

			if (time < 6) {
				System.out.println("lets sleep more");

			}
		}
	}

}

double moneyInMyAccount=2000;
String season="Spring";


if (season.equals("Spring"))

if (moneyInMyAccount>50000) {
	System.out.println("lets go vacations");
	}
else {
	System.out.println("i need to save money");
