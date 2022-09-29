package GroupProject;

public class Pro05 {

	public static void main(String[] args) {
		
			int[][] arr = { { 1, 4, 5, 8, 9, }, { 2, 3, 6, 7, 10 } };
			int oddsum=0;
			int evensum = 0;
			for (int i = 0; i < arr.length; i++) 
				for (int j = 0; j < arr[i].length; j++) 
				
					if (arr[i][j] % 2 == 0)
						oddsum+=arr[i][j];

					else if (arr[i][j]%2 !=0)
				evensum+=arr[i][j];
			
						System.out.println(evensum);
						System.out.println(oddsum);
					
					
}
}					


					

	
