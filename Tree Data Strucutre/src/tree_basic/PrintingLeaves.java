package tree_basic;
import java.util.*;

import tree_basic.TreeDeletion.Node;

public class PrintingLeaves {
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static int  printleaf(Node root) {
		Node temp=root;
		Queue<Node> q=new LinkedList<>();
		q.add(temp);
		int count= 0,fullnode=0,halfnode=0;
		while(!q.isEmpty()) {
			temp=q.poll();
			if(temp.left!=null && temp.right==null)halfnode++;
			if(temp.right!=null && temp.left==null)halfnode++;
			if(temp.left!=null && temp.right!=null) {
				fullnode++;
			}
			if(temp.left==null && temp.right==null)
				{
				System.out.print(temp.data+" ");
				count++;
				}
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null) q.add(temp.right);
		}
		System.out.print("\nnumber of full node = "+ fullnode);
		System.out.print("\nnumber of half node = "+ halfnode);
		return count;
	}
	public static void main (String[] args) {
		  root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			root.right.left.left=new Node(156);
			root.right.left.right=new Node(106);
			System.out.println("\nnumber of leaf Node = "+ printleaf(root));
	}

}
