package adjacencyList;
import java.util.*;

public class DFS {
	int vertices;
	LinkedList<Integer>[] list;
	
	DFS(int vertices){
		this.vertices=vertices;
		list=new LinkedList[vertices];
		for(int i=0;i<vertices; i++) {
			list[i]=new LinkedList();
		}
	}
	
	void addEdge(int u,int v) {
		list[u].addLast(v);
		list[v].add(u);
	}
	
	void pritGraph() {
		for(int i=0;i<vertices;i++) {
			System.out.println(i+" -- "+ list[i]);
		}
	}
	
	void printDFS() {
		ArrayList<Integer> set=new ArrayList<Integer>();
		boolean [] arr=new boolean[vertices];
		
		Stack<Integer> s=new Stack();
		
			s.push(4);
			arr[4]=true;
			
			while(!s.isEmpty()) {
				int temp=s.pop();
				set.add(temp);
				for(int i=0;i<list[temp].size();i++) {
					if(! arr[ (list[temp].get(i))]) {
						s.add(list[temp].get(i));
						arr[(list[temp].get(i))]=true;
						break;
					}
					   
				}
			}
			
			System.out.print(set);	
	}
	
	void printBFS() {
		ArrayList<Integer> result=new ArrayList<Integer>();
		boolean [] arr=new boolean[vertices];
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(0);
		arr[0]=true;
		while(!q.isEmpty()) {
			int temp=q.poll();
			result.add(temp);
			for(int i=0;i<list[temp].size();i++) {
				if(!arr[list[temp].get(i)]) {
					q.add(list[temp].get(i));
					arr[list[temp].get(i)]=true;
				}
			}
		}
		System.out.println("BFS traversal :");
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		DFS d=new DFS(5);
		d.addEdge(0, 4);
		d.addEdge(0, 3);
		d.addEdge(3, 4);
		d.addEdge(1, 3);
		d.addEdge(3, 2);
		d.addEdge(0, 2);
		d.addEdge(1, 2);
		
		d.pritGraph();
		System.out.println("DFS traversal");
		 d.printDFS();
		 d.printBFS();
	}

}
