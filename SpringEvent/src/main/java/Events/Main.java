package Events;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {
		   ClassPathXmlApplicationContext context = 
	         new ClassPathXmlApplicationContext("application.xml");

	      // Let us raise a start event.
	      context.start();
	    
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();

	      // Let us raise a stop event.
	      context.stop();
	   }
}
