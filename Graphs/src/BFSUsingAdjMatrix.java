import java.util.*;
public class BFSUsingAdjMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vertices : ");
		int v=sc.nextInt();
		
		GraphUsingAdjMatrix g=new GraphUsingAdjMatrix(v);
		
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		
		g.printGraph();
		g.printBFS();
		g.pritDFS();
	}
	
}
