package tree_basic;


public class PathWithSumValueK {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node (int d){
			data =d;
		}
	}
	
	public static boolean checkSum(Node root,int sum) {
		if(root==null) return false;
		if(root.left==null && root.right==null && sum==root.data) return true;
		
		return (checkSum(root.left,sum-root.data) || checkSum(root.right,sum-root.data));
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
			System.out.println(checkSum(root,42));
	}

}
