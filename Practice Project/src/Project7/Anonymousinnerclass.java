package Project7;
import java.util.*;

abstract class AnonymousInnerClass {
	   public abstract void display();
	}
public class Anonymousinnerclass {
		public static class innerclass {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}


}
