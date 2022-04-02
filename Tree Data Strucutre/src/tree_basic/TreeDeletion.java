package tree_basic;
import java.util.*;

import tree_basic.HeightOfTree.Node;

public class TreeDeletion {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}	
	}
	
	static void inorder(Node root)
	{
		Node temp=root;
		if(temp==null) return;
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	static void deletedeep() 
	{
		Node temp=root;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);	
		while(!q.isEmpty())
		{
			temp=q.poll();
			if(temp==null) return;
			if(temp.left!=null) q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);	
		}
		temp=null;
	}
	
	static void delete(Node root,int data) {
		Node temp=root;
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		Node deletingData = null;
		while(!q.isEmpty()) {
			temp=q.poll();
			if(temp.data==data) {
				deletingData=temp;
			}
			if(temp.left!=null) q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);
			
		}
		if(deletingData!=null)
		{
			deletingData.data=temp.data;
			deletedeep();
		}
		
		
	}
	public static void main(String[] args) {
		    root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			inorder(root);
			delete(root,0);
			System.out.println();
			inorder(root);
	}

}
