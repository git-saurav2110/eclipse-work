package tree_basic;
import java.util.*;
public class InsertAnElement {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	
	static void recurInsert(Node root,int key) {
		Node temp=root;
		if(temp==null) {
			root=new Node(key);
			return;
		}
		else {
			insertHelper(temp,key);
		}
	}
	
	static void insertHelper(Node tmp,int key) {
		Node temp=tmp;
		if(temp.data>=key) {
			if(temp.left==null) {
				temp.left=new Node(key);
			}
			else {
				insertHelper(temp.left,key);
			}
		}
		else {
			if(temp.right==null) {
				temp.right=new Node(key);
			}
			else {
				insertHelper(temp.right,key);
			}
		}
	}
	
	static void insert(Node root,int key) {
		Node temp=root;
		Node new_node=new Node(key);
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.peek();
			q.poll();
			if(temp.left!=null) q.add(temp.left);
			else {temp.left=new_node;break;}
			if(temp.right!=null) q.add(temp.right);
			else {temp.right=new_node;break;}
		}
	}
	
	static void inorder(Node root) {
		Node temp=root;
		if(temp!=null) {
			inorder(temp.left);
			System.out.print(temp.data+" ");
			inorder(temp.right);
		}
	}
	
	public static void main(String[] args) {
		root=new Node(13);
		root.left=new Node(12);
		root.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(19);
		root.right.right=new Node(9);
		root.right.left=new Node(16);
		root.left.left.left=new Node(26);
		inorder(root);
		System.out.println();
		System.out.println("--------non recursive approach----------");
		insert(root,32);
		inorder(root);
		System.out.println("\n--------recursive approach----------");
		recurInsert(root,1);
		inorder(root);
	}

}
