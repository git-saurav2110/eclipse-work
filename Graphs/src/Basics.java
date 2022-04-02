import java.util.*;
class Graph{
	class Edge{
		int v;int w;
		public Edge(int v,int w) {
			this.v=v;
			this.w=w;
		}
		@Override
		public String toString() {
			return "{"+v+","+ w +"}";
		}
		
	}
	
	List<Edge> G[];
	
	public  Graph(int n) {
		G=new LinkedList[n];
		for(int i=0;i<n;i++) {
			G[i]=new LinkedList<>();
		}
	}
		
	void addEdge(int u,int v,int w) {
			G[u].add(0,new Edge(v,w));
		}
	
	
	public String toString() {
		String result="";
		for(int i=0;i<G.length;i++)
			result+=i+"==>"+G[i]+"\n";
		return result;
		
	}
}


public class Basics {

	public static void main(String[] args) {
		
		// Basic LinkedListPackage
		List<Integer> l=new LinkedList();
		l.add(10); 
		l.add(20);
		l.add(0,20);
		//l.add(20,0);
		System.out.print(l);
	
		
	}
}
