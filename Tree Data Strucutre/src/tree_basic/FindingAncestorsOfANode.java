package tree_basic;

import tree_basic.MirrorOfTree.Node;

public class FindingAncestorsOfANode {
	static Node root;
	static  class Node {
		int data;
		Node left,right;
		Node (int d){
			data=d;
			}
	}
	static boolean findingAncestors(Node root,Node data) {
		if(root==null) return false;
		if( root==data || root.left==data ||
				root.right==data || findingAncestors(root.left,data) 
				 || findingAncestors(root.right,data))
		{
			System.out.print(root.data+" ");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		 root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			root.right.left.left=new Node(19);
			findingAncestors(root,root.right.left.left);
	}
}
