package tree_basic;
import java.util.*;

public class Tbasic1 {
	static Node root;
	//static Node temp=root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	static void inorder(Node temp) {
		
		if(temp==null) return;
		inorder(temp.left);
		System.out.print(temp.data+"  ");
		inorder(temp.right);
	}
	
	static void insertionOfANode(Node temp,int data) {
		Node new_node=new Node(data);
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.peek();
			q.remove();
			if(temp.left==null) {
				temp.left=new_node;
				break;
			}
			else {
				q.add(temp.left);
			}
			if(temp.right==null) {
				temp.right=new_node;
				break;
			}
			else {
				q.add(temp.right);
			}
			
		}
		
	}
	
	
	
	public static void main(String [] args) {
		Node root= new Node(10);
		root.left=new Node (11);
		root.left.left=new Node(7);
		root.right=new Node(9);
		root.right.right=new Node(8);
		root.right.left=new Node(15);
		System.out.print("before Insertion :");
		inorder(root);
	
		insertionOfANode(root,12);
		System.out.print("\nAfter insertion :");
		inorder(root);
		
		
	}

}
