package Project17;
import java.util.*;
abstract class Shape{  
	abstract void draw();  
	}  
class Rectangle extends Shape{  
	void draw(){System.out.println("drawing rectangle");}  
		
}  
class Circle1 extends Shape{  
	void draw(){System.out.println("drawing circle");}  
	}  
public class abstraction {

	public static void main(String[] args) {
			Shape s=new Circle1();
			s.draw();  
			Shape g=new Rectangle();
			g.draw();
			}  
			 

	

}
