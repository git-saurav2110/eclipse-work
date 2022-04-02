package tree_basic;

public class BinaryTreeFromPreorderAndInorder {
	static Node root;
	static class Node {
		int data;
		Node right,left;
		Node (int d){
			data=d;
		}
	}
	static Node makeTree(int [] preOrder,int[] inOrder) {
		if(preOrder.length!=inOrder.length) return null;
		return buildBT(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
	}
	
	static Node buildBT(int [] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd) {
		if(preStart>preEnd || inStart>inEnd) return null;
		int data=preOrder[preStart];
		Node curr=new Node(data);
		int offset=inStart;
		for(;offset<inEnd;offset++) {
			if(inOrder[offset]==data) break;
		}
		curr.left=buildBT(preOrder,preStart+1,preStart+offset-inStart,inOrder,inStart,offset-1);
		curr.right=buildBT(preOrder,preStart+offset-inStart+1,preEnd,inOrder,offset+1,inEnd);
		return curr;
	}
	static void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+"");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		int [] preOrder= {
				1,2,4,8,9,10,11,5,3,6,7
		};
		int [] inOrder= {
				8,4,10,9,11,2,5,1,6,3,7
		};
		Node root=makeTree(preOrder,inOrder);
		inOrder(root);
	}

}
