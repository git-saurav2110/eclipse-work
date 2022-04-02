package tree_basic;
import java.util.*;

import tree_basic.PathWithSumValueK.Node;

public class ZigZagTraversal {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static void zigzag(Node root) {
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node temp=s1.pop();
				if(temp==null) return;
				System.out.print(temp.data+" ");
				s2.push(temp.left);
				s2.push(temp.right);
			}
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				if(temp==null) return;
				System.out.print(temp.data+" ");
				s1.push(temp.right);
				s1.push(temp.left);
			}
		}
	}
	public static void main(String [] args) {
		    root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			zigzag(root);
	}

}
