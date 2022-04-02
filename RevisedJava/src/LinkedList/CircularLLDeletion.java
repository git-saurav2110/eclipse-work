package LinkedList;


public class CircularLLDeletion {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	static Node last=null;static Node head=null;
	static Node push(Node head,int d) {
		Node new_node =new Node(d);
		Node temp=head;
		if(head==null) {
			new_node.next=new_node;
			last=new_node;
			return new_node;
		}
		if(head!=null) {
			new_node.next=head;
			head=new_node;
			last.next=head;
			return head;
		}
		return head;
	}
	static void printCLL(Node head) {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		
		head=push(head,18);
		head=push(head,17);
		head=push(head,16);
		head=push(head,15);
		head=push(head,14);
		
		printCLL(head);
		
		head=delete(head,14);
		System.out.println("deleted number ::: \n");
		printCLL(head);
		
	}
	
	static Node delete(Node head,int key) {
		if(head==null) return head;
		if(head!=null) {
			Node temp=head;
			if(head.data==key) {
				head=head.next;
				last.next=head;
				return head;
			}
			Node curr=head,prev=null;
			while(curr.data!=key) {
				prev=curr;
				curr=curr.next;
			}
			prev.next=curr.next;
			curr.next=null;
			
		}
		return head;
	}
}
