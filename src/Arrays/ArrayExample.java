package Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		String[] week = { "Monday", "Sunday", "Tuesday", "Thursday", "Friday" };
		for (String day : week) {

			if (day.equals("Sunday")) {
				System.out.println(day + " is a fun day");
			
			}else if (day.equals("Friday")) {
				System.out.println(day + " is a relax day");
			
			} else {
				System.out.println(day + " is a boring day");
			

			}

		}
	}
}
