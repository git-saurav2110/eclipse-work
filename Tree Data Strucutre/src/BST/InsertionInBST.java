package BST;

import java.util.Scanner;

public class InsertionInBST {
        static Node root;
        static class Node{
        	int data;
        	Node left,right;
        	Node (int d){
        		data=d;
        		left=right=null;
        	}
        }
       static Node insert(Node root,int data) {
    	   Node temp=root;
    	   if(temp==null) {
    		   root=new Node(data);
    		   return root;
    	   }
    	   else {
    	   if(root.data<data) {
    		   root.right=insert(root.right,data);
    	   } else if(root.data>data)
    		   root.left=(insert(root.left,data));
    	  
    	   return root;
       }
       }
       
       static void inorder(Node root) {
    	   if(root!=null) { 
    	   inorder(root.left);
    	   System.out.print(root.data+" ");
    	   inorder(root.right);
    	   }
       }
        public static void main(String [] args) {
        	Scanner sc=new Scanner(System.in);
        	int k=sc.nextInt();
        	while(k>0) {
        		int t=sc.nextInt();
        		root=insert(root,t);
        		k--;
        	}
        	
        inorder(root);	
  }
}
