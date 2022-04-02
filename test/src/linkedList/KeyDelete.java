package linkedList;

public class KeyDelete {
	node head;
	static class node{
		int data;
		node next;
		node(int d)
		{
			data=d;
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
	public void push(int data) {
		node n=head;
		node new_node=new node(data);
		if(n==null)
		{
			head=new_node;
			new_node.next=null;
			return;
		}
		if(n!=null)
		{
			new_node.next=n;
			head=new_node;
		}
		
	}
	public void key(int Key) {
		node n=head;
		node temp=null;
		if(n==null)
			{
			   System.out.println("linked list is empty.  ");
			   return;
			}
		while(n!=null)
		{
		  if(n==head && n.data==Key)
		  {
			 n=n.next;
			 head.next=null;
			 head=n;
			 
		  }
		  if(n==head && n.data!=Key)
		  {
			  temp=head;
			  n=n.next;
			  
		  }
		 
		  if(n!=head && n.data!=Key)
		  {
			  temp=n;
			 n=n.next;
			 
			 
		  }
		  if(n!=head && n.data==Key)
		  {
			  temp.next=n.next;
			  n.next=temp.next;
			  
		  }
		  if(n.next!=null) {
		  temp=n;
		  n=n.next;
		  break;
		  }
		  if(n.next==null && n.data==Key)
		  {
			  temp.next=null;
			  break;
		  }
		  
		  
		}
	}
	public static void main(String[] args)
	{
		KeyDelete llist=new KeyDelete();
		llist.push(17);
		llist.push(13);
		llist.push(15);
		llist.push(16);
		llist.push(112);
		llist.printlist();
		System.out.println();
		System.out.println("---------------------------");
		llist.key(17);
		llist.printlist();
	}

}
