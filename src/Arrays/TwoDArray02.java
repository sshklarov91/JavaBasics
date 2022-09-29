package Arrays;

public class TwoDArray02 {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Canada" }, { "Peru", "Brazil", "Columbia", "Ecuador" },
				{ "Ethiopia", "Egypt", "Keniya" }, { "Germany", "Turkey", "Moldova", "Ukraine" },
				{ "Kazakstan", "Afganistan", "Korea" } };
		System.out.println(countries.length);

		int el0f1arr = countries[0].length;
		System.out.println("# of elements from 1 array= " + el0f1arr);
		int el0f2arr = countries[1].length;
		System.out.println("# of elements from 1 array= " + el0f2arr);

		System.out.println("getting all values from 2d array----------------------");

		for (String[] country : countries) {
			for (String c : country) {
				if (c.equals("USA")) {
					System.out.println(c + " is my home country");
				} else {
					System.out.println(c + " ");
				}
				System.out.println();
			}
			System.out.println("-------------------------------------------------------");

			for (int r = 0; r < countries.length; r++) {
				for (int c = 0; c < countries[r].length; c++) {
					System.out.print(countries[r][c] + "  ");

				}
				System.out.println(" ");
			}

		}
	}
}
