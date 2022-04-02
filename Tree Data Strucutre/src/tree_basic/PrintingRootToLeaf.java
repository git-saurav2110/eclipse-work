package tree_basic;


public class PrintingRootToLeaf {

	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	static void printPath(Node root) {
		int[] pathArray=new int[1000];
		printPath(root,pathArray,0);
	}
	static void printPath(Node root,int[] pathArray,int pathlen) {
		if(root==null ) return ;
		pathArray[pathlen]=root.data;
		pathlen++;
		if(root.left==null && root.right==null) {
			print(pathArray,pathlen);
		}
		else {
			printPath(root.left,pathArray,pathlen);
			printPath(root.right,pathArray,pathlen);
		}
	}
	static void print(int [] pathArray,int pathlen ) {
		for(int i=0;i<pathlen;i++) {
			System.out.print(pathArray[i]+" ");
		} System.out.println();
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
			root.right.left.right=new Node(1666);
			printPath(root);
	}

}
