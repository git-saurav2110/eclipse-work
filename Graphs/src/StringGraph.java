import java.util.*;
public class StringGraph {

	int vert;
	ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	int pos=0;
	String[] name;
	StringGraph(int n){
		vert=n;
		name=new String[n];
		for(int i=0;i<n;i++) {
			arr.add(new ArrayList<Integer>());
		}
		
	}
	void addVertex(String names) {
		name[pos++]=names;
		
	}
	
	void addEdge(int u,int v) {
		if(arr.get(u).contains(v)) return ;
		arr.get(u).add(v);
		arr.get(v).add(u);
	}
	
	void printGraph() {
		boolean [] b=new boolean[vert];
		for(int i=0;i<arr.size();i++) {
		
			System.out.print(name[i]+" ==>");
			for(int j=0;j<arr.get(i).size();j++) {
				System.out.print(name[arr.get(i).get(j)]+ "-->");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vertex = " );
		//int n=sc.nextInt();
		StringGraph sg=new StringGraph(4);
		sg.addVertex("Ram");
		sg.addVertex("Shyam");
		sg.addVertex("mog");
		sg.addVertex("tim");
		sg.addEdge(0, 3);
		sg.addEdge(0, 2);
		sg.addEdge(1, 2);
		sg.addEdge(1, 3);
		sg.addEdge(1, 0);
		sg.addEdge(2, 3);
		sg.printGraph();
		
	}
}
