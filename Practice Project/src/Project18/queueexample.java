package Project18;

import java.util.*;

public class queueexample {
	public static void main(String[] args) {
		Queue<String> employeeQueue = new LinkedList<>();
		employeeQueue.add("Kamal");
		employeeQueue.add("Parthi");
		employeeQueue.add("Dinesh");
		employeeQueue.add("Gokul");
		employeeQueue.add("Ram");
		System.out.println("Queue is : " + employeeQueue);
		System.out.println("Head of Queue : " + employeeQueue.peek());
		employeeQueue.remove();
		System.out.println("After removing Head of Queue : " +employeeQueue);
		System.out.println("Size of Queue : " +employeeQueue.size());
	}

}
