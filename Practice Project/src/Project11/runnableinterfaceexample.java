package Project11;
class MyNewThread implements Runnable{

	@Override
	public void run() {
		System.out.println("New Thread");
		
	}
	
}
public class runnableinterfaceexample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Main Method start");
			Thread t=new Thread(new MyNewThread())	;
			
			t.start();
			
			System.out.println("Main Method Stop");
			
		}

	}


