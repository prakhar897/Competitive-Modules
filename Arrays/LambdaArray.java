package Library.Arrays;

import java.util.*;

public class LambdaArray{

	static int[][] lambda(int[] a){
		int n = a.length;
		int mat[][] = new int[a.length][2];
		for(int i=0;i<n;i++)
		{
			mat[i][0] = i;
			mat[i][1] = a[i];
		}

		Arrays.sort(mat,new customsort());
		return mat;
	}

	static long[][] lambda(long[] a){
        int n = a.length;
        long mat[][] = new long[a.length][2];
        for(int i=0;i<n;i++)
        {
            mat[i][0] = i;
            mat[i][1] = a[i];
        }

        Arrays.sort(mat,new customsort2());
        return mat;
    }

	static class customsort implements Comparator<int[]>{
        @Override
        public int compare(int[]a,int[]b){
            if(a[1]>b[1])
                return 1;
            else if(a[1] == b[1])
                return 0;
            else
                return -1;
        }
    }

    static class customsort2 implements Comparator<long[]>{
        @Override
        public int compare(long[]a,long[]b){
            if(a[1]>b[1])
                return 1;
            else if(a[1] == b[1])
                return 0;
            else
                return -1;
        }
    }

}