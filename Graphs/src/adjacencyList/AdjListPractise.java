package adjacencyList;

import java.util.*;

class Graph{
	class Edge{
		int v, w;
		public Edge(int v,int w) {
			this.v=v;
			this.w=w;
		}
		@Override
		public String toString() {
			return "("+v+","+w+")";
		}
	}
	List<Edge> G[];
	public Graph(int n) {
		G=new LinkedList[n];
		for(int i=0;i<n;i++) {
			G[i]=new LinkedList<Edge>();
			
		}
	}
	public boolean isConnected(int u,int v) {
		for(Edge i: G[u]) {
			if(i.v==v) return true;
		}
		return false;
	}
	
	void addEdge(int u,int v, int w) {
		G[u].add(0,new Edge(v,w));
	}
	
	public String toString () {
		String result="";
		for(int i=0;i<G.length;i++) {
			result+=i+"==>"+G[i]+"\n";
		}
		return result;
	}
	
}


public class AdjListPractise {
	public static void main(String [] args) {
		Graph g=new Graph(10);
		g.addEdge(1,2,4);
		g.addEdge(1, 4, 6);
		g.addEdge(9, 1, 4);
		System.out.println(g);
		System.out.println("\n" + g.isConnected(1, 4));
	}
}
