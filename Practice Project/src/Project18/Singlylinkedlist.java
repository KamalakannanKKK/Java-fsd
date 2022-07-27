package Project18;


public class Singlylinkedlist {
	Node head=null;
	class Node{
		int data;
		Node next;
		Node(int k){
			data=k;
			next=null;
		}
	}
	public static void main(String[] args) {
		Singlylinkedlist L=new Singlylinkedlist();
	
		L.insert(8);
		L.insert(9);
		L.insert(10);
		L.insert(4);
		L.display();
		L.insertat(89,2);
		L.display();
		L.deleteat(2);
		L.display();
	}
	public void insert(int k) {
		Node new_node=new Node(k);
		if(head==null) {
			head=new_node;
		}
		else {
			new_node.next=head;
			head=new_node;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
	public void deleteat(int pos) {
		Node temp=head;
		Node prev=null;
		for (int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}
	public void insertat(int k,int pos) {
		if(pos==0) {
		    insert(k);
			return;
		}
		Node n=new Node( k);
		Node temp=head;
		for(int i=1;i<pos;i++) {
		    temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}

}
