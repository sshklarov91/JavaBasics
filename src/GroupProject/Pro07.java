package GroupProject;

public class Pro07 {

	public static void main(String[] args) {
		int input = 47;
	      System.out.println("The number is " +input);
	      boolean isprime = false;
	      for (int i = 2; i <= input / 2; ++i) {
	         if (input % i == 0) {
	            isprime = true;
	            break;
	         }
	      }
	      if (!isprime)
	         System.out.println("The number " +input + " is a prime number.");
	      else
	         System.out.println("The number " +input + " is not a prime number.");
	   }
}


