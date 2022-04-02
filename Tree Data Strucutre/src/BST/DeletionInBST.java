package BST;
import java.util.*;
public class DeletionInBST {
	
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static Node insert(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(root.data>data) {
			root.left=insert(root.left,data);
		} else if(root.data<data) {
			root.right=insert(root.right,data);
		}
		return root;
	}
	
	static void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
		}
	}
	static Node maxleft(Node root) {
		if(root==null) return null;
		else {
			if(root.right==null) return root;
			else return maxleft(root.right);
		}
	}
	
	static Node del(Node root,int deldata) {
		Node temp;
		if(root==null) {
			System.out.println("No Data found ");
			return null;
		} else if(root.data<deldata) {
			root.right=del(root.right,deldata);
		} else if(root.data>deldata) {
			root.left=del(root.right,deldata);
		}
		else {
			if(root.right!=null && root.left!=null) {
				temp=maxleft(root.left);
				root.data=temp.data;
				root.left=del(root.left,root.data);
			}
			else {
				temp=root;
				if(temp.left==null) {
					root=root.right;
				}
				if(temp.right==null)
					root=root.left;
				
			}
		}
		
		return root;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k>0) {
			root=insert(root,sc.nextInt());
			k--;
		}
		
		System.out.println("Before Deletion : ");
		inorder(root);
		int deleteKey=sc.nextInt();
		root=del(root,deleteKey);
		inorder(root);
	}

}
