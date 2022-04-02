package tree_basic;

public class Tree{
	node root;
	static class node{
	    int data;
	    node right;
	    node left;
	    node(int d)
	    {
	        data=d;
	    }
	    }
	
	
	public void push(int data) {
		node temp =new node(data);
		if(root==null) {
			root=temp;
			return;
		}
		//node n=root;
		else 
		{
			if(temp.data > root.data) {
				node n=root;
				while(n!=null) {
					n=n.right;
				}
				n.right=temp;
				return;
				
				
			}
			if(temp.data< root.data) {
				node n=root;
				while(n!=null) {
					n=n.left;
				}
				n.left=temp;
				return;
				
			}
		}
		
	}

  
    public static void main(String[] args){
    	Tree t=new Tree();
    	
    	t.push(12);
    	t.push(10);
    	t.push(14);
    	t.push(16);
    	System.out.println(t.root.left.data+" "+t.root.data+" "+t.root.left.data+" "+t.root.left.left.data);
    	
    
    }
    
}
