package BST;

public class SortedArraytoBST {
	static Node root,prev=null;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	public static int [] arr= {1,2,3,4,5,6,7,8,9};
	
	static Node makeBST(int [] arr,int start,int end) {
		Node newNode;
		if(start>end) return null;
		int mid=start+(end-start)/2;
		newNode=new Node(arr[mid]);
		newNode.left=makeBST(arr,start,mid-1);
		newNode.right=makeBST(arr,mid+1,end);
		return newNode;
		
	}

	static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public static void main(String[] args) {
		int l=arr.length;
		root=makeBST(arr,0,l-1);
		System.out.println("-----");
		inorder(root);
		System.out.println("\n-----");
	}
}
