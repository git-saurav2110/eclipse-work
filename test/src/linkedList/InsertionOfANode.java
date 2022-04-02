package linkedList;

//import linkedList.LinkedListHackerEarth1.node;

public class InsertionOfANode {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			this.data=d;
		}
	}
	public node traverse(int position) {
		node prev_node=head;
		int i=1;
		while(i<position-1)
		{
			prev_node=prev_node.next;
			i++;
		}
		return prev_node;
		
	}
	public void push(int data) {
		node new_node=new node(data);
		new_node.next=head;
		head=new_node;
		
	}
	public void append(int data) {
		node new_node=new node(data);
		node n=head;
		if(n==null)
		{
			head=new_node;
			return;
		}
		while(n.next!=null) {
			n=n.next;
		}
		new_node.next=null;
		n.next=new_node;
	}
	public void insert(int data,int pos)
	{
		node n;
		node new_node=new node(data);
		n=traverse(pos);
		new_node.next=n.next;
		n.next=new_node;
		
	}
	public void printList() {
		node n=head;
		while(n!=null) {
			System.out.print(n.data+"---");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		InsertionOfANode llist=new InsertionOfANode();
	    llist.head=new node(13);
		llist.push(12);
		llist.append(14);
		llist.insert(15, 4);
		llist.append(16);
		llist.printList();
		
		
	}

}
