package linkedList;

public class Length {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
		}
	}
	public void push(int data)
	{
		node n=head;
		node new_node=new node(data);
		if(n==null)
		{
			head=new_node;
			return;
		}
		if(n!=null)
		{
			new_node.next=n;
			head=new_node;
		}
	}
	public void printlist()
	{
		node n=head;
		while(n!=null)
		{
			System.out.print(n.data+"--");
			n=n.next;
		}
	}
	public int count()
	{
		int Count=0;
		node n=head;
		if(n==null) return 0;
	    while(n!=null)
	    {
	    	Count++;
	    	n=n.next;
	    	
	    }
	    return Count;
		
	}
	public static void main(String [] args) {
		Length llist=new Length();
		llist.push(14);
		llist.push(13);
		llist.push(12);
		llist.push(19);
		llist.printlist();
		System.out.printf("\nLength of linked list : "+llist.count());
	}

}
