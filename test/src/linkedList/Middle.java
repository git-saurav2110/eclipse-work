package linkedList;

public class Middle {
	node head;
	static class node{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
		}
	}
	public void push(int data) {
		node n=head;
		node new_node=new node(data);
		if(n==null)
		{
			head=new_node;
			return;
		}
		if(n!=null)
		{
			new_node.next=head;
			head=new_node;
			return;
		}
		
	}
	public void printlist() {
		node n=head;
		while(n!=null)
		  {
				System.out.print(n.data+"--");
				n=n.next;
		  }
	}
	public void middle() {
		node n=head;
		node temp=n;
		while(temp!=null && temp.next!=null )
		{
			n=n.next;
			temp=temp.next.next;
			
			
		}
		System.out.println("middle is :"+n.data);
	}
     public static void main(String[] args) {
    	 Middle llist=new Middle();
    	 llist.push(12);
    	 llist.push(13);
    	 llist.push(14);
    	 llist.push(15);
    	 llist.push(16);
    	 llist.push(17);
    	// llist.push(19);
    	 llist.printlist();
    	 llist.middle();
    	
     }
}
