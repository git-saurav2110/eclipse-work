import java.util.ArrayList;
import java.util.Scanner;

import adjacencyList.DFSrev;
public class GraphUsingArrayList {

	int vertices;
	ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	
	GraphUsingArrayList(int vertices){
		this.vertices=vertices;
		for(int i=0;i<vertices;i++) {
			arr.add(new ArrayList<Integer>());
			
		}
	}
		void addEdge(int source,int desti) {
			if(! arr.get(source).contains(desti)) {
			arr.get(source).add(desti);
			arr.get(desti).add(source);
			}
	}
		void printGraph() {
			for(int i=0;i<vertices;i++) {
				System.out.println(i+"-->"+arr.get(i));
			}
		}
		
		public static void main(String[] args) {
			GraphUsingArrayList g=new GraphUsingArrayList(7);
			
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
			
			
			g.printGraph();
		}
}
