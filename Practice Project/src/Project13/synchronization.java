package Project13;

class Table1{

  void printTable(int n, Thread t){
  
	  synchronized(this) {  
	System.out.println("Thread id="+t.getId());
     for(int i=1;i<=5;i++){
      System.out.println(n*i);
      try{
       Thread.sleep(400);
      }catch(Exception e){System.out.println(e);}
     }
	 }//end block
	 
	 
   System.out.println("Square of a number="+ n*n+ " id="+ t.getId());
 }//end of the method
}
 
class MyThread extends Thread{
	Table1 t;
	MyThread(Table1 t){
	this.t=t;
	}

	public void run(){
	t.printTable(2,this);
	}

}

class MyThread2 extends Thread{
	Table1 t;
	MyThread2(Table1 t){
	this.t=t;
	}
	public void run(){
	t.printTable(10,this);
	}
}
public class synchronization {


	
	public static void main(String args[]){
	Table1 obj = new Table1();//only one object
	MyThread t1=new MyThread(obj);
	MyThread2 t2=new MyThread2(obj);
	t1.start();
	t2.start();
	}
	

}
