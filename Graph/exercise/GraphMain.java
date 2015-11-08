package exercise;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter file name : ");
		//String filename = sc.nextLine();
		GraphAdjList graph = new GraphAdjList("src\\friendship.txt");
		graph.print();
		sc.close();
	}

}
