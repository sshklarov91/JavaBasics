package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean understandJava=true;
		boolean enjoyJava=false;
		boolean practice=true;
		
		if(understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
		}
		
		System.out.println("another example ");
		
		int n1;
		int n2;
		int n3;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + " is the largest");
		} else if(n2>n3 && n2>n1) {
			System.out.println(n2 + " is the largest ");
	    } else if (n3>n1 && n3>n2) {
	    	System.out.println(n3 + " is the largest ");
	    }

}
}