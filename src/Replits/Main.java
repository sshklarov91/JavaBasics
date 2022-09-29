package Replits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value");
		String name = input.next();
		
		String str=name;
		String reverseStr= "";
		
		int strLength=str.length();
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr=reverseStr+str.charAt(i);
		}
		if (str.equals(reverseStr)){
			System.out.println(str + " is a palindrome ");
		}else {
			System.out.println(str + " is not a palindrome ");
		}
		}
	}