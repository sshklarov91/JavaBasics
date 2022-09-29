package ObjectOrientedProgramming;

public class Person {

	String name;
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean losingHairs;

	void study() {

		if (name.equals("Anna")) {
			System.out.println("I study hard");
		} else if (name.equals("Roman")) {
			System.out.println("I will keep deleting the messages and will not let any one study");
		} else {
			System.out.println("I try to study but things dont make munch sense");
		}

	}

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Roman";
		person1.study();

		Person person2 = new Person();
		person2.name = "Yusuf";
		person2.study();

	}
}
