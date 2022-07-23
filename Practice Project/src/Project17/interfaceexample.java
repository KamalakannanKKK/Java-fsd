package Project17;
import java.util.*;
interface A{
	default void show() {
		System.out.println("A  Parent");
	}
}
interface B{
	default void show() {
		System.out.println("B parent");
	}
}
public class interfaceexample implements A,B {
@Override
  public void show() {
	  A.super.show();
	  B.super.show();
}
	public static void main(String[] args) {
		interfaceexample o=new interfaceexample();
		o.show();
		

	}

}
