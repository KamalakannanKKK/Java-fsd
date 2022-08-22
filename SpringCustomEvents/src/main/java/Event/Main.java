package Event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		   public static void main(String[] args) {
			   ClassPathXmlApplicationContext context = 
		         new ClassPathXmlApplicationContext("application.xml");

			   CustomEventPublisher cvp = 
				         (CustomEventPublisher) context.getBean("customEventPublisher");
			   
			   cvp.publish();  
			      cvp.publish();
		   }
}
