package BST;

import java.util.Scanner;

import BST.InsertionInBST.Node;

public class FloorAndCeil {
	
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	 static Node insert(Node root,int data) {
  	   Node temp=root;
  	   if(temp==null) {
  		   root=new Node(data);
  		   return root;
  	   }
  	   else {
  	   if(root.data<data) {
  		   root.right=insert(root.right,data);
  	   } else if(root.data>data)
  		   root.left=(insert(root.left,data));
  	  
  	   return root;
     }
     }
	static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	static int floor(Node root,int data) {
		if(root==null) return Integer.MAX_VALUE;
		if(root.data==data) return data;
		if(root.data>data) 
			return floor(root.left,data);
		int f=floor(root.right,data);
		return (f<=data)? f:root.data;
	}
	
	static int ceil(Node root,int data) {
		if(root==null) return -1;
		if(root.data==data) return data;
		if(root.data<data)
			return ceil(root.right,data);
		int c=ceil(root.left,data);
		return (c>=data)? c: root.data;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
			int k=sc.nextInt();
			root=insert(root,k);
			T--;
		}
		inorder(root);
		int f=sc.nextInt();
		
		System.out.println(floor(root,f));
		System.out.println(ceil(root,f));
	}

}
