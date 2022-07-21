package Project11;
import java.util.*;
class Test extends Thread{
    public void run(){
        System.out.println("Knowledge");
    }
}
public class threadclass {

	public static void main(String[] args) {

		        Test  t=new Test();
		        t.run();
		        t.start();
		        
		    }
		


	}


