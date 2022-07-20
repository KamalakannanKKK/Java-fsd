package validemail;
import java.util.*;
public class Validemail {

	public static void main(String[] args) {
		// Array of  id of Employees
		String[] s= {"kamal@gmail.com","loki@gmail.com","deepu@gmail.com","harsh@yahoo.com","benita@yaahoo.com","harsha@yahoo.com","priya123@gmail.com","John..Doe@yahoo.com"};
		//String getting from the user
		System.out.println(s.length);
		System.out.println("Enter the EmailId\n");
		Scanner sc=new Scanner(System.in);
		String h=sc.next();
		boolean flag=false;
		//search a string
		for(int i=0;i<s.length;i++) {
			if(h.equalsIgnoreCase(s[i])){
			
				 flag=true;
			}

			
		}
	 
        if(flag=false) {
        	System.out.println(h+"  Email ID is not found in Employee ID");
        }
        else {
        	System.out.println(h+"  Email ID is found in Employee ID");
        }
	}

}
