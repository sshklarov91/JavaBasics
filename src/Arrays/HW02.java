package Arrays;

public class HW02 {

	public static void main(String[] args) {
		String[] animals = { "Tiger", "Monkey", "Bear", "Owl", "Hawk"};

		for (String species : animals) {
			System.out.print(species + " ");
		}
		System.out.println(" ");

		String[] animals1 = { "Tiger", "Monkey", "Bear", "Owl", "Hawk"};
		for (int j = 0; j < animals1.length; j++) {
			System.out.print(animals1[j] + " ");
		}
	}
}