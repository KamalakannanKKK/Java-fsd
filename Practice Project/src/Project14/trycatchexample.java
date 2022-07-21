package Project14;

public class trycatchexample {
	
	    public static void main(String args[]) 
	    {
	        int a = 0;
	        try 
	        {
	            a = 3/a;
	        }
	        catch (ArithmeticException e) 
	        {
	            System.out.println(" Number cant divided by "+a+",rise to exception !"); 
	        }
	        finally 
	        {
	            System.out.println("Number is "+a );
	        }
	    }
	


}
