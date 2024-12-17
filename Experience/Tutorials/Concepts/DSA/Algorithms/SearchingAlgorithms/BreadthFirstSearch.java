package Experience.Tutorials.Concepts.DSA.Algorithms.SearchingAlgorithms;


/*
Purpose:
BFS explores all the neighbor nodes at the present depth prior to moving on to nodes at the next depth level.
It is useful for finding the shortest path or the minimum number of steps required to reach a target.

Contextual Explanation:
In a bookstore genre connections graph, BFS can be used to find if a specific genre is reachable from the starting genre, exploring related genres level by level to determine the shortest path.
 */
import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<String, List<String>> genreConnections = new HashMap<>();
        genreConnections.put("Programming", Arrays.asList("Algorithms", "Java Programming"));
        genreConnections.put("Algorithms", Collections.singletonList("Data Structures and Algorithms"));

        String targetGenre = "Data Structures and Algorithms";
        boolean found = bfsSearch(genreConnections, "Programming", targetGenre);

        if (found) {
            System.out.println(targetGenre + " found in the genre connections.");
        } else {
            System.out.println(targetGenre + " not found in the genre connections.");
        }
    }

    public static boolean bfsSearch(Map<String, List<String>> graph, String start, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(target)) {
                return true;
            }

            for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
}