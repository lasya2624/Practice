public class warshalltrasitiveclosure {
    final static int v=4;
    public static void warshalls(int graph[][]){
        int i,j,k;
        int [][] reach=new int[v][v];
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                reach[i][j]=graph[i][j];
            }
        }
        for(k=0;k<v;k++){
            for(i=0;i<v;i++){
                for(j=0;j<v;j++){
                    if(reach[i][j]==0 && reach[i][k]!=0 && reach[k][j]!=0){
                        reach[i][j]=1;
                    }
                }
            }
        }
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                System.out.print(reach[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]graph =new int[][]{
            {1,1,0,1},
            {0,1,1,0},
            {0,0,1,1},
            {0,0,0,1}
        };
        warshalls(graph);

    }
}
