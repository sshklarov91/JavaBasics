package JavaClass13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		
	String str="Today is sunday";
	String day=str.substring(9);
	System.out.println(day);
	System.out.println(str.substring(6, 9));
	System.out.println(str.length());
	char c=str.charAt(6); // calling the method
	System.out.println(c);
	
	char []charArr=str.toCharArray();
	System.out.println(Arrays.toString(charArr));
	System.out.println(charArr);
	int index=str.indexOf("a");
	System.out.println(index);
	System.out.println(str.indexOf("a",6));
	
		
	}
	
	}

	
	


