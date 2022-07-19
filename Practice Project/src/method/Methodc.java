package method;
class A{
	static int add(int a,int b) {
		int c=a+b;
		return c;
	
	}
	//method overloading
    static int add(int a,int b,int c) {
		int d=a+b+c;
		return d;
	}
	 
}
public class Methodc {

	public static void main(String[] args) {
		A obj=new A();
		int h=A.add(53,65);
		System.out.println("Method Answer"+h);
		int g=A.add(9087,67,45);
		System.out.println("Method overloading"+g);
	}

}
