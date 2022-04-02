package revision;

import java.util.*;
import java.util.LinkedList;

public class Graph {
	static int vertices;
	static LinkedList<Integer> list[];
	 Graph(int vert){
		 this.vertices=vert;
		 list=new LinkedList[vertices];
		 
		 for(int i=0;i<vertices;i++) {
			 list[i]=new LinkedList<Integer>();
		 }	
	}
	 
	 public void addEdge(int source,int desti) {
		 list[source].add(desti);
		 list[desti].add(source);
	 }
	 
	 static void printGraph() {
		 for(int i=0;i<vertices;i++) {
			 System.out.println(i+"--->" + list[i]);
		 }
	 }
	 
	 static void BFS(int from) {
		 Queue<Integer> q=new LinkedList();
		 boolean[]visited=new boolean[vertices];
		 q.add(from);
		 visited[from]=true;
		 while(!q.isEmpty()) {
			 int temp=q.poll();
			 System.out.print(temp+" ");
			 Iterator i=list[temp].iterator();
			 while(i.hasNext()) {
				 int n=(int) i.next();
				 if(!visited[n]) {
					 q.add(n);
					 visited[n]=true;
				 }
			 }
		 }
	 }
	 
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
	//	int v=sc.nextInt();
		Graph g=new Graph(7);
		//int Edge=sc.nextInt();
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,6);
		g.addEdge(2,3);
		g.addEdge(4,5);
		g.addEdge(3,5);
		g.addEdge(3,6);
		
		printGraph();
		System.out.println("BFS traversal---> " );
		 BFS(0);
		System.out.println("DFS-->");
		DFS();
		 
	}

	static void DFSUtil(int v,boolean[] visited) {
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i=list[v].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	private static void DFS() {
		boolean [] visited=new boolean[vertices];
		DFSUtil(list[0].get(0),visited);
	}

}
