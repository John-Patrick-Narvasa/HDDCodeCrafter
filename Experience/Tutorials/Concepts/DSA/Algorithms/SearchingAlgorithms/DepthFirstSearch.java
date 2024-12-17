package Experience.Tutorials.Concepts.DSA.Algorithms.SearchingAlgorithms;

/*
Purpose:
DFS is used to traverse or search in a graph or tree structure by exploring as far as possible along each branch before backtracking.
It is used to solve various graph-related problems efficiently.

Contextual Explanation:
In a bookstore genre connections graph, DFS can be used to find if a specific genre is reachable from the starting genre, exploring related genres deeply before moving to the next.
 */


import java.util.*;

public class DepthFirstSearch {

    public static void main(String[] args) {
        Map<String, List<String>> genreConnections = new HashMap<>();
        genreConnections.put("Programming", Arrays.asList("Algorithms", "Java Programming"));
        genreConnections.put("Algorithms", Collections.singletonList("Data Structures and Algorithms"));

        String targetGenre = "Data Structures and Algorithms";
        boolean found = dfsSearch(genreConnections, "Programming", targetGenre);

        if (found) {
            System.out.println(targetGenre + " found in the genre connections.");
        } else {
            System.out.println(targetGenre + " not found in the genre connections.");
        }
    }

    public static boolean dfsSearch(Map<String, List<String>> graph, String start, String target) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (current.equals(target)) {
                return true;
            }

            for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
}