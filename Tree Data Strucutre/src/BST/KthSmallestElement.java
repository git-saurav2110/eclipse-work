package BST;

import java.util.Scanner;

public class KthSmallestElement {
	static Node root;
	static int count =0;
	static class Node {
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	static Node build(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data>root.data) {
			root.right=build(root.right,data);
		} else if(data<root.data) {
			root.left=build(root.left,data);
		}
		return root;
	}
	static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	static Node print(Node root,int k) {
		if(root==null) return null;
		Node left =print(root.left,k);
		if(left!=null) return left;
		count++;
		if(count==k)
			return root;
		return print(root.right,k);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int k=sc.nextInt();
			build(root,k);
		}
		inorder(root);
		int k=sc.nextInt();
		Node temp=print(root,k);
		System.out.println(temp.data);
		
	}

}
