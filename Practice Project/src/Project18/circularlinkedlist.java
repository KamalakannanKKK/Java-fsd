package Project18;

import Project18.Singlylinkedlist.Node;

public class circularlinkedlist {
	Node last=null;
	class Node{
		int data;
		Node next;
		Node (int k){
			data=k;
			next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		circularlinkedlist l=new circularlinkedlist();
		l.insertb(4);
		l.insertb(9);
		l.insertb(10);
		l.display();
		System.out.println("\n");
		l.insertl(6);
		l.display();

	}
	public void insertb(int k) {
		Node n=new Node(k);
		if(last==null) {
			n.next=n;
			last=n;
			
		}
		else {
			n.next=last.next;
			last.next=n.next;
			
		}
	}
	public void insertl(int k) {
		Node n=new Node(k);
		if(last==null) {
			last=n;
			n.next=n;
		}
		else {
			n.next=last.next;
			last.next=n.next;
		}
	}
	public void display() {
		Node temp=last.next;
		do{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}while(temp!=last.next) ;
		
	}


}
