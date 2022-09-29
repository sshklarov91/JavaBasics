package com.syntax.class05;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Where are you from");
		String country = scan.nextLine();
		String Language;
		
switch(country) {
		
		case "Usa":
			Language="English";
			break;
		case "Germany":
			Language="Beshparmak";
			break;
		case "Turkey":
			Language="Turkish";
			break;
		case "Venezuela":
			Language="Spanish";
			break;
		case "Latvia":
			Language="Latvian";
			break;
		case "Russia":
			Language="Russian";
			break;
		case "Italy":
			Language="Italian";
			break;
		default:
			Language="Unknown";
			break;
			
		}
		System.out.println("You are from " + country + " and you speak " + Language);


	}

}
