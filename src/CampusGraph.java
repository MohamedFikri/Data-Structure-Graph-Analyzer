import java.util.*;

/** Undirected campus road network represented by an adjacency list. */
public class CampusGraph {
    private final Map<String, Set<String>> adjacency = new LinkedHashMap<>();

    public boolean addVertex(String location) {
        location = clean(location);
        if (location.isEmpty() || adjacency.containsKey(location)) return false;
        adjacency.put(location, new LinkedHashSet<>());
        return true;
    }

    public boolean addEdge(String from, String to) {
        from = clean(from);
        to = clean(to);
        if (!adjacency.containsKey(from) || !adjacency.containsKey(to) || from.equals(to)) return false;
        if (!adjacency.get(from).add(to)) return false;
        adjacency.get(to).add(from);
        return true;
    }

    public boolean removeEdge(String from, String to) {
        from = clean(from);
        to = clean(to);
        if (!adjacency.containsKey(from) || !adjacency.containsKey(to)) return false;
        if (!adjacency.get(from).remove(to)) return false;
        adjacency.get(to).remove(from);
        return true;
    }

    public boolean removeVertex(String location) {
        location = clean(location);
        if (!adjacency.containsKey(location)) return false;
        for (String neighbor : adjacency.get(location)) adjacency.get(neighbor).remove(location);
        adjacency.remove(location);
        return true;
    }

    public void displayGraph() {
        if (adjacency.isEmpty()) {
            System.out.println("Campus graph is empty.");
            return;
        }
        System.out.println("\nCampus connections:");
        adjacency.forEach((location, neighbors) -> System.out.println(location + " -> " + neighbors));
    }

    public List<String> bfsTraversal(String start) {
        start = clean(start);
        List<String> order = new ArrayList<>();
        if (!adjacency.containsKey(start)) return order;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        visited.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            String current = queue.remove();
            order.add(current);
            for (String neighbor : adjacency.get(current)) {
                if (visited.add(neighbor)) queue.add(neighbor);
            }
        }
        return order;
    }

    public List<String> dfsTraversal(String start) {
        start = clean(start);
        List<String> order = new ArrayList<>();
        if (adjacency.containsKey(start)) dfsVisit(start, new HashSet<>(), order);
        return order;
    }

    private void dfsVisit(String current, Set<String> visited, List<String> order) {
        visited.add(current);
        order.add(current);
        for (String neighbor : adjacency.get(current)) {
            if (!visited.contains(neighbor)) dfsVisit(neighbor, visited, order);
        }
    }

    private String clean(String s) { return s == null ? "" : s.trim(); }
}
