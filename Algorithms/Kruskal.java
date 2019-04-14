package Library.Algorithms;

import java.io.*;
import java.util.*;

public class Kruskal{
	public ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

	 public void mst(int n,int[][] mat){
		Arrays.sort(mat,new Sort());
		DisjointSet ds = new DisjointSet(1,n);
		for(int i=0;i<mat.length;i++)
		{
			if(ds.findSet(mat[i][0]) != ds.findSet(mat[i][1]))
			{
				ds.union(mat[i][0],mat[i][1]);
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(mat[i][0]);
				arr.add(mat[i][1]);
				arr.add(mat[i][2]);
				ans.add(arr);
			}
		}
	}
}

class Sort implements Comparator<int[]>{
	@Override
	public int compare(int []o1,int[] o2){
		return o1[2]-o2[2];
	}
}