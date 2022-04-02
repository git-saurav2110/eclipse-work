package linkedList;

public class ReverseList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	public void push(int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
		
	}
	public void reverse() {
		Node prev=null,curr=head,nxt=null;
		if(curr==null)return;
		while(curr!=null ) {
			nxt=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
			//nxt=nxt.next;
		}
		head=prev;
		return;
	}
	public void printlist() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ReverseList llist=new ReverseList();
		llist.push(16);
		llist.push(15);
		llist.push(14);
		llist.push(13);
		llist.printlist();
		llist.reverse();
		System.out.print("Reverse List :");
		llist.printlist();
	}

}
