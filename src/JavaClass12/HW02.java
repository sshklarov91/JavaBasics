package JavaClass12;

public class HW02 {

	public static void main(String[] args) {
		String str=new String("fudge");
		int length=str.length();
		if(!str.isEmpty());{
			if(str.length()>3 &&str.length()%2==1) {
				System.out.println(str.charAt(length/2));
			}
		}

	}

}
