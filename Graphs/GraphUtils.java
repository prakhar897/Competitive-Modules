package Library.Graphs;
import java.util.*;

public class GraphUtils {
    public static ArrayList<Integer>[] nextU(int n, int m,int in[],int out[],boolean oneIndexed) {

        ArrayList<Integer> adj[] = new ArrayList[n+1];
        int i;
        for(i=0;i<=n;i++)
        {
            adj[i] = new ArrayList<>();
        }

        for(i=0;i<m;i++)
        {
            int a = in[i];
            int b = out[i];
            adj[a].add(b);
            adj[b].add(a);
        }

        return adj;

        //Add one indexing
        //Add longs instead of ints
    }

}