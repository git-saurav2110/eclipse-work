package tree_basic;
import java.util.*;

public class ReverseLevelOrder {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	static void reverseLevel(Node root) {
		Node temp=root;
		Stack<Node> s=new Stack<Node>();
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.poll();
			s.push(temp);
			if(temp.right!=null)q.add(temp.right);
			if(temp.left!=null)q.add(temp.left);
			
			
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop().data+" ");
		}
		
	}

	public static void main(String[] agrs) {
		root=new Node(13);
		root.left=new Node(12);
		root.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(19);
		root.right.right=new Node(9);
		root.right.left=new Node(16);
		reverseLevel(root);
	}
}
