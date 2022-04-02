package tree_basic;
import java.util.*;

import tree_basic.DeletionOfANode.Node;

public class SearchingAnElement {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static boolean searchInBt(Node root,int data) {
		Node temp=root;
		if(temp==null) return false;
		if(temp.data==data)
			return true;
		return (searchInBt(temp.left,data) || searchInBt(temp.right,data));
	}
	
	static boolean search(Node root,int data) {
		Node temp=root;
		Queue<Node> q=new LinkedList<>();
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.peek();
			q.poll();
			if(temp!=null) {
				if(temp.data==data) return true;
				if(temp.left!=null) q.add(temp.left);
				if(temp.right!=null) q.add(temp.right);
			}
			
		}
		return false;
		
	}
	
	public static void main(String [] args) {
		root=new Node(13);
		root.left=new Node(12);
		root.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(19);
		root.right.right=new Node(9);
		root.right.left=new Node(16);
		System.out.println(" Searching in tree");
		
		System.out.println("Recursive solution ---> "+ searchInBt(root,0));
		System.out.println("Iterative Solution----> "+ search(root,0));
	}

}
