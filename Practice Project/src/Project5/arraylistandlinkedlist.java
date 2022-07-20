package Project5;
import java.util.*;
public class arraylistandlinkedlist {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        //arraylist
			ArrayList<String> students=new ArrayList<String>();   
		      students.add("kamal");//
		      students.add("kannan"); 
		      students.add("loki"); 
		      System.out.print("ArrayList\n");
		      System.out.println(students);  
		      students.remove("kannan");
		      System.out.println(students+"\n"); 
		    //linkedlist
		      LinkedList<String> al=new LinkedList<String>();  
			  al.add("Ravi");  
			  al.add("Vijay");  
			  al.add("Ravi");  
			  al.add("Ajay");  
			  System.out.print("LinkedList\n");
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  
			  //Hashset
			  HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(140);  
		       set.add(185);  
		       set.add(198);
		       set.add(140);
		       System.out.println("hashset");
		       System.out.println(set);
		       
		       //Linkedhashset
		       LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();  
		       s2.add(19);  
		       s2.add(17);  
		       s2.add(10);
		       s2.add(17);	
		       System.out.println("LinkedHashset");
		       System.out.println(s2);
		      	} 


			 }  


		

	



