package linkedList;

public class NthNodeFromLast {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	void push(int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
		
	}
	public void lastNnode(int n) {
		Node mainptr=head;
		Node refptr=head;
		int count=0;
		while(count<n) {
			if(refptr==null)return;
			refptr=refptr.next;
			count++;
		}
		while(refptr!=null) {
			mainptr=mainptr.next;
			refptr=refptr.next;
		}
		System.out.println(n +" node from last = "+mainptr.data);
		
	}
	public static void main(String[] args) {
		NthNodeFromLast llist=new NthNodeFromLast();
		llist.push(16);
		llist.push(15);
		llist.push(14);
		llist.push(13);
		llist.lastNnode(2);
	}

}
