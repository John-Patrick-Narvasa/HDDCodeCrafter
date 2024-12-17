package Experience.Tutorials.Concepts.DSA.DataStructures;

import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }
}

public class GraphExample {
    public static void main(String[] args) {
        // Create a graph representing a social network
        Graph socialNetwork = new Graph();
        
        // Add friendships to the graph
        socialNetwork.addEdge(1, 2);
        socialNetwork.addEdge(1, 3);
        socialNetwork.addEdge(2, 3);
        socialNetwork.addEdge(3, 4);

        // Displaying the neighbors of each person in the social network
        System.out.println("Social Network Connections:");
        for (int person = 1; person <= 4; person++) {
            System.out.println("Person " + person + " is friends with: " + socialNetwork.getNeighbors(person));
        }
    }
}