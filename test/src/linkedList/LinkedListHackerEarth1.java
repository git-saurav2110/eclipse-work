package linkedList;

//import linkedList.LinkedList.node;

	


public class LinkedListHackerEarth1 {
	node head;
	static class node
	{
		int data;
		node next;
		node(int d){
			data=d;
		}
	}
	public void printList() {
		node n=head;
		while(n!=null) {
			System.out.print(n.data+"---");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListHackerEarth1 llist=new LinkedListHackerEarth1();
		llist.head=new node(1);
		node second=new node(2);
		node third =new node(3);
		llist.head.next=second;
		second.next=third;
		llist.printList();
		
	}

}

