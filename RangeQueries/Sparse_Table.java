//Sparse Table for RMQ(Range Minimum Query)

public class Sparse_Table{
    static int[][] mat;
    public static void main(String args[])
    {
        int n = 6;
        int arr[] = {4,6,1,5,7,3};
        int k = (int) (Math.log(n)/Math.log(2) + 1);
        mat = new int[n][k];
        build_table(arr,n,k);
        int i,j;

        System.out.println(query(0,5));
        System.out.println(query(1,4));
        System.out.println(query(3,5));
    }

    static void build_table(int arr[],int n,int k){
        int i,j;

        for(i=0;i<n;i++)
            mat[i][0] = arr[i];
        
        for(j=1;j<k;j++)
        {
            int b = (1<<j) - 1;
            for(i=0;i+b<n;i++)
            {
                mat[i][j] = Math.min(mat[i][j-1],mat[i+(1<<(j-1))][j-1]);
            }
        }
    }

    static int query(int l,int r){
        if(l>r)
            return Integer.MAX_VALUE;
        
        int k =(int) (Math.log(r-l+1)/Math.log(2));
        int p = l+(1<<k);
        return Math.min(mat[l][k],query(p,r));
    }

}