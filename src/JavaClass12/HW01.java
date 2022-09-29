package JavaClass12;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		
		String userName="admin";
		String password="pass1234";
		String reenterPassword="pass1234";
		
		if (userName.isEmpty()&& password.isEmpty()) {
			System.out.println("User & Password cannot be empty");
		}else if (password.length()<8) {
			System.out.println("Password is too short");
		}else if (password.contains(userName)) {
			System.out.println("Password cannot contain user name");
		}else if (!password.equals(reenterPassword)) {
			System.out.println("Passwords do not match");
		//}else if (password.equals(reenterPassword)){
			//System.out.println("Passwords match");
		}else {
			System.out.println("User Name & Password have been created");
		}
	}

}
