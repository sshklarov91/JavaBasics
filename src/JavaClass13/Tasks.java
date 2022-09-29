package JavaClass13;

import java.util.Arrays;

public class Tasks {

	public static void main(String[] args) {
		String str="Batch 14 is really good";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		System.out.println("--------------------------");
		
		String str1="1234567!@#$%^&abcABC";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str1.length());
		
		System.out.println("-----------------------------");
		
		String str3="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[]arr=str3.split("[?]");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		System.out.println("--------------------------------");
	
		String str4= new String("This is sentence i want to reverse");
		for(int i=str4.length()-1; i>=0; i--) {
			System.out.print(str4.charAt(i));
		}
		System.out.println("------------------------------------");
		
		String str5= "madam",reverseStr= "";
		int strLength=str5.length();
		for(int i1=str5.length()-1; i1>=0; i1--) {
			reverseStr=reverseStr+str5.charAt(i1);
		}
		if (str5.equals(reverseStr)){
			System.out.println(str5 + " is a palindrome String");
		}else {
			System.out.println(str5 + " is not a palindrome String");
		}
		}
	}
	
		

	
	
	


