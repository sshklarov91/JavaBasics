package JavaClass06;

public class LoopInsideLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<3; i++) {
			System.out.println("hello");
			
		for (int j=1; j<=3; j++) {
			System.out.println("bye");	
			}
		}
		for (int i=0; i<=2; i++) {
			for (int j=1; j<=4; j++) {
		System.out.println(i + " " + j);
		}
	}

}
}