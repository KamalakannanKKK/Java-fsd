package Project8;
import java.util.*;
public class stringexample {
	public static void main(String[] args) {
	String s=new String("Hello World");
	System.out.print(s.length());

	//substring
	String sub=new String("knowledge");
	System.out.println(sub.substring(2));

	//String Comparison
	String s1="Hellen";
	String s2="Hellon";
	System.out.println(s1.compareTo(s2));

	

	//equals
	String x="knowledge power";
	String y="Knowledge Power";
	System.out.println(x.equals(y));

	}

}
