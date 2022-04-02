package tree_basic;

public class BT2DLL {
	static Node root,prev=null,head;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
		}
	}
	
	static void bt2dll(Node root) {
		if(root==null) return ;
		 bt2dll(root.left);
		   if(prev==null) head=root;
		   else {
			   root.left=prev;
			   prev.right=root;
		   }
		   prev=root;
		 bt2dll(root.right);
		
	}
	
	static void print(Node head) {
		if(head ==null) return;
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.right;
		}
	}
	
	public static void main(String[] args ) {
		 root=new Node(0);		
			root.left=new Node(12);
			root.right=new Node(10);
			root.left.left=new Node(4);
			root.left.right=new Node(19);
			root.right.right=new Node(9);
			root.right.left=new Node(16);
			root.right.left.left=new Node(122);
			bt2dll(root);
			print(head);
	}

}
