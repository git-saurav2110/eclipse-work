package tree_basic;

import java.util.LinkedList;
import java.util.Queue;

import tree_basic.DiameterOfTree.Node;

public class MirrorOfTree {
        static Node root;
        static class Node{
        	int data;
        	Node left,right;
        	Node(int d){
        		data=d;
        	}
     }
        static void inorder(Node root) {
        	if(root==null) return;
        	inorder(root.left);
        	System.out.print(root.data+" ");
        	inorder(root.right);
        }
        
        static void levelOrder(Node root) {
    		Queue<Node> q=new LinkedList<Node>();
    		Node temp=root;
    		q.add(temp);
    		while(!q.isEmpty()) {
    			temp=q.poll();
    			if(temp.left!=null) {
    				q.add(temp.left);
    			}
    			if(temp.right!=null) {
    				q.add(temp.right);
    			}
    			System.out.print(temp.data+" ");
    			
    		}
    		System.out.println();
    	}

        
        static void mirror(Node root) {
        	Node temp=root;
        	if(temp ==null) return;
          	Node swap=temp.left;
        	temp.left=temp.right;
        	temp.right=swap;
        	mirror(temp.left);
        	mirror(temp.right);
        }
        public static void main(String[] args) {
        	 root=new Node(0);		
 			root.left=new Node(12);
 			root.right=new Node(10);
 			root.left.left=new Node(4);
 			root.left.right=new Node(19);
 			root.right.right=new Node(9);
 			root.right.left=new Node(16);
 			//root.right.left.left=new Node(16);
 			levelOrder(root);
 			mirror(root);
 			System.out.println();
 			levelOrder(root);
        }
}
