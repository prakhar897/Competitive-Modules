package Library.Algorithms;

import java.io.*;
import java.util.*;

public class DisjointSet {

	class Node {
        long data;
        Node parent;
        int rank;
    }

    public DisjointSet(int p,int n){
	    for(int i=p;i<=n;i++)
        {
            makeSet(i);
        }
    }

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

    public long findParent(long data){
        return findSet(data).data;
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

