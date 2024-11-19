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
			System.out.println("Vertex " + data + " added in graph");
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
	
	void removeVertex(T data)
	{
		if(graph.get(data) == null)
		{
			System.out.println("Vertex " + data + " is not present inside graph !!!");
		}else
		{
			graph.forEach((vertex, set) -> {
				set.remove(data);
			});
			System.out.println("Vertex " + data + " is deleted from graph");
			graph.remove(data);
		}
	}
	
	void removeEdge(T vertex1, T vertex2)
	{
		graph.forEach((vertex, set) -> {
			if(graph.get(vertex1).contains(vertex2) && graph.get(vertex2).contains(vertex1))
			{
				graph.get(vertex1).remove(vertex2);
				graph.get(vertex2).remove(vertex1);
				System.out.println("One edge is deleted between " + vertex1 + " and " + vertex2);
			}
		});
	}
	
	void printGraph()
	{
		System.out.println();
		graph.forEach((vertex, set) -> {
			System.out.print("Vertex " + vertex + " is connected with ");
			System.out.println(set);
		});
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
		
		graph.addEdge(1,4);
		
		graph.printGraph();
		
		graph.removeEdge(1, 4);
				
		graph.printGraph();
		
		graph.removeVertex(3);
		
		graph.printGraph();
	}

}
