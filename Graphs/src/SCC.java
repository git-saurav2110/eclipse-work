import java.util.*;
public class SCC {
	
	static LinkedList<Integer> [] list;
	static LinkedList<Integer> [] tList;
	static int vertices;
		SCC(int vertex){
			this.vertices=vertex;
			list=new LinkedList[vertices];
			tList=new LinkedList[vertices];
			for(int i=0;i<vertices;i++) {
				list[i]=new LinkedList<Integer>();
				tList[i]=new LinkedList<Integer>();
			}
		}
		
	void addEdge(int u,int v,boolean b) {
		if(!b) {
			if(!list[u].contains(v)) {
				list[u].add(v);
			}
	     }
		if(b) {
			if(!tList[u].contains(v)) {
				tList[u].add(v);
			}
		}
	}
			
	 void print() {
		for(int i=0;i<list.length;i++) {
			System.out.print(i+"-->");
			Iterator<Integer> itr=list[i].listIterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			System.out.println();
		}
	}
	 void printl() {
			for(int i=0;i<list.length;i++) {
				System.out.print(i+"-->");
				Iterator<Integer> itr=tList[i].listIterator();
				while(itr.hasNext()) {
					System.out.print(itr.next()+" ");
				}
				System.out.println();
			}
		}
	

	
	static void fillOrder(int v,boolean[] visited,Stack<Integer> stack) {
		System.out.print(v+ " ");
		visited[v]=true;
		Iterator<Integer> itr=list[v].listIterator();
		
		while(itr.hasNext()) {
			int n=itr.next();
			if(!visited[n]) {
				fillOrder(n,visited,stack);
			}
		}
		stack.push(v);
	}
	
	static SCC getTranpose() {
		SCC g=new SCC(vertices);
		for(int i=0;i<vertices;i++) {
			Iterator<Integer> itr=list[i].listIterator();
			while(itr.hasNext()) {
				int n=itr.next();
				g.addEdge(n, i,true);
			}
		}
		return g;
	}
	
	static void stronglyCC() {
		Stack<Integer> stack=new Stack<Integer>();
		boolean[] visited=new boolean[vertices];
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				fillOrder(i,visited,stack);
			}
		}
		System.out.println("stack--->"+ stack);
		
		SCC gr=getTranpose();
		System.out.print("gr-->" );
		gr.printl();
	}
	
	
	public static void main(String[] args) {
		SCC g=new SCC(8);
		g.addEdge(0,1,false);
		g.addEdge(1, 2,false);
		g.addEdge(2, 0,false);
		g.addEdge(2, 3,false);
		g.addEdge(3, 4,false);
		g.addEdge(4, 5,false);
		g.addEdge(4, 7,false);
		g.addEdge(5, 6,false);
		g.addEdge(6, 4,false);
		g.addEdge(6, 7,false);
		
		g.print();
		g.stronglyCC();
		
	}

}
