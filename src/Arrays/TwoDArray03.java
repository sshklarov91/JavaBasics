package Arrays;

public class TwoDArray03 {
	public static void main(String[] args) {
	
	String[][] arr= {
            {"Yusuf","Hamza","Adam","John"},
            {"A","B","C","D"}
    };
    for(int i=0; i<arr.length; i++) {
        for (int j=0; j<arr[i].length; j++){
            System.out.println( arr[i][j]);
        }
    }
}

}