package adjacencyList;

import java.util.LinkedList;
class GraphStr{
	int vertices;
	LinkedList<Integer> adjList[];
	
	public GraphStr(int vertices) {
		this.vertices=vertices;
		
		adjList=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjList[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source,int desti) {
		adjList[source].add(desti);
		adjList[desti].add(source);
	}
	
	void printGraph() {
		for(int i=0;i<vertices ;i++) {
			System.out.print(i+" th verices are connected to --->");
			if(adjList[i].size()!=0) {
				for(int j=0;j<adjList[i].size();j++) {
					System.out.print(adjList[i].get(j)+" --->>");
				}
			}
			System.out.println();
		}
	}
	
}

public class MakingGraph {

	public static void main(String[] args) {
		GraphStr g=new GraphStr(5);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(4, 0);
		g.addEdge(2, 0);
		g.printGraph();
	}
}

