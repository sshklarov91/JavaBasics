package ReviewClass;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		String[]individualsInRoom1=new String[] {"sabej","shah","mina"};
		String[]individualsInRoom2=new String[] {"Roman","mina"};
		String[]individualsInRoom3=new String[] {"Asad","Priyasri","Ali"};
		//an 2d array that will store 3 single d arrays
		String[][]rooms=new String [3][];
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		
		System.out.println(rooms[2][2]);
	}

}
