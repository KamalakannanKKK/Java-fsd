package Project18;

public class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int k){
			data=k;
			next=null;
			prev=null;
		}
	}
	public static void main(String[] args) {
				Doublylinkedlist L=new Doublylinkedlist();
			
				L.insert(8);
				L.insert(9);
				L.insert(10);
				L.insert(4);
				L.display();
				System.out.println("\n");
				L.displayrev();
				L.insertat(89,3);
				L.display();
				System.out.println("\n");
				L.displayrev();
				L.deleteat(2);
				L.display();
			}
			public void insert(int k) {
				Node new_node=new Node(k);
				if(head==null) {
					head=new_node;
					tail=new_node;
				}
				else {
					head.prev=new_node;
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
			public void displayrev() {
				Node temp=tail;
				while(temp!=null) {
					System.out.print(temp.data+"  ");
					temp=temp.prev;
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
				n.prev=temp;
				if(temp==tail) {
					tail=n;
				}
				else {
				temp.next.prev=n;
				temp.next=n;
				}
			}

		


	

}
