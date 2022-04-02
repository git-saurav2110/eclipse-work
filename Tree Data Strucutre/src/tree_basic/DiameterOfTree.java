package tree_basic;

public class DiameterOfTree {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	static int height(Node node) {
		Node temp=node;
		if(temp==null) return 0;
		int l=height(temp.left);
		int r=height(temp.right);
		return (l>r)? l+1:r+1;
		
	}
	static int diameter(Node root) {
		Node temp=root;
		if(temp==null) {
			 return 0;
		}
		int l=height(temp.left);
		int r=height(temp.right);
		
		int dl=diameter(temp.left);
		int dr=diameter(temp.right);
		
		return Math.max(l+r+1,Math.max(dl,dr));
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
			System.out.print(diameter(root));
	}
}
