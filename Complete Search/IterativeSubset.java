import java.util.*;

class IterativeSubset{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int n = arr.length;
		ArrayList<Integer> cur = new ArrayList<>();
		int size = (int) Math.pow(2,n);
		int i,j;
		for(i=0;i<size;i++)
		{
			cur = new ArrayList<>();
			for(j=0;j<n;j++)
			{
				if((i&(1<<j)) > 0)
					cur.add(arr[j]);
			}
			ans.add(cur);
		}

		for(i=0;i<ans.size();i++)
			System.out.println(ans.get(i));
	}	
}

//Complexity = O(n*2^n)