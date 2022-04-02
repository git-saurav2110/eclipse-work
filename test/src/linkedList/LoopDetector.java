package linkedList;

public class LoopDetector {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
		}
	}
	public void push(int data) {
		node new_node=new node(data);
		new_node.next=head;
		head=new_node;
	}
	public void detect() {
		node slow_ptr=head;
		node fast_ptr=head;
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null) {
			
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			while(slow_ptr==fast_ptr) {
				System.out.print("LOOP DETECTED ");
				return;
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		LoopDetector llist=new LoopDetector();
		llist.push(11);
		llist.push(16);
		llist.push(19);
		llist.push(20);
		llist.push(21);
		llist.head.next.next.next.next.next=llist.head;
		llist.detect();
		
	}

}
