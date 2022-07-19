package Project2;
import Protectedaccess.*;
import publicaccess.*;
//Private class
class A{
		private static void test() {
			System.out.println("private class");
		}
	}
class B{
	static void test() {
		 System.out.println("Default class");
	}
}

public class accessspecifier  extends protectedc{

	public static void main(String[] args) {
		
         A obj=new A();
         //A.test();Private class cannot able to access
         B ob =new B();
         B.test();
         //Default class can able to access
         protectedc.k();
         //protected class
         publicc obje=new publicc();
         publicc.test();
	} 

}
