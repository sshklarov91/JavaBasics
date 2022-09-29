package ObjectOrientedProgramming;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;

	void call() {
		System.out.println("Calling");
	}

	void takePicture() {
		System.out.println("Taking pictures");
	}

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.color = "Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make: " + iphone.make + " Model: " + iphone.model);
		iphone.call();
		System.out.println("-------------------------------");
		
		Phone samsungPhone= new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = "S22 Ultra";
		samsungPhone.color = "Grey";
		samsungPhone.storage=256;
		samsungPhone.size=6.7;
		samsungPhone.cheap=false;
		samsungPhone.takePicture();
		System.out.println(iphone.make);
		System.out.println(samsungPhone.make);
		
	}

}
