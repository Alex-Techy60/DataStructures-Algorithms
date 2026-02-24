import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int weight;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
    }
    public static void create(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 7, 1));

        graph[6].add(new Edge(6, 5, 1));

        graph[7].add(new Edge(7, 5, 1));
        
    }
    public static void bfs(ArrayList<Edge>[] graph, int v){
        Queue<Integer> q = new LinkedList();
        boolean[] visited = new boolean[v];
        q.add(0);
        while(!(q.isEmpty())){
            int curr = q.remove();
            if(!(visited[curr])){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        if(visited[curr]){
            return;
        }
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, visited);
        }
    }
    public static void allPaths(ArrayList<Edge>[] graph, int curr, boolean[] visited, int destination, String path){
        if(curr == destination){
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!(visited[e.dest])){
                visited[e.dest] = true;
                allPaths(graph, e.dest, visited, destination, path + " -> " + e.dest);
                visited[e.dest] = false;
            }
        }
    }
    public static boolean isCyclicDirected(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack){
        visited[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            } else if(!visited[e.dest] && isCyclicDirected(graph, e.dest, visited, stack)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int v = 8;
        ArrayList<Edge>[] graph = new ArrayList[v];
        create(graph);
        bfs(graph, v);
        dfs(graph, 0, new boolean[v]);
        System.out.println();

        allPaths(graph, 0, new boolean[]{true, false, false, false, false, false, false, false}, 5, "0");

        boolean isCyclic = false;
        for(int i=0; i<graph.length && !(isCyclic); i++){

            isCyclic = isCyclicDirected(graph, i, new boolean[v], new boolean[v]);
        }
        System.out.println(isCyclic);
    }
}
