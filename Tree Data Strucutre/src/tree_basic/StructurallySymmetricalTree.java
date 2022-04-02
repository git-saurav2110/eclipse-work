package tree_basic;

import tree_basic.PrintingLeaves.Node;

public class StructurallySymmetricalTree {
	static Node root,root1;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static boolean structurallySymmetrical(Node root,Node root1) {
		if(root==null && root1==null) return true;
		if(root==null || root1==null) return false;
		return (root.data==root1.data &&(structurallySymmetrical(root.left,root1.right)) && (structurallySymmetrical(root.right,root1.left)));
		
	}
	public static void main(String[] args) {
		    root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			
			    root1=new Node(0);		
				root1.right=new Node(12);
				root1.left=new Node(10);
				root1.right.right=new Node(4);
				root1.right.left=new Node(19);
				root1.left.left=new Node(9);
				root1.left.right=new Node(16);
				
				System.out.println(structurallySymmetrical(root,root1));
			
		
	}

}
