package avlTree;

import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionAVL {
	static  Node root=null;
	static class Node{
		int data,height;
		Node left,right;
		Node(int d){
			data=d;
			height=1;
		}
	}
	static int height(Node n) {
		if(n==null) return 0;
		return n.height;
	}
	static Node leftRotate(Node x) {
		Node y=x.right;
		Node temp=y.left;
		y.left=x;
		x.right=temp;
 
		x.height=Math.max(height(x.left), height(x.right))+1;
		y.height=Math.max(height(y.left),height(y.right))+1;
 
		return y;
	}
	static Node rightRotate(Node y) {
		Node x=y.left;
		Node temp=x.right;
		x.right=y;
		y.left=temp;
 
		x.height=Math.max(height(x.left), height(x.right))+1;
		y.height=Math.max(height(y.left), height(y.right))+1;
 
		return x;
	}
	static int getBalance(Node n) {
		if(n==null) return 0;
		return height(n.left)-height(n.right);
	}
	static Node insert(Node node,int k) {
		if(node==null) {
			node=new Node (k);
			return node;
		}
		else if(node.data<k) {
			node.right=insert(node.right,k);
		} else if(node.data>k) {
			node.left=insert(node.left,k);
		} 
		node.height=1+Math.max(height(node.left),height(node.right));
 
		int balance =getBalance(node);
 
		if(balance>1 && k<node.left.data) {
			return rightRotate(node);
		} else if(balance<-1 && k>node.right.data) {
			return leftRotate(node);
		} else if(balance>1 && k<node.left.data) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		} else if(balance < -1 && k < node.right.data) {
			node.right=rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}
 
 
	static void inorder(Node temp) {
		if(temp!=null) {
			inorder(temp.left);
			System.out.print(temp.data+" ");
			inorder(temp.right);
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();Node temp = null;
		while(T>0) {
			int k=sc.nextInt();
		    root=insert(root,k);
		   // System.out.println("--"+root.data);
		    T--;
		}
		inorder(root);
	}
 
}