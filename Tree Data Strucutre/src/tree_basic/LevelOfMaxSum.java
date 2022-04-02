package tree_basic;

import java.util.*;

public class LevelOfMaxSum {
	static Node root;
	static class Node {
		int data;
		Node left,right;
		Node (int d){
			data=d;
		}
	}
	
	static int maxSum(Node root) {
		Node temp=root;
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		int max=Integer.MIN_VALUE,height=0,sum,k=0;
		while(1==1) {
			sum=0;
			int countnode=q.size();
			if(countnode==0)return k; 
			height++;
			while(countnode>0) {
				temp=q.poll();
				sum+=temp.data;
				if(temp.left!=null) q.add(temp.left);
				if(temp.right!=null) q.add(temp.right);
				countnode--;
			}
			if(sum>max) {
				k=height;
			}
			max=sum;
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
			root.right.left.left=new Node(16);
			root.right.left.right=new Node(1666);
			System.out.println(" maxmum sum level= "+ maxSum(root));
	}

}
