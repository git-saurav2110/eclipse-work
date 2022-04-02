package tree_basic;
import java.util.*;
public class DeletionOfANode {
	static Node root;
	static Stack<Integer> s=new Stack<Integer>();
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static void inorder(Node root) {
		Node temp=root;
		if(temp==null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	
	static void preorder(Node root) {
		Node temp=root;
		if(temp!=null) {
			System.out.print(temp.data+" ");
			preorder(temp.left);
			preorder(temp.right);
		}
	}
	
	static void postOrder(Node root) {
		Node temp=root;
		if(temp!=null) {
			postOrder(temp.left);
			postOrder(temp.right);
			System.out.print(temp.data+" ");
			
		}
	}
	
	
	static void levelOrder(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		Node temp=root;
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.poll();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
			System.out.print(temp.data+" ");
			s.add(temp.data);
		}
		System.out.println();
	}

	
	
	//finding Maximum in Binary tree
	static void maxInBinaryTree(Node root) {
		Node temp=root;
		levelOrder(temp);
		int max=Integer.MIN_VALUE;
		while(!s.isEmpty()) {
			if(max<s.peek()) {
				max=s.pop();
			}
			else s.pop();
		}
		System.out.println(max);
	}
	
	//Deletion of tree
	
	static void delete(Node root) {
		Node temp=root;
		root=null;
		return;
	}
	
	// Size of Tree
	
	static int size(Node root) {
		Node temp=root;
		int left=root.left==null?0:size(root.left);
		int right=root.right==null? 0 :size(root.right);
		return 1+left+right;
	}

	// Height of tree
	
	static int height(Node root) {
		Node temp=root;
		if(temp==null)
			return 0;
		
			int left_height=height(temp.left);
			int right_height=height(temp.right);
			
			return (left_height>right_height)? left_height+1: right_height+1;
		
	}

	public static void main(String [] args) {
		root=new Node(13);
		root.left=new Node(12);
		root.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(19);
		root.right.right=new Node(9);
		root.right.left=new Node(16);
		System.out.println("-------Level order---------");
		levelOrder(root);
		System.out.println("-------inorder---------");
		inorder(root);
		System.out.println("\n-------preorder---------");
		preorder(root);
		System.out.println("\n-------postOrder---------");
		postOrder(root);
		System.out.println("\n-------Maximum In Binary Tree---------");
		maxInBinaryTree( root);
		System.out.println("---------------Deletion of tree----------");
		delete(root);
		System.out.println("-------inorder (After tree deletion)---------");
		inorder(root);
		System.out.println("\n--------size of tree---------");
		System.out.println(size(root));
		System.out.println("\n--------height of tree---------");
		System.out.print(height(root));
		

	}

}
