package Project7;
import java.util.*;
public class innerclass {
 private String k="good programming"; 
	 
	 class Inner{  
	  void test(){System.out.println(k+"and good work");}  
	 }  


	public static void main(String[] args) {

		innerclass obj=new innerclass();
		innerclass.Inner in=obj.new Inner();  
		in.test();  
	}
}




