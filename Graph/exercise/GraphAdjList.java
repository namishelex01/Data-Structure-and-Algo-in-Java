package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Neighbour {
	
	/* The Neighbour class is Linked list with data saved as integer VertxNumber */
	
	public int vertexNum;
	public Neighbour next;
	
	Neighbour(int vnum, Neighbour nbr){
		this.vertexNum = vnum;
		next = nbr;
	}	
}

class Vertex {
	
	/* Vertex contains the strings i.e. name of the friends 		*
	 * and using the Linked List with head named as = 'adjList'		*
	 * used to store the edges connecting the name vertices.		*/
	
	String name;						
	Neighbour adjList;
	
	Vertex(String name, Neighbour n){
		this.name = name;
		this.adjList = n;
	}
}

public class GraphAdjList {
	
	/* Implementing the Linked List with Vertices as combination.
	 * The reference array has been used to store multiple vertices i.e. name of the person
	 * and edges to which everyone is connected to each other.
	 * Givers option for both DIRECTED and UNDIRECTED graph
	 */
	
	Vertex[] adjLists;
	public GraphAdjList(String file) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(file));
		
		String graphtype = sc.next();
		boolean undirected = true;
		if (graphtype.equals("directed")) {
			undirected = false;
		}
		adjLists = new Vertex[sc.nextInt()];
		
		for(int v=0; v < adjLists.length ; v++){
			adjLists[v] = new Vertex(sc.next(),null);
		}
		
		while(sc.hasNext()) {
			int v1 = indexForName(sc.next()); 
			int v2 = indexForName(sc.next());
			
			adjLists[v1].adjList = new Neighbour(v2, adjLists[v1].adjList);
			
			if(undirected){
				adjLists[v2].adjList = new Neighbour(v1, adjLists[v2].adjList);
			}
		}
		sc.close();
	}
	
	int indexForName(String name){
		for (int v=0; v < adjLists.length; v++){
			if (adjLists[v].name.equals(name))
				return v;
		}
		return -1;
	}
	
	public void print() {
		System.out.println();
		
		for (int v=0; v < adjLists.length; v++){
			System.out.print(adjLists[v].name);
			
			for(Neighbour nbr = adjLists[v].adjList; nbr != null; nbr = nbr.next)
				System.out.print("-> "+ adjLists[nbr.vertexNum].name);
			System.out.println("\n");
		}
	}
}
