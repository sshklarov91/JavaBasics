package com.syntax.class01;

public class Variables {

	public static void main(String[] args) {
		String Name;
		String Last1;
		char grade;
		String City;
		String State;
		String Phone;
		
	    Name="Sergey";
		Last1="Shklarov";
		grade='A';
		City="Brooklyn";
		State="NY";
		Phone="123 456 789";
		
		System.out.println("My name is " +Name);
		System.out.println("and my last name is " + Last1);
		System.out.println("I am a " + grade +" Student ");
		System.out.println("I live in " + City  + State);
		System.out.println("My new phone number is " + Phone);
		
		//changes
		
		City="Queens";
		State="YN";
		Phone="987 654 321";
		grade='B';
		
		System.out.println("I live in " + City  + State);
		System.out.println("My new phone number is " + Phone);
		System.out.println("I am a " + grade +" Student ");
		
		boolean fail=false;
		boolean win=true;
		
		System.out.println(fail);
		System.out.println(win);
		
		
		int age1=4;
		System.out.println(age1);
		
		boolean myBoolean=false;
		double money=99999.99;
		
		System.out.println(money + "" + myBoolean);
		
		char star='*';
		String star2="**";
		String star3="***";
		String star4="##";
		char star5='#';
		
		System.out.println(star);
		System.out.println("");
		System.out.println(star2);
		System.out.println("");
		System.out.println(star3);
		System.out.println("");
		System.out.println(star4);
		System.out.println("");
		System.out.println(star5);
		
		
		String name1="Chen";
		int age=50;
		int iq=age;
		System.out.println(name1);
		System.out.println(age + "" + iq);
		
		String name="Java ";
		String lan=" programming language ";
		
		System.out.println( name + "is the # 1"+( lan ) );
		
		String n="Syntax";
		String l="techs.com";
		
		System.out.println(n+( l ) );
		
		float a1=8.2f;
		System.out.println("The multiplication of " + a1 + " with itself is equal to " + a1*a1 );
		
		int a=200;
		int b=100;
		
		System.out.println(a+b);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(a-b);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(a*b);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(a/b);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		int width=5;
		int height=8;
		System.out.println( "The perimeter of a rectangle with width " + width + " and height " + height + " is equals to " + ( 2*( width+height) ) + " and the area equals to " + 
		( width*height ) );
		
		int num10 = 3;
	    int num20 = 7;
	    int num30 = 5;
	    int num40 = 1;
	    
	    System.out.println( (num10+num20)/num30-(num40) + " The result of arithmetic operations is equal to ");
	    
	    int myNumber=10;
	    int stepOne=7*7;
	    int stepTwo=(7*7) + (7);
	    int stepThree=56/7;
	    int stepFour=8+17;
	    int stepFive=25-7;
	    int stepSix=18/6;
	    
	    System.out.println(" The magic number is " + (myNumber + stepOne + stepTwo + stepThree + stepFour + stepFive + stepSix + "!"));
	    
	    int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    int result = num1+num2;
	    int result1= result-num3;
        int result3 = num4*num5;
	    int result2= result3/num6;
        int blank3 = result1%result2;
	    
	    System.out.println( result2 + " modded by " + result1 + " is " + blank3);
	    

	    int cat = -21;
	    int dog = 4;
	    
	    System.out.println(cat%dog);
	    
	    int number=(int)15.2;
		System.out.println(number);
		
		
		


		
	}

}
