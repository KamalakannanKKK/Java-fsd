package Project12;
class MyOwnThread1 extends Thread{
	public void run(){
		
		for(int count=1; count<=3;count++){
			System.out.println("Hello All!!!");
			try {
				Thread.sleep(3000);
				// sleep is static method 
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}

}
public class sleepandwait {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
				MyOwnThread1 obj=new MyOwnThread1();
				obj.start();
				System.out.println("Main thread");
				obj.wait(1000);
		}
		

	}


