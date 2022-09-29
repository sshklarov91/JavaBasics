package GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Pro04 {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 4, 5, 8, 9, }, { 2, 3, 6, 7, 10 } };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
