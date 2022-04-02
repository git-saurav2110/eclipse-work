package linkedList;

public class SwapListNode {
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
		if(head==null) {
			head=new_node;
			return;
		}	
		new_node.next=head;
		head=new_node;
		return;
    }
	public  boolean check(int x) {
		if(head==null)return false;
		node n=head;
		while(n.data!=x) {
			n=n.next;
			if(n.next==null)
			{
				return false;
			}
			
		}
		return true;
		
	}
    public void swapNode(int x,int y) {
    	SwapListNode ll2=new SwapListNode();
    	node ptr1=head,ptr2=null,ptr3=null,ptr5=head;
    	while(ptr5.data!=y)
    	{
    		ptr5=ptr5.next;
    	}
    	ptr5=ptr5.next;
    	System.out.println("+++++"+ptr5.data);
    	while(ptr1.data!=x && ptr1.next!=null&& ptr1!=null)
    	{
    			ptr2=ptr1;
    			ptr1=ptr1.next;
    	}
    	while(ptr1.data!=y&& ptr2!=null && ptr2.next!=null)
    	{
    		ll2.push(ptr1.data);
    		ptr3=ptr1;
    		ptr1=ptr1.next;
    		
    	}
    	if(ptr1.data==y && ptr2!=null && ptr2.next!=null)
    	{
    		ll2.push(ptr1.data);
       		ptr1=ptr1.next;
    		
    	}
    	ptr2.next=ll2.head;
		
    	
    }
    public void printlist() {
    	node n=head;
    	while(n!=null) {
    		System.out.print(n.data+"-->");
    		n=n.next;
    	}
    }
	public static void main(String [] args) {
		SwapListNode ll1=new SwapListNode();
	//	SwapListNode ll2=new SwapListNode();
		ll1.push(19);
		ll1.push(18);
		ll1.push(17);
		ll1.push(16);
		ll1.push(15);
		ll1.push(14);
		ll1.printlist();
		int x=15;
		int y=17;
		if(ll1.check(x)==ll1.check(y))
		{
			ll1.swapNode(15, 17);
			System.out.println();
			ll1.printlist();
		}
		else
			System.out.println("not valid x and y");
	
	
	}

}
