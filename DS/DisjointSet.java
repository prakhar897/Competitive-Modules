package DS;

import java.io.*;
import java.util.*;
 class Node {
        long data;
        Node parent;
        int rank;
    }

public class DisjointSet {

    private Map<Long, Node> map = new HashMap<>();

    public void makeSet(long data) {
        Node node = new Node();
        node.data = data;
        node.parent = node;
        node.rank = 1;
        map.put(data, node);
    }

    public boolean union(long data1, long data2) {
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);

        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);

        if (parent1.data == parent2.data) {
            return false;
        }
        else
        {
            parent2.parent = parent1;
            parent1.rank += parent2.rank;
            parent2.rank = 0;
        }
        return true;
    }
    
    public Node findSet(long data) {
        return findSet(map.get(data));
    }

    private Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) {
            return parent;
        }
        node.parent = findSet(node.parent);
        return node.parent;
    }

}

/*class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        DisjointSet ds = new DisjointSet();
        int i;
        for(i=1;i<=n;i++)
            ds.makeSet(i);
        for(i=0;i<q;i++)
        {
            String c = in.next();
            if(c.charAt(0) == 'M')
            {
                long d1 = in.nextLong();
                long d2 = in.nextLong();
                ds.union(d1,d2);
            }
            else
            {
                long d1 = in.nextLong();
                Node a = ds.findSet(d1);
                System.out.println(a.rank);
            }
        }
            
    }
}*/

