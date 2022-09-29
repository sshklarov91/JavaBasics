package Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		String [] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango",};
		
		for(String flavor :iceCream) {
			System.out.println(flavor);
	}
	System.out.println("---------------------------");
	
	char [] letters= {'A','B','C','D','E','F'};
	for(char letter:letters) {
		System.out.println(letter + " ");
		

	}
	System.out.println("---------------------------");
	int [] numbers={12,56,345,1,0,9};
		for(int b = 0;b<numbers.length; b++) {
			System.out.print(numbers[b]+ " ");
			}
		System.out.println();
		for(int num:numbers) {
			System.out.print(num+ " ");
		}
	}
	}
	
	
