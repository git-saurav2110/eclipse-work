package tree_basic;

import tree_basic.DiameterOfTree.Node;

public class FindingSumOfAllElement {
	static Node root;
	static class Node { 
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	static int sum(Node root) {
		if(root==null) return 0;
		return(root.data+ sum(root.left)+sum(root.right));
	}
	
	public static void main(String[] args) {
		 root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			root.right.left.left=new Node(16);
			System.out.println(sum(root));
	}

}
