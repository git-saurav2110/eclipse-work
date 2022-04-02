package tree_basic;

import java.util.*;

import tree_basic.DiameterOfTree.Node;

public class WidthOfBinarytree {
	static Node root;
	static class Node {
		int data;
		Node left,right;
		Node (int d){
			data=d;
		}
	}
	static int width(Node root) {
		Node temp=root;
		Queue<Node> q=new LinkedList<>();
		q.add(temp);
		int w=0;
		while(1==1) {
			
			int countNode=q.size();
			if(countNode==0) return w;
			w= (w>countNode) ?w: countNode;
			
			while(countNode>0) {
				temp=q.poll();
				if(temp.left!=null) q.add(temp.left);
				if(temp.right!=null) q.add(temp.right);
				countNode--;
			}
			
		}
		
	}
	public static void main(String[] args){
		
		     root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			root.right.left.left=new Node(16);
			System.out.print(width(root));
	}	

}
