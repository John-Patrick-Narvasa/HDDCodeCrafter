package Experience.Tutorials.Concepts.DSA;


import java.util.*;

public class GroceryStoreRouteOptimizer {

    private static int[][] distances = {
            {0, 10, 15, 20},  // Distances from Store 0 to other stores
            {10, 0, 35, 25},  // Distances from Store 1 to other stores
            {15, 35, 0, 30},  // Distances from Store 2 to other stores
            {20, 25, 30, 0}   // Distances from Store 3 to other stores
    };

    private static int numStores = distances.length;

    public static void main(String[] args) {
        List<Integer> storesToVisit = new ArrayList<>();
        for (int i = 0; i < numStores; i++) {
            storesToVisit.add(i);
        }

        List<Integer> optimalRoute = findOptimalRoute(storesToVisit);
        
        System.out.println("Optimal Route to Visit Grocery Stores:");
        for (int store : optimalRoute) {
            System.out.println("Store " + store);
        }
    }

    private static List<Integer> findOptimalRoute(List<Integer> stores) {
        List<Integer> optimalRoute = new ArrayList<>();
        int[] minDistance = {Integer.MAX_VALUE};
        findOptimalRouteHelper(stores, 0, new ArrayList<>(), minDistance, optimalRoute);
        return optimalRoute;
    }

    private static void findOptimalRouteHelper(List<Integer> stores, int currentStore, List<Integer> route,
                                               int[] minDistance, List<Integer> optimalRoute) {
        if (route.size() == numStores) {
            int totalDistance = calculateTotalDistance(route);
            if (totalDistance < minDistance[0]) {
                minDistance[0] = totalDistance;
                optimalRoute.clear();
                optimalRoute.addAll(route);
            }
        } else {
            for (int i = 0; i < stores.size(); i++) {
                int nextStore = stores.get(i);
                if (!route.contains(nextStore)) {
                    route.add(nextStore);
                    findOptimalRouteHelper(stores, nextStore, route, minDistance, optimalRoute);
                    route.remove(route.size() - 1);
                }
            }
        }
    }

    private static int calculateTotalDistance(List<Integer> route) {
        int totalDistance = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            totalDistance += distances[route.get(i)][route.get(i + 1)];
        }
        totalDistance += distances[route.get(route.size() - 1)][route.get(0)];  // Return to starting store
        return totalDistance;
    }
}
