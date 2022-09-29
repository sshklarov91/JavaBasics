package GroupProject;

public class Pro03 {

	public static void main(String[] args) {
		
		int[][] a = {
		        {1,1}, 
		        {3,1}, 
		        {3,5}, 
		        {0,1}  
		    };
		    
		    for (int i=0; i<a.length;i++){
		    	 int sum = 0;
		      for (int j=0;j<a[i].length;j++){
		        sum+=a[i][j];
}

		    System.out.println("Sum is: "+sum);
	
}
}
}
