package JavaClass12;

public class Phone {

	String make;
	String model;
	String color;
	int year;
	

	void expensive() {
		System.out.println("its for rich people");
	}

	void midgrade() {
		System.out.println("it is affordable");
	}
	
	void cheap() {
		System.out.println("and it is cheap");
	}

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = " 14 Pro Max";
		iphone.color = "Black";
		iphone.year=2022;
		
		System.out.println("The " + iphone.make + iphone.model + " is " + iphone.color + " in color and was released in the year " + iphone.year + " and " );
		iphone.expensive();
		
		Phone samsungPhone= new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = " S22 Ultra";
		samsungPhone.color = "Grey";
		samsungPhone.year=2020;
		
		System.out.println("The " + samsungPhone.make + samsungPhone.model + " is " + samsungPhone.color + " in color and was released in the year " + samsungPhone.year + " and " );
		samsungPhone.midgrade();
		
		Phone pixel= new Phone();
		 pixel.make = "Google";
		 pixel.model = " Pixel XL";
		 pixel.color = "White";
		 pixel.year=2018;
		
		 System.out.println("The " + pixel.make + pixel.model + " is " + pixel.color + " in color and was released in the year " + pixel.year + " and " );
		 pixel.cheap();

	}
}