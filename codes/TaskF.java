package codes;

import DS.DisjointSet;
import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskF {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        Vertex arr[] = new Vertex[n+1];
        int i,j;
        arr[0] = new Vertex(0,0);
        for(i=1;i<=n;i++)
        {
            arr[i] = new Vertex(i,in.nextLong());
        }

        Arrays.sort(arr);

        DisjointSet ds = new DisjointSet();

        for(i=1;i<=n;i++)
        {
            ds.makeSet(i);
        }

        long mat[][] = new long[m][3];

        for(i=0;i<m;i++)
        {
            mat[i][0] = in.nextLong();
            mat[i][1] = in.nextLong();
            mat[i][2] = in.nextLong();
        }

        Arrays.sort(mat,new Sort());

       /* for(i=0;i<n;i++)
        {
            out.println(arr[i].number + " " + arr[i].cost);
        }*/

        long ans = 0;
        i=2;
        j=0;
        long k = arr[1].cost;
        while(i<=n)
        {
            long l = k + arr[i].cost;
            if(j<m && mat[j][2] < l)
            {
                if(ds.findSet(mat[j][0]) == ds.findSet(mat[j][1]))
                {
                    j++;
                    continue;
                }
                ans += mat[j][2];
                ds.union(mat[j][0],mat[j][1]);
                j++;
            }
            else
            {
                if(ds.findSet(arr[1].number) == ds.findSet(arr[i].number))
                {
                    i++;
                    continue;
                }
                ans += l;
                ds.union(arr[1].number,arr[i].number);
                i++;
            }
            //System.out.println(ans);
        }

        out.println(ans);
    }

    class Vertex implements Comparable<Vertex>{
        int number;
        long cost;

        public Vertex (int t,long c){
            number = t;
            cost = c;
        }

        @Override
        public int compareTo(Vertex e1){
            if(cost>=e1.cost)
                return 1;
            else
                return -1;
        }

    }

    class Sort implements Comparator<long[]>{
        @Override
        public int compare(long[] o1, long[]o2){
            if(o1[2]>=o2[2])
                return 1;
            else
                return -1;
        }
    }
}
