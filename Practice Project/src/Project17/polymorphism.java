package Project17;
import java.util.*;
//area and perimeter for square and rectangle
class area{
	public int  area(int a ) {
		return a*a;
	}
	public int area(int l,int b) {
		return l*b;
	}
	public int perimeter(int a) {
		return 4*a;
	}
	public int perimeter(int l,int b) {
		return 2*(l+b);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		area a =new area();
		System.out.println(a.area(3));
		System.out.println(a.perimeter(3));
		System.out.println(a.area(2,3));
		System.out.println(a.perimeter(2,3));
		

	}

}
