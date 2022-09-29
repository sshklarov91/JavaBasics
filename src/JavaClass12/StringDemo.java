package JavaClass12;

public class StringDemo {

	public static void main(String[] args) {
		//Proper way of creating an object
		String str=new String("Java");
		//Simpler and shorter way provided by java creators to make our lives easier
		String name="Asma Alfadhli The Great";
		
		System.out.println(str.length());
		System.out.println(name.length());
		
		if (name.length()>15) {
			System.out.println("Name cant be more than 15 characters");
		}

	}

}
