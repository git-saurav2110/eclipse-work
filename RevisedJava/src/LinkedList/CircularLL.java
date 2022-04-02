package LinkedList;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class CircularLL {

	static Node push(Node head_ref,int data) {
		Node temp=head_ref; 
		Node new_node=new Node (data);
		if(head_ref==null) {
			
			new_node.next=new_node;
			return new_node;
		}
		if(head_ref!=null) {
			Node ptr=temp;
			while(ptr.next!=temp) {
				ptr=ptr.next;
			}
			ptr.next=new_node;
			new_node.next=temp;
			return new_node;
			
		}
		System.out.println("-------------------");
		return head_ref;
	}
	
	static void print(Node head) {
		Node temp=head;
		while(head.next!=temp) {
			System.out.print(" "+ head.data);
			head=head.next;
		}
		System.out.print(" " +head.data);
	}
	public static void main(String[] args) {
		Node head=null;
		head=push(head,12);
		head=push(head,15);
		head=push(head,16);
		head=push(head,17);
		head=push(head,18);
		
		print(head);
		
		
		
	}
}
