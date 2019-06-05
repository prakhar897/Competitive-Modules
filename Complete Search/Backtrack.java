import java.util.ArrayList;

class Backtrack{
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4};
        ArrayList<Integer> curstack = new ArrayList<>();
        recurse(arr,curstack,0);

        for(int i=0;i<ans.size();i++)
            System.out.println(ans.get(i));
    }

    static void recurse(int arr[],ArrayList<Integer> curStack,int index){
        ArrayList<Integer> newStack = new ArrayList<>(curStack);
        ans.add(newStack);
        //System.out.println(curStack);
        for(int i=index;i<arr.length;i++)
        {
            curStack.add(arr[i]);
            recurse(arr,curStack,i+1);
            curStack.remove(curStack.size()-1);
        }
    }
}