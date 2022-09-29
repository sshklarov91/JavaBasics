package practice;

import java.util.Arrays;

public class Practice02 {

	public static void main(String[] args){

		String str4= "radar",reverseStr= "";
		int strLength=str4.length();
		for(int i=str4.length()-1; i>=0; i--) {
			reverseStr=reverseStr+str4.charAt(i);
		}
		if (str4.equals(reverseStr)){
			System.out.println(str4 + "is a palindrome String");
		}else {
			System.out.println(str4 + "is not a palindrome String");
		}
	
	
	}
	}



