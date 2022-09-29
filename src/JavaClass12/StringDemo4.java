package JavaClass12;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		
		if (str.equals("shah")) {
			System.out.println("i found it");
		}
		if (str.equalsIgnoreCase("shah")) {
			System.out.println("i found it with equalsIgroneCase");	
		}

	}

}
