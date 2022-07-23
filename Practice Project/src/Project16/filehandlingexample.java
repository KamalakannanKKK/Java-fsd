package Project16;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class filehandlingexample {

	public static void main(String[] args) throws IOException {
		File f=new File("kamal.txt");
		
			  System.out.println("file is Created") ;
		   
		 
		 //Write in a file
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Text to write on file");
			String s=sc.next();
			FileWriter writer=new FileWriter(f);
		    writer.write(s);
		    writer.close();
		    System.out.println("Succesfullywritten on a File");
		 //read a file
		   Scanner fa=new Scanner(f);
		   while(fa.hasNextLine()) {
			   String h=fa.nextLine();
			   System.out.println("The content in a file is\n"+h);
		   }
		   fa.close();
	           
	    } 
	

	}

		

	


