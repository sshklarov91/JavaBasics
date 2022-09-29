package ReviewClass;

import java.util.Arrays;

public class ArrayDemo04 {

	public static void main(String[] args) {
		//creates an array store elements in array
		// then with the help with another array adds all the elements
		int size=10;
		int[] arr=new int[10];
		int start=11;
		for (int i=0; i<arr.length;i++) {
			arr[i]=start;
			start--;
			
		}
		System.out.println(Arrays.toString(arr));
		//enhanced for loop
		int sum = 0;
		for(int num:arr){
			sum=sum+num;
		}
		System.out.println(sum);
	}


	}


