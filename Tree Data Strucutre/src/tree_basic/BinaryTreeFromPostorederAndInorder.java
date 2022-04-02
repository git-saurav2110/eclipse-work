package tree_basic;

public class BinaryTreeFromPostorederAndInorder {
	static Node root;
	static class Node {
		int data;
		Node left,right;
		Node (int d){
			data=d;
		}
	}
	static Node buildBinaryTree(int [] postOrder,int [] inOrder) {
		if(postOrder.length!= inOrder.length) return null;
		return buildBT(postOrder,0,postOrder.length-1,inOrder,0,inOrder.length-1);
	}
	
	static Node buildBT(int[] postOrder,int postStart,int postEnd,int [] inOrder,int inStart,int inEnd) {
		if(postStart>postEnd || inStart>inEnd) return null;
		int data= postOrder[postEnd];
		Node curr=new Node(data);
		int offset=inStart;
		for(;offset<=inEnd;offset++) {
			if(inOrder[offset]==data) break;
		}
		curr.left=buildBT(postOrder,postStart,postStart+offset-inStart-1,inOrder,inStart,offset-1);
		curr.right=buildBT(postOrder,postStart+offset-inStart,postEnd-1,inOrder,offset+1,inEnd);
		return curr;
		
	}
	static void inorder(Node curr) {
		if(curr==null) return;
		inorder(curr.left);
		System.out.print(curr.data+" ");
		inorder(curr.right);
	}
	public static void main(String[] args) {
		int [] postOrder= {
				9,1,2,12,7,5,3,11,4,8
		};
		int [] inOrder= {
				9,5,1,7,2,12,8,4,3,11
		};
		inorder(buildBinaryTree(postOrder,inOrder));
	}

}
