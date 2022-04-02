package BST;

import BST.CheckingBST.Node;

public class BST2DLL {
	static Node root,prev=null,head;
	static class Node{
		int data;
		Node left,right;
		Node (int d){
			data=d;
		}
	}
	
	static void bst2dll(Node root) {
		if(root==null) return ;
		bst2dll(root.left);
		if(prev==null)head= root;
		else {
			root.left=prev;
			prev.right=root;
		} prev=root;
		bst2dll(root.right);
		
	}
	
	static void traverse(Node head) {
		if(head==null) return;
		while(head!=null) {
			System.out.print(head.data +" ");
			head=head.right;
		}
	}
	public static void main(String [] args) {
		root=new Node (11);
		root.left= new Node(8);
		root.left.left=new Node(6);
		root.left.right=new Node(9);
		root.right=new Node(16);
		root.right.left=new Node(12);
		root.right.right=new Node(18);
		bst2dll(root);
		traverse(head);
	}

}
