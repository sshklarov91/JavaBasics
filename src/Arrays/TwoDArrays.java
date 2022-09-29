package Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		
		String [][] bigArray=new String[3][4];
		bigArray[0][0]="Mr";
		bigArray[0][1]="Mrs";
		bigArray[0][2]="Ms";
		bigArray[0][3]="Miss";
		bigArray[1][0]="Smith";
		bigArray[1][1]="Jordan";
		bigArray[1][2]="Jackson";
		bigArray[1][3]="Obama";
		
		System.out.println(bigArray[0][1] +" "+  bigArray[1][0]);
		System.out.println(bigArray[0][0] +" "+  bigArray[1][3]);
		System.out.println(bigArray[0][2] +" "+  bigArray[1][2]);
		System.out.println(bigArray[0][3] +" "+  bigArray[1][1]);
		
		System.out.println("---------------------");

		String[][] arr= {
				  {"Smith","Jordan","Jackson","Obama"},
				  {"A","B","C","D"},
				};
		System.out.println(arr[0][0] +" has a grade of "+  arr[1][0]);
		System.out.println(arr[0][1] +" has a grade of "+  arr[1][1]);
		System.out.println(arr[0][2] +" has a grade of "+  arr[1][2]);
		System.out.println(arr[0][3] +" has a grade of "+  arr[1][3]);
	}
}

