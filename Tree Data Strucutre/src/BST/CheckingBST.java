package BST;

public class CheckingBST {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node (int d){
			data=d;
		}
	}
	
	static boolean isBST(Node root) {
		return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	static boolean helper(Node root,int min,int max) {
		if(root==null) return true;
		if(root.data<min || root.data>max) return false;
		
		return (helper(root.left,min,root.data) && helper(root.right,root.data,max));
	}
	
	public static void main(String[] args) {
		root=new Node (11);
		root.left= new Node(8);
		root.left.left=new Node(6);
		root.left.right=new Node(9);
		root.right=new Node(16);
		root.right.left=new Node(12);
		root.right.right=new Node(18);
		
		System.out.print(isBST(root));
	}
    
}
