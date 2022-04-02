package tree_basic;
import java.util.*;

import tree_basic.ReverseLevelOrder.Node;

public class HeightOfTree {
   static Node root;
  static  class Node {
	  int data;
	  Node left,right;
	  Node (int d){
		  data=d;
	  }
  }
  
  static int height(Node root){
	  Node temp=root;
	  Queue<Node> q=new LinkedList<>();
	  q.add(temp);
	  int height=0;
	  while(1==1) {
		  int countNode=q.size();
		  if(countNode==0) return height;
		  height++;
		  while(countNode>0) {
			  Node newNode=q.poll();
			  if (newNode.left==null && newNode.right==null) return height;  //for minimum height 
			  if(newNode.left!=null) q.add(newNode.left);
			  if(newNode.right!=null) q.add(newNode.right);
			  countNode--;
			  
		  }
		   
	  }
  }
  static int deepest(Node root) {
	  Node temp=root;
	  if(temp==null) {
		 System.out.print("Empty tree");
		  return 0;
	  }
	  
	  Queue<Node> q=new LinkedList<Node>();
	  q.add(temp);
	  while(!q.isEmpty()) {
		  temp=q.poll();
		  if(temp.left!=null)q.add(temp.left);
		  if(temp.right!=null)q.add(temp.right);
		  
	  }
	 // temp=null;
	  return temp.data;
  }
  
  
  
  public static void main(String[] args) {
	  root=new Node(0);
		root.left=new Node(12);
		root.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(19);
		root.right.right=new Node(9);
		root.right.left=new Node(16);
		root.left.left.left=new Node(11);
		root.left.left.left.left=new Node(114);
		System.out.print("height of tree: "+ height(root)+" \n deepest root : " +deepest(root));
  }
}
