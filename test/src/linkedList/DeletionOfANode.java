package linkedList;

public class DeletionOfANode {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
		}
	}
	public void delete(int posi)
	{
		node n=head;
		node temp;
		int i=1;
	if (posi==1)
		{
		    head=n.next;
			temp=n;
			temp.next=null;
			return;
			
		}
	
		while(i<posi-1)
		{
			n=n.next;
			
			i++;
		}
		temp=n.next;
		n.next=temp.next;
		temp.next=null;
		
	}
	public void printList() {
		node n=head;
		while(n!=null)
		{
			System.out.print(n.data+"---");
			n=n.next;
		}
		
	}
	public static void main(String[] Args) {
		DeletionOfANode dllist=new  DeletionOfANode();
		dllist.head=new node(21);
		node second=new node(13);
		node third=new node(14);
		node forth=new node(15);
		dllist.head.next=second;
		second.next=third;
		third.next=forth;
		dllist.delete(4);
		dllist.printList();
		
		
		
	}

}
