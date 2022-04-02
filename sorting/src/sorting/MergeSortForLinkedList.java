package sorting;
import java.util.Scanner;
public class MergeSortForLinkedList {

	static Node root=null;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	static Node push(Node root,int k) {
		if(root==null) {
			root=new Node(k);
			return root;
		}
		
		Node node=new Node(k);
		node.next=root;
		root=node;
		return root;
	}
	static void print(Node root) {
		while(root!=null) {
			System.out.print(root.data+ " ");
			root=root.next;
		}
		System.out.println();
	}
	
	static Node getMid(Node head) {
		Node fast=head, mid=head;
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			mid=mid.next;
		}
		return mid;
	}
	static Node sort(Node a,Node b) {
		Node result=null;
		if(a==null) return b;
		if(b==null) return a;
		if(a.data<=b.data) {
			result=a;
			result.next=sort(a.next,b);
		}
		else{
			result=b;
			result.next=sort(a,b.next);
		}
		
		return result;
	}
	static Node mergeSort(Node root) {
		Node head=root;
		
		if(head==null || head.next==null) return head;
		
		Node mid=getMid(head);
		Node head2=mid.next;
		
		mid.next=null;
		
		Node left=mergeSort(head);
		Node right=mergeSort(head2);
		
		Node sortedList=sort(left,right);
		return sortedList;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
			int k=sc.nextInt();
			root=push(root,k);
			T--;
		}
		print(root);
		root=mergeSort(root);
		print(root);

	}

}
