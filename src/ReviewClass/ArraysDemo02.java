package ReviewClass;

import java.util.Arrays;

public class ArraysDemo02 {

	public static void main(String[] args) {
		String [] dresses=new String[] {"Pink Dress","Cocktail Dress","Summer Dress", "Night Dress", "Office Dress"};
		System.out.println(dresses.length);
		
		for(int i=0;i<dresses.length;i++) {
			System.out.println("Lets Try " + dresses[i]);
			}
		//enhanced for loop - can't use in all scenarios - only goes in one direction - cant skip elements
		for (String dress:dresses) {
			System.out.println(dress);
			}
			System.out.println(Arrays.toString(dresses));

}
}