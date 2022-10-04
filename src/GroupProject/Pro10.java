package GroupProject;

public class Pro10 {

	public static void main(String[] args) {
		 int[] numbers = {100, 5, 7, 20, 25, 80, 66, 35};
	        int secondLargestNumber = 0;
	        int largestNumber = numbers[0];  //100

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] >= largestNumber) {
	                largestNumber = numbers[i];
	            }
	        }
	        for (int j = 0; j < numbers.length; j++) {
	            if (numbers[j] == largestNumber) {
	                continue;

	            } else if (numbers[j] > secondLargestNumber) {
	                secondLargestNumber = numbers[j];
	            }
	        }
	        System.out.println("The second largest number is " + secondLargestNumber);
	    }
	

	}


