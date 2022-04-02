package adjacencyList;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Stack;


public class DFSrev {
	static ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	
	
	static int vertices;
	DFSrev(int vertices){
		this.vertices=vertices;
		for(int i=0;i<vertices;i++) {
			arr.add( new ArrayList<Integer>());
		}
	}
	
	void addEdge(int source,int desti) {
		if(! arr.get(source).contains(desti)) {
			arr.get(source).add(desti);
			arr.get(desti).add(source);
			}
	}
	
	void print() {
		for(int i=0;i<arr.size();i++) {
			System.out.print(i + "--->");
			for(int j: arr.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void fillOrder(int v,boolean[] visited,Stack<Integer> s) {
		visited[v]=true;
		System.out.print(v+" ");
		
		Iterator<Integer> i= arr.get(v).iterator();
		int val=0;
		while(i.hasNext()) {
		    val=i.next();
		    if(visited[val]) {
		    	fillOrder(val,visited,s);
		    }
		}
		s.push(val);
	}
	void scc(int v) {
		Stack<Integer> s=new Stack<Integer>();
		boolean[] visited=new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			if(!visited[i])
		       fillOrder(v,visited,s);
	     }
		
		System.out.println("Stack is -->" + s);
	}
	/*
	 * void printDFS(int start) { System.out.println("inside dfs");
	 * ArrayList<Integer> result=new ArrayList<Integer>(); boolean []visited=new
	 * boolean [vertices]; for(int i=0;i<vertices;i++) { visited[i]=false; }
	 * Stack<Integer> s=new Stack<Integer>();
	 * 
	 * s.push(start);
	 * 
	 * while(!s.isEmpty()) { int temp=s.pop(); System.out.print(temp+ "  " );
	 * if(!visited[temp]) result.add(temp);
	 * 
	 * for(int i=0;i<arr.get(temp).size();i++) { int t= arr.get(temp).get(i);
	 * System.out.print(" t-->"+ t); if(!visited[t]) { s.push(t);
	 * 
	 * } }
	 * 
	 * } System.out.print("dfs traversal--->"+ result);
	 * 
	 * }
	 * 
	 */
	public static void main(String [] args) {
		DFSrev g=new DFSrev(8);
		g.addEdge(1, 4);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 1);
		g.addEdge(2, 1);
		g.addEdge(5, 1);
		g.addEdge(6, 1);
		g.addEdge(3, 2);
		g.addEdge(5, 2);
		g.addEdge(3, 4);
		g.addEdge(2, 4);
		g.addEdge(6, 4);
		
		g.print();
		System.out.print("Mother vertex ---> " + motherVertex());
		
	}
	
	static int motherVertex() {
		ArrayList<ArrayList<Integer>> allDfs=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<vertices;i++) {
			ArrayList<Integer> subDFS=new ArrayList<Integer>();
			boolean[] visited=new boolean[vertices];
			for(int j=0;j<vertices;j++) {
				if(!visited[j]) {
					DFS(i,visited,subDFS);
				}
			}
			allDfs.add(subDFS);
			
		}
		int vertex=-1;
		for(int i=0;i<allDfs.size();i++) {
			int s=arr.get(i).size();
			if(s==6)
				vertex=i;
		}
		return vertex;
	}
	
	static void DFS(int start,boolean []visited,ArrayList<Integer> subDFS) {
		if(!visited[start]) {
			subDFS.add(start);
			visited[start]=true;
		}
		for(int i=0;i<arr.get(start).size();i++) {
			int j=arr.get(start).get(i);
			if(!visited[j]) {
				DFS(j,visited,subDFS);
			}
		}
		return;
	}
	
	
	
	
}
