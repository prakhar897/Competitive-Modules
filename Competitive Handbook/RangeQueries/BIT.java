class BIT{
    static int tree[];
    public static void main(String args[]){
        int arr[] = {1,3,4,8,6,1,4,2};
        int n = arr.length;
        tree = new int[n+1];
        int i;

        for(i=1;i<=n;i++)
            add(i,arr[i-1],n);
        
        System.out.println(sum(4) - sum(2)); //Query from (3,4) = (1,4) - (1,2)
    }

    static void add(int k,int x,int n){
        while(k<=n)
        {
            tree[k] += x;
            k += k & -k;
        }
    }

    static int sum(int k) {
        int s = 0;
        while (k >= 1) {
        s += tree[k];
        k -= k&-k;
        }
        return s;
    }
}