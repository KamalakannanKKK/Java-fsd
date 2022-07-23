package Project17;
import java.util.*;
 class encaps{
	private String name;
	private int age;
	private int ID;
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public int getID() {
		return  ID;
	} 
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int h) {
		this.age=age;
		
	}
	public void setID(int h) {
		this.ID=ID;
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		encaps a=new encaps();
		a.setage(9);
		a.setname("hariharan");
		a.setID(1234);
		System.out.println("Employee Name : "+a.getname());
		System.out.println("EMployee age : "+a.getage());
		System.out.println("Employee ID :  "+a.getID());
		

	}

}
