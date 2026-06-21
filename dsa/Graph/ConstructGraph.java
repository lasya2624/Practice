package Graph;

import java.util.ArrayList;

public class ConstructGraph {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        int[][] edges = {
            {1,2},
            {0,1},
            {2,3},
            {3,0},
            {3,4}
        };
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v); // in 1 stores 3
            graph.get(v).add(u); // in 3 stores 1
        }

        // System.out.println(graph);

        for(int i=0;i<n;i++){
            System.out.print(i + " -> ");
            for(int neighbor : graph.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}