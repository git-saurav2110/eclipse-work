package revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	static Node head;
	static Node temp=head;
	
	static void makeTree(Node temp,int data) {
		if(temp==null) {
			head=new Node(data);
			return ;
		}
		Node new_node=new Node(data);
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()) {
			Node t=q.poll();
			if(t.left==null) {
				t.left=new_node;
				return;
			}
			else {
				q.add(t.left);
			}
			if(t.right==null) {
				t.right=new_node;
				return;
			}
			else {
				q.add(t.right);
			}
		}
		
	}
	static void inorder(Node head) {
    
		
		if(head==null) return;
		inorder(head.left);
		System.out.print(head.data+" ");
		inorder(head.right);
	}
    
    static void postOrder(Node root) {	
    	if(root!=null) {
    		postOrder(root.left);
    		postOrder(root.right);
    		System.out.print(root.data +" ");
    	}
    }
	
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int n_node=sc.nextInt();
		
		while(n_node>0) {
			int d=sc.nextInt();
			makeTree(head,d);
			n_node--;
		}
		inorder(head);
		System.out.println("size of tree -->"+ size(head));
		printLV(head);
		ArrayList<Node> result=new ArrayList<Node>();
		result=itterPreorder(head);
		System.out.println("result--->");
		for(Node n:result) {
			System.out.print(n.data+" ");
		}
		ArrayList<Node> inorderTraversal=new ArrayList<Node>();
		inorderTraversal=itterInorder(head);
	    System.out.println("itterative INORDER Traversal--->");
		for(Node n:inorderTraversal) {
			System.out.print(n.data+" ");
		}
		System.out.println("Post order traversal");
		postOrder(head);
		ArrayList<Node> postorderTraversal=new ArrayList<Node>();
		postorderTraversal=itterPost(head);
		
		
	}
	static ArrayList<Node> itterPost(Node head){
		ArrayList<Node> arr=new ArrayList<Node>();
		if(head==null) return arr;
		Node currentNode = head;
		boolean check=false;
		while(!check) {
			
		}
	}
	
	
	
	
	
	static ArrayList<Node> itterInorder(Node head){
		ArrayList<Node> arr=new ArrayList<Node>();
		if(head==null) return arr;
		Stack<Node> s=new Stack<Node>();
		Node currentNode=head;
		boolean check=false;
		while(!check) {
			if(currentNode!=null) {
				s.push(currentNode);
				currentNode=currentNode.left;
			}
			else {
				if(s.isEmpty()) {
					check=true;
				}
				else {
					currentNode=s.pop();
					arr.add(currentNode);
					currentNode=currentNode.right;
					
				}
			}
		}
		return arr;
		
	}
	
	
	
	
	
	
	
	static ArrayList<Node>  itterPreorder(Node node) {
		ArrayList<Node> arr=new ArrayList<Node>();
		if(node==null) return arr;
		Stack<Node> s=new Stack<Node>();
		s.push(node);
		
		while(!s.isEmpty()) {
			Node temp=s.pop();
			arr.add(temp);
			if(temp.right!=null) {
				s.add(temp.right);
				
			}
			if(temp.left!=null) {
				s.add(temp.left);
			}
			
		}
		return arr;
		
	}
	
	
	
	
	static void printLV(Node node) {
		if(node == null) return;
		Queue<Node> q=new LinkedList<Node> ();
		q.add(node);
		while(!q.isEmpty()) {
			int size=q.size();
			   
			   for(int i=0;i<size;i++) {
				   node=q.poll();
				   if(i==0) System.out.print(node.data+"  ");
				   if(node.left!=null) q.add(node.left);
				   if(node.right!=null) q.add(node.right);
			   }
		}
	}
	
	static int size(Node node) {
		if(node == null) return 0;
		return 1+size(node.left)+size(node.right);
	}

}
