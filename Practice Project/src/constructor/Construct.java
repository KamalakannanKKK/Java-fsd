package constructor;
class A{
	int i;
    String a;
     A(int i,String a) {
    	this.i=i;
    	this.a=a;}
     void test() {
    	System.out.println("The  student id "+i+"and name is "+a);
    }
}

public class Construct {

	public static void main(String[] args) {
	        A obj=new A(1,"kamal");
	        obj.test();
	        A obje=new A(5, "raj");
	        obje.test();

	}

}
