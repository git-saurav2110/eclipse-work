package BST;

public class SortedllToBST {
	static Lnode head;
	static class Lnode{
		int data;
		Lnode next;
		Lnode(int d){
			data=d;
		}
	}
	
	//static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	static Lnode findMid(Lnode start, Lnode end) {
		Lnode slow=start;Lnode fast=start;
		if(slow==null ) return null;
		while(fast!=end && fast.next!=end) {
			slow=slow.next;
			fast=fast.next.next;
		} return slow;
	}
	static Node constructBST(Lnode start,Lnode end ) {
		if(start==null || start==end) return null;
		Lnode mid=findMid(start,end);
		Node root;
		root=new Node (mid.data);
		root.left=constructBST(start,mid);
		root.right=constructBST(mid.next,end);
		return root;
	}
	
	static Node sllToBST(Lnode head) {
		if(head==null ) return null;
		return constructBST(head,null);
		
	}
	
	public static void main(String[] args) {
		head=new Lnode(1);
		head.next=new Lnode(2);
		head.next.next=new Lnode(3);
		head.next.next.next=new Lnode(4);
		head.next.next.next.next=new Lnode(5);
		head.next.next.next.next.next=new Lnode(6);
		head.next.next.next.next.next.next=new Lnode(7);
		Node root=sllToBST(head);
		inorder(root);
	}

}
