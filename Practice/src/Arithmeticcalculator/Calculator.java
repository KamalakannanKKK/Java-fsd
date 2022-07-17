package Arithmeticcalculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number of operands");
	    int count=sc.nextInt();
	    System.out.println("Enter the 1st Operand");
	    double result=sc.nextDouble();
	    for(int i=1;i<count;i++)
	    {
	    	System.out.println("Enter the "+ (i+1)+" Operand");
	    	double b=sc.nextDouble();
	    	System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
	    	System.out.println("Enter the number in which operation has to perform between these operands");
	    	int h=sc.nextInt();
	    	switch(h) {
	    	case 1:
	    		result=result+b;
	    		break;
	    	case 2:
	    		result=result-b;
	    		break;
	    	case 3:
	    		result=result*b;
	    		break;
	    	case 4:
	    		result=result/b;
	    		break;
	    	default:
	    		System.out.println("Invalid Operation and Restart the code again & if continue ,the result start from 0 ");
	    	    result=0;
	    	}
	    }
	    System.out.println("\nThe Result is "+result);

	}

}
