package Project18;
import java.util.*;
public class multiplymatrix {
	
	public static void main(String[] args) 
	{
	       		int r1 = 2, c1 = 3;
	        		int r2 = 3, c2 = 2;
	        		int[][] fM = { {9, -2, 5}, {35, 9, 4} };
	        		int[][] sM = { {2, 9}, {-9, 0}, {0, 4} };
	int[][] product = mul(fM, sM, r1, c1, c2);
	displayProduct(product);
	    	}

	public static int[][] mul(int[][] fM, int[][] sM, int r1, int c1, int c2) 
	{
	        		int[][] product = new int[r1][c2];
	        		for(int i = 0; i < r1; i++) 
	{
	            			for (int j = 0; j < c2; j++) 
	{
	                			for (int k = 0; k < c1; k++) 
	{
	                    				product[i][j] += fM[i][k] * sM[k][j];
	                			}
	            			}
	       	 	}
	return product;
	    	}
	public static void displayProduct(int[][] product) 
	{
	        		System.out.println("Product is: ");
	        		for(int[] row : product) 
	{
	            			for (int column : row) 
	{
	                			System.out.print(column + "    ");
	            			}
	            			System.out.println();
	        		}
	    	}
	}


