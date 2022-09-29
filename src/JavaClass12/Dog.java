package JavaClass12;

public class Dog {
	
	String name;
	String color;
	String size;
	void aggressive() {
		System.out.println("aggressive");
	}

	void friendly() {
		System.out.println("is very friendly");
	}

	void lazy() {
		System.out.println("lazy");
	}

	public static void main(String[] args) {

	Dog pitbull = new Dog();
	pitbull.name="Pitty";
	pitbull.color="black";
	pitbull.size="large";
	System.out.println("The dogs name is " + pitbull.name + " he is " + pitbull.color + " and he is very " + pitbull.size +  " and ");
	pitbull.aggressive();
	
	Dog goldenretriver  = new Dog();
	goldenretriver.name="Luna";
	goldenretriver.color="blonde";
	goldenretriver.size="medium";
	System.out.println("The dogs name is " + goldenretriver.name + " she is " + goldenretriver.color + " and is " + goldenretriver.size +" in size" +  " and ");
	goldenretriver.friendly();
	
	Dog pug = new Dog();
	pug.name="Klepa";
	pug.color="grey";
	pug.size="small";
	System.out.println("The dogs name is " + pug.name + " he is " + pug.color + " and very " + pug.size +  " and ");
	pug.lazy();
}
}
