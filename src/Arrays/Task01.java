package Arrays;

public class Task01 {

	public static void main(String[] args) {
	
		char [] letter=new char[6];
		letter[0]='A';
		letter[1]='B';
		letter[2]='C';
		letter[3]='D';
		letter[4]='E';
		letter[5]='F';
		int size=letter.length;
		
		System.out.println(letter[1]);

		
		char [] letters= {'A','B','C','D','E','F'};
		System.out.println(letters[1]);
		
		String [] names=new String[3];
		names[0]="Sergey";
		names[1]="Asma";
		names[2]="Athira";
	
		System.out.println(names[1]);
		
		String [] names1= {"Sergey","Asma","Athira",};
		System.out.println(names1[2]);
		
		String [] words= {"Java","Saturday","Day","Coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		

	}

}
