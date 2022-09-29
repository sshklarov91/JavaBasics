package com.syntax.class01;

public class RecapClass {

	public static void main(String[] args) {
		String firstName = "Mina";
		String lastName = "Henen";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);

		int houseNo = 10;
		int apartmentNo = 5;
		String streetName = " That street ";
		String city = " New York ";
		String country = " USA ";
		String fullAddress = houseNo + " " + apartmentNo + streetName + city + country;
		System.out.println(fullAddress);

		System.out.println("if we subtracts 10 from 5 we get = " + (10 - 5));

		// New Class RecapOperators

		int num1 = 11;
		int num2 = 3;
		System.out.println("Answer " + num1 / num2);
		System.out.println("Remainder " + num1 % num2);

		double num3 = 9;
		double num4 = 2;
		System.out.println(num3 / num4);

		double num5 = 1.0;
		double num6 = 3.0;
		System.out.println(num5 / num6);

		float num7 = 1.0f;
		float num8 = 3.0f;
		System.out.println(num7 / num8);

		// type casting
		byte box1 = 127; // smallest box
		short box2 = 3333;// slightly larger
		int box3 = 45454545; // large box most commonly used
		long box4 = 45454545;// slightly larger box
		float box5 = 414564545; // larger box
		double box6 = 454545445; // largest

		int number = (int) 15.2;
		System.out.println(number);

		long smallerBox = (long) box2;
		System.out.println(smallerBox);

		short biggerBox = box1;

		float box8 = (float) box4;
		System.out.println(box8);

		char a = (char) 67;
		System.out.println(a);

		long box9 = (long) box3;
		System.out.println(box9);

		int box = 1234;
		long box24 = box;
		System.out.println(box24);

		long box30 = 12345678;
		int box28 = (int) box30;
		System.out.println(box28);

		int box42 = 987456123;
		short box12 = (short) box42;
		System.out.println(box12);

	}

}
