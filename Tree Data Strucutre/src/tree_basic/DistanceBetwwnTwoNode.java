package tree_basic;
import java.util.*;
public class DistanceBetwwnTwoNode {

	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static Node insert(Node root,int data) {
		Node new_node=new Node(data);
		if(root==null) {
			root=new_node;
			return root;
		}
		return insertHelper(root,data);
	}

	static Node insertHelper(Node root,int data) {
		Node temp=root;
		Node new_node=new Node(data);
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.poll();
			if(temp.left==null) {
				temp.left=new_node;
				return root;
			}
			if(temp.left!=null)q.add(temp.left);
			if(temp.right==null) {
				temp.right=new_node;
				return root;
			}
			else q.add(temp.right);
		}
		return root;
	}
	
      static void inorder(Node root) {

		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
      
      static Node findLCA(Node root,int n1,int n2) {
    	  if(root==null) return null;
    	  if(root.data==n1 || root.data==n2) return root;
    	  Node left=findLCA(root.left,n1,n2);
    	  Node right=findLCA(root.right,n1,n2);
    	  if(left != null && right !=null) {
    		  return root;
    	  }
    	  return (left!=null)? left:right;
      }
      
      static int height(Node temp,int n) {
    	  if(temp==null) return -1;
    	  int dist=-1;
    	 if(temp.data==n || (dist=height(temp.left,n))>=0 ||
    	     (dist=height(temp.right,n))>=0){
    	    	 return dist+1;
    	     }
    	     
    	     return dist;
      }
	static int findDistance(Node root,int n1,int n2) {
		Node temp=findLCA(root,n1,n2);
		System.out.println("lca : "+ temp.data);
		int h1=height(temp,n1);
		int h2=height(temp,n2);
		
		System.out.println(h1+" "+h2);
		
		return h1+h2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int T=sc.nextInt();
	   while(T>0) {
		   int k=sc.nextInt();
		   root=insert(root,k);
		   T--;
	   }
	   inorder(root);
	   System.out.println();
	   int n1=8,n2=3;
	   System.out.println(findDistance(root,n1,n2));
	   
	}
}
