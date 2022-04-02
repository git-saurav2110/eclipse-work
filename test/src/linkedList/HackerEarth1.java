package linkedList;
import java.util.Scanner;

public class HackerEarth1 {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
		}
	}
	public void append(int data) {
	  node n=head;
	  node new_node=new node(data);
	  if(n==null) {
		  head=new_node;
		  return;
	  }
	 while(n.next!=null) {
		 n=n.next;
	 }
	 n.next=new_node;
	 new_node.next=null;
	}
	public void printlist() {
		node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public void push(int data) {
		node n=head;
		node new_node =new node(data);
		if(n==null) {
			head=new_node;
			return;
		}
		new_node.next=head;
		head=new_node;
		return;
	}
	
	public void revList() {
		node prev=null,curr=head,nextptr=null;
		HackerEarth1 templist=new HackerEarth1();
		while(curr!=null) 
		{
			nextptr=curr.next;
			while(curr.data%2==0 && curr.next.data%2==0)
			{
				
				templist.push(curr.data);
				curr=curr.next;
				if(curr.next.data%2!=0 || curr.next==null)
					{
					   templist.push(curr.data);
					   prev.next=templist.head;
					   node n=templist.head;
					   while(n.next!=null) {
						   n=n.next;
					   }
					   n.next=curr.next;
					  // templist.head.next=null;
					   
					}
				
			}
			prev=curr;
			curr=curr.next;
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HackerEarth1 llist=new HackerEarth1();
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int data=sc.nextInt();
			llist.append(data);
		}
		
		llist.printlist();
		llist.revList();
		System.out.println("output is:--");
		llist.printlist();
	
	}

}
