package Arrays;

public class HW04 {

	public static void main(String[] args) {

        int[] numbers = new int[]{10,20,30,50};
          
        int largest = 0;
          
        for (int i=0; i < numbers.length ; i++) {
            if(numbers[i]>largest) {
            	largest=numbers[i];
            }
        }
          
        System.out.println("Largest value of array elements is : " + largest);
         
 }
 }


