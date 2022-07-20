package Project6;
import java.util.*;
public class mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap
		HashMap<Integer,String> student=new HashMap<Integer,String>();      
	      student.put(8,"Tamil");    
	      student.put(1,"padmaja");    
	      student.put(5,"benita");   
	       
	      System.out.println("\nHashmap  ");  
	      for(Map.Entry d:student.entrySet()){    
	       System.out.println(d.getKey()+" "+d.getValue());  
	       
	      }
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> ob=new TreeMap<Integer,String>();    
	      ob.put(1,"Aravind");    
	      ob.put(6,"Cathorine");    
	      ob.put(10,"Benita");       
	      
	      System.out.println("\nTreeMap");  
	      for(Map.Entry l:ob.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      

	      


	}

}
