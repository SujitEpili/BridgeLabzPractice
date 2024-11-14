package data_structure;

import java.util.HashMap;
import java.util.HashSet;

class GraphNode<T>
{
	T data;
	HashSet<T> list;
}

class Graph<T>
{
	HashMap<T, HashSet<T>> graph = new HashMap<>();
	
	void addVertex(T data)
	{
		if(graph.get(data) == null)
		{
			GraphNode<T> newNode = new GraphNode<>();
			newNode.data = data;
			graph.put(data, new HashSet<>());
		}
	}
	
	void addEdge(T vertex1, T vertex2)
	{
		if(vertex1 != vertex2 && graph.get(vertex1)!= null && graph.get(vertex2) != null)
		{
			HashSet<T> set1 = graph.get(vertex1);
			set1.add(vertex2);
			graph.put(vertex1, set1);
			
			HashSet<T> set2 = graph.get(vertex2);
			set2.add(vertex1);
			graph.put(vertex2, set2);
			
			System.out.println("Edge is created between " + vertex1 + " and " + vertex2);
		}else
		{
			System.out.println("Verices are similar or not found !!!");
		}
	}
	
	void printGraph()
	{
		System.out.println(graph);
	}
}

class GraphDemo 
{
	public static void main(String[] args) 
	{
		Graph<Integer> graph = new Graph<>();
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
				
		graph.addEdge(1,2);
		graph.addEdge(1,1); // Within 1 vertex we can't create edge
		graph.addEdge(1,3);
		graph.addEdge(2,4);
		graph.addEdge(3,4);
		
		graph.printGraph();
	}

}
