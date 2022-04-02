import java.util.*;
public class GraphUsingAdjMatrix {

	int vertices;
	int [][] adjmat;
	public GraphUsingAdjMatrix(int vertices){
		this.vertices=vertices;
		adjmat=new int[vertices][vertices];
	}
	void addEdge(int source,int desti) {
		adjmat[source][desti]=1;
		adjmat[desti][source]=1;
	}
	
	void printGraph() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(adjmat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void printBFS() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Queue<Integer> q=new LinkedList();
		boolean [] vert=new boolean[vertices];
		q.add(0);
		vert[0]=true;
		while(!q.isEmpty()) {
			int temp=q.poll();
			arr.add(temp);
			for(int j=0;j<vertices;j++) {
				if(adjmat[temp][j]!=0 && !vert[j]) {
					q.add(j);
					vert[j]=true;
					
				}
			}
		}
		System.out.println("bfs "+ arr);
		
	}
	
	void pritDFS(){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Stack<Integer> s =new Stack();
		boolean [] check =new boolean[vertices];
		s.push(0);
		check[0]=true;
		while(!s.isEmpty()) {
			int temp=s.pop();
			arr.add(temp);
			for(int j=0;j<vertices;j++) {
				if(adjmat[temp][j]==1 && check[j]==false) {
					s.push(j);
					check[j]=true;
					break;
				}
			}
		}
		System.out.println("DFS : \n"+ arr);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vertices : ");
		int v=sc.nextInt();
		GraphUsingAdjMatrix g=new GraphUsingAdjMatrix(v);
		System.out.println("Enter the numbver of edges :");
		int edge= sc.nextInt();
		for(int i=0;i<edge;i++) {
			System.out.println("Enter Source : ");
			int source=sc.nextInt();
			System.out.println("Enter desti : ");
			int desti=sc.nextInt();
			g.addEdge(source, desti);
			System.out.println("--------------");
		}
		System.out.println("Adj matrix =:  ");
		g.printGraph();
	}
}
