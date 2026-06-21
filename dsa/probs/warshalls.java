public class warshalls {
    final static int v=4;
    final static int inf = 99999;
// all pairs shortest path used to find the shortest path btw the vertices
    public static void print(int dist[][]){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(dist[i][j]==inf){
                    System.out.print("inf ");
                }
                else{
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void warshalls(int graph[][]){
        int [][] dist = new int[v][v];
        int i,j,k;
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                dist[i][j]=graph[i][j];
            }
        }
        for(k=0;k<v;k++){
            for(i=0;i<v;i++){
                for(i=0;i<v;i++){
                    for(j=0;j<v;j++){
                        if(dist[i][k]!=inf && dist[k][j]!=inf && dist[i][j]>dist[i][k]+dist[k][j]){
                            dist[i][j]=dist[i][k]+dist[k][j];
                        }
                    }
                }
            }
        }
        print(dist);
    }

    public static void main(String[] args) {
        int [][] graph=new int[][]{
            {0,9,-4,inf},
            {6,0,inf,2},
            {inf,5,0,inf},
            {inf,inf,1,0}
        };
        warshalls(graph);
    }
}
