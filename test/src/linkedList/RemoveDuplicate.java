package linkedList;

public class RemoveDuplicate {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
		}
	}
	void push(int data) {
	    node new_node=new node(data);
	    node ref=head;
	    if(ref==null) {
	    	head=new_node;
	    	return;
	    }
	    new_node.next=head;
	    head=new_node;
	    return;
	}
	void remove() {
		node mainptr=head;
		node refptr=head;
		while(mainptr!=null) {
			//refptr=mainptr.next;
			if(mainptr.data==mainptr.next.data) {
				mainptr.next=mainptr.next.next;
				//refptr=refptr.next;
			}
			else {
			mainptr=mainptr.next;
			
			}
		}
	}
	void printlist() {
		node n=head;
		while(n!=null) {
			System.out.print(n.data+"-->");
		     n=n.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		RemoveDuplicate llist=new RemoveDuplicate();
		llist.push(16);
		llist.push(15);
		llist.push(14);
		llist.push(14);
		llist.push(12);
		llist.push(11);
		llist.printlist();
		llist.remove();
		llist.printlist();
	}
           

}
