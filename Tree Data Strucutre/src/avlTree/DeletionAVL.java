package avlTree;

import java.util.Scanner;

public class DeletionAVL {
	static Node root=null;
	static class Node{
		int data,height;
		Node  left,right;
		Node(int d){
			data=d;
			height=1;
		}
	}
	static int height(Node n) {
		if(n==null) return 0;
		return n.height;
	}
	
	static int getBalance(Node root) {
		if(root==null) return 0;
		return height(root.left)-height(root.right);
	}
	static Node leftRotate(Node x) {
		Node y=x.right;
		Node temp=y.left;
		y.left=x;
		x.right=temp;
		
		x.height=Math.max(height(x.left),height(x.right))+1;
		y.height=Math.max(height(y.left),height(y.right))+1;
		
		return y;
	}
	
	static Node rightRotate(Node y) {
		Node x=y.left;
		Node temp=x.right;
		x.right=y;
		y.left=temp;
		
		x.height=Math.max(height(x.left),height(x.right))+1;
		y.height=Math.max(height(y.left),height(y.right))+1;
		
		return x;
	}
	static Node insert(Node node,int k) {
		if(node==null) {
			node=new Node (k);
			return node;
		} if(k<node.data) {
			node.left=insert(node.left,k);
		} else if(k>node.data) {
			node.right=insert(node.right,k);
		} 
		
		node.height=1+Math.max(height(node.left), height(node.right));
		
		int balance=getBalance(node);
		
		if(balance>1 && k<node.left.data) {
			return rightRotate(node);
		} else if(balance<-1 && k>node.right.data) {
			return leftRotate(node);
		}else if( balance >1 && k>node.left.data) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}else if(balance <-1 && k<node.right.data) {
			node.right=rightRotate(node.right);
			return leftRotate(node);
		}
		
		return node;
	}
	static Node getmax(Node n) {
		if(n==null ) return n;
		if(root.right==null) return root;
		return getmax(n.right);
	}
	
	static Node del(Node root,int k) {
		if(root==null) return root;
		if(k>root.data) {
			root.right=del(root.right,k);
		} else if(k<root.data) {
			root.left=del(root.left,k);
		}
		else {
			if(root.left!=null && root.right!=null) {
				Node temp=getmax(root.left);
				root.data=temp.data;
				root.left=del(root.left,root.data);
			}
			else {
				if(root.left==null  || root.right==null) {
					if(root.left==null) {
						root=root.right;
					} else if(root.right==null)root=root.left;
					else root=null;
				}
			}
			
		}
		if(root==null) return root;
		root.height=1+ Math.max(height(root.left),height(root.right));
         
		int balance=getBalance(root);
		
		if(balance>1 && getBalance(root.left)>=0) {
			return rightRotate(root);
		} else if(balance<-1 && getBalance(root.right) <= 0) {
			return leftRotate(root);
		}else if( balance >1 && getBalance(root.left) < 0) {
			root.left=leftRotate(root.left);
			return rightRotate(root);
		}else if(balance <-1 && getBalance(root.right) > 0) {
			root.right=rightRotate(root.right);
			return leftRotate(root);
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
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
			int k=sc.nextInt();
			root=insert(root,k);
			T--;
		}
		inorder(root);
		System.out.println();
		root=del(root,10);
		inorder(root);
		System.out.println("\n-------------");
		inorder(del(root,0));
		
	}

}
