package adjacencyList;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ShortestPathInUndirectedGraph {
	static ArrayList<ArrayList<Integer>> adj =new ArrayList();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		int e=sc.nextInt();
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		int pathDist=findDist(0,6);
		System.out.println(" shortest path --->"+ pathDist);
	}
	
	static int findDist(int source,int desti) {
		Queue<Integer> q=new LinkedList();
		q.add(source);
		int [] dist=new int[adj.size()];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[source]=0;
		int currDist=0;
		while(!q.isEmpty()) {
			int temp=q.poll();
			
			for(int x: adj.get(temp)) {
				if(dist[x]> dist[temp]+1) {
					q.add(x);
					dist[x]=dist[temp]+1;
				}
				
			}
		}
		System.out.println();
		for(int x: dist) {
			System.out.print(x+" ");
		}
		System.out.println();
		return dist[desti];
	}

}
