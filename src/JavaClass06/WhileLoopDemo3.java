package JavaClass06;

public class WhileLoopDemo3 {

	public static void main(String[] args) {

		int b = 20;

		while (b <= 20 && b>=1) {
			System.out.print(b + " ");
			b--;
		}

		System.out.println("----------------");

		int c = 1;
		while (c <= 100) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		}

		System.out.println("----------------");

		int d = 20;

		while (d <= 20 && d>=1) {

			if (d % 2 != 0) {
				System.out.print(d + " ");
				}
			d--;
		}
	}
	}
	
