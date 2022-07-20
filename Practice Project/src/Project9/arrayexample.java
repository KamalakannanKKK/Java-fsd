package Project9;

public class arrayexample {

	public static void main(String[] args) {
		// one dimensional array
		int a[]= {13,56,13,89,90,54,34};
		for(int i=0;i<a.length;i++) {
		System.out.println("One dimensional array a: "+a[i]);
		}
		//two dimensional array
		int[][] b = {
	            {90,34,52,14,4}, 
	            {9,8,7} };
	      
	      System.out.println("\nLength of row 2: " + b[1].length);
	      System.out.println("\nLength of row 1: " + b[0].length);
	      for(int i=0;i<b[0].length;i++) {
	    	  for (int j=0;j<b[1].length;j++) {
	  		System.out.println("Two dimensional array a: "+b[i][j]);
	      }
	      }
		}


	

}
