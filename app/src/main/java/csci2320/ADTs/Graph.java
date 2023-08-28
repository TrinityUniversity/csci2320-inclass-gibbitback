package csci2320.ADTs;

import java.util.List;

public class Graph {
    static int[][] matrix = {
        {1,1,1,0},
        {0,0,1,1},
        {0,0,0,1},
        {0,1,0,0}
    };

    static List<List<Integer>> adjList = List.of(
        List.of(0,1,2),
        List.of(2,3),
        List.of(3),
        List.of(1)
    );

    public static int recursiveDFSShort(int current, List<List<Integer>> adj, int end) {
        if (current == end){
            return 0;
        }else{
            int min =Integer.MAX_VALUE
            recursiveDFSShort(current,adj,end);)
        }
        return 0;
    }
}
